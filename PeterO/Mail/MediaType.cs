/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */
using System;
using System.Collections.Generic;
using System.Text;

using PeterO;
using PeterO.Mail.Transforms;
using PeterO.Text;

namespace PeterO.Mail {
    /// <include file='docs.xml'
    /// path='docs/doc[@name="T:PeterO.Mail.MediaType"]'/>
  public sealed class MediaType {
    private string topLevelType;

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.TopLevelType"]'/>
    public string TopLevelType {
      get {
        return this.topLevelType;
      }
    }

    #region Equals and GetHashCode implementation
    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.Equals(System.Object)"]'/>
    public override bool Equals(object obj) {
      var other = obj as MediaType;
      if (other == null) {
        return false;
      }
      return this.topLevelType.Equals(other.topLevelType) &&
        this.subType.Equals(other.subType) &&
          CollectionUtilities.MapEquals(this.parameters, other.parameters);
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.GetHashCode"]'/>
    public override int GetHashCode() {
      var hashCode = 632580499;
        if (this.topLevelType != null) {
  hashCode = unchecked(hashCode + 632580503 *
            this.topLevelType.GetHashCode());
        }
        if (this.subType != null) {
       hashCode = unchecked(hashCode + 632580563 *
            this.subType.GetHashCode());
        }
        if (this.parameters != null) {
          hashCode = unchecked(hashCode + 632580587 * this.parameters.Count);
        }
      return hashCode;
    }
    #endregion

    private string subType;

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.SubType"]'/>
    public string SubType {
      get {
        return this.subType;
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.IsText"]'/>
    public bool IsText {
      get {
        return this.TopLevelType.Equals("text");
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.IsMultipart"]'/>
    public bool IsMultipart {
      get {
        return this.TopLevelType.Equals("multipart");
      }
    }

    internal MediaType(
string type,
 string subtype,
 IDictionary<string,
      string> parameters) {
      this.topLevelType = type;
      this.subType = subtype;
      this.parameters = new SortedMap<string, string>(parameters);
    }

    private SortedMap<string, string> parameters;

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.Parameters"]'/>
    public IDictionary<string, string> Parameters {
      get {
        return new ReadOnlyMap<string, string>(this.parameters);
      }
    }

    internal enum QuotedStringRule {
    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.QuotedStringRule.Http"]'/>
      Http,

    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.QuotedStringRule.Rfc5322"]'/>
      Rfc5322
    }

    private static int skipQtextOrQuotedPair(
      string s,
      int index,
      int endIndex,
      QuotedStringRule rule) {
      if (index >= endIndex) {
        return index;
      }
      int i2;
      if (rule == QuotedStringRule.Http) {
        char c = s[index];
        // NOTE: Space and tab were handled earlier;
        // bytes higher than 0x7f are part of obs-text
        if (c < 0x100 && c >= 0x21 && c != 0x7F && c != '\\' && c != '"') {
          return index + 1;
        }
        i2 = skipQuotedPair(s, index, endIndex);
        return i2;
      }
      if (rule == QuotedStringRule.Rfc5322) {
        i2 = index;
        // qtext (RFC5322 sec. 3.2.1)
        if (i2 < endIndex) {
          char c = s[i2];
          // Non-ASCII (allowed in internationalized email headers under
          // RFC6532)
          if ((c & 0xfc00) == 0xd800 && i2 + 1 < endIndex && s[i2 + 1] >=
            0xdc00 && s[i2 + 1] <= 0xdfff) {
            i2 += 2;
          } else if ((c & 0xf800) == 0xd800) {
            // unchanged; it's a bare surrogate
          } else if (c >= 0x80) {
            ++i2;
          }
          if (c >= 33 && c <= 126 && c != '\\' && c != '"') {
            ++i2;
          }
          // obs-qtext (same as obs-ctext)
          if ((c < 0x20 && c != 0x00 && c != 0x09 && c != 0x0a && c != 0x0d) ||
            c == 0x7f) {
            ++i2;
          }
        }
        if (index != i2) {
          return i2;
        }
        index = i2;
        i2 = HeaderParser.ParseQuotedPair(s, index, endIndex, null);
        return i2;
      }
      throw new ArgumentException(rule.ToString());
    }

    // quoted-pair (RFC5322 sec. 3.2.1)
    internal static int skipQuotedPair(string s, int index, int endIndex) {
      if (index + 1 < endIndex && s[index] == '\\') {
        char c = s[index + 1];
        // Non-ASCII (allowed in internationalized email headers under RFC6532)
        if ((c & 0xfc00) == 0xd800 && index + 2 < endIndex && s[index + 2]
          >= 0xdc00 && s[index + 2] <= 0xdfff) {
          return index + 3;
        }
        if ((c & 0xf800) == 0xd800) {
          return index;
        }
        if (c >= 0x80) {
          return index + 2;
        }
        if (c == 0x20 || c == 0x09 || (c >= 0x21 && c <= 0x7e)) {
          return index + 2;
        }
        // obs-qp
        if ((c < 0x20 && c != 0x09) || c == 0x7f) {
          return index + 2;
        }
      }
      return index;
    }

    // quoted-string (RFC5322 sec. 3.2.4)
    internal static int skipQuotedString(
string s,
int index,
int endIndex,
StringBuilder builder) {
return skipQuotedString(
s,
index,
endIndex,
builder,
QuotedStringRule.Rfc5322);
    }

    private static int ParseFWSLax(
string str,
int index,
int endIndex,
StringBuilder sb) {
      while (index < endIndex) {
        int tmp = index;
        // Skip CRLF
        if (index + 1 < endIndex && str[index] == 13 && str[index + 1] == 10) {
          index += 2;
        }
        // Add WSP
        if (index < endIndex && ((str[index] == 32) || (str[index] == 9))) {
          if (sb != null) {
            sb.Append(str[index]);
          }
          ++index;
        } else {
          return tmp;
        }
      }
      return index;
    }
    private static int skipQuotedString(
string str,
int index,
int endIndex,
StringBuilder builder,  // receives the unescaped version of the string
QuotedStringRule rule) {
      int startIndex = index;
      int valueBLength = (builder == null) ? 0 : builder.Length;
      index = (rule != QuotedStringRule.Rfc5322) ? index :
        HeaderParser.ParseCFWS(str, index, endIndex, null);
      if (!(index < endIndex && str[index] == '"')) {
        if (builder != null) {
          builder.Length = valueBLength;
        }
        return startIndex;  // not a valid quoted-string
      }
      ++index;
      while (index < endIndex) {
        int i2 = index;
        if (rule == QuotedStringRule.Http) {
          if (str[index] == ' ' || str[index] == '\t') {
            if (builder != null) {
              builder.Append(str[index]);
            }
            ++index;
            continue;
          }
        } else if (rule == QuotedStringRule.Rfc5322) {
          // Skip tabs, spaces, and folding whitespace
          i2 = ParseFWSLax(str, index, endIndex, builder);
        }
        index = i2;
        char c = str[index];
        if (c == '"') { // end of quoted-string
          ++index;
          // NOTE: Don't skip CFWS even if the rule is Rfc5322
          return index;
        }
        int oldIndex = index;
        index = skipQtextOrQuotedPair(str, index, endIndex, rule);
        if (index == oldIndex) {
          if (builder != null) {
            builder.Remove(valueBLength, (builder.Length)-valueBLength);
          }
          return startIndex;
        }
        if (builder != null) {
          // this is a qtext or quoted-pair, so
          // append the last character read
          builder.Append(str[index - 1]);
        }
      }
      if (builder != null) {
        builder.Remove(valueBLength, (builder.Length)-valueBLength);
      }
      return startIndex;  // not a valid quoted-string
    }

    private static void ReverseChars(char[] chars, int offset, int length) {
      int half = length >> 1;
      int right = offset + length - 1;
      for (var i = 0; i < half; i++, right--) {
        char value = chars[offset + i];
        chars[offset + i] = chars[right];
        chars[right] = value;
      }
    }

    private static string valueDigits = "0123456789";

    private static string IntToString(int value) {
      if (value == Int32.MinValue) {
        return "-2147483648";
      }
      if (value == 0) {
        return "0";
      }
      bool neg = value < 0;
      var chars = new char[24];
      var count = 0;
      if (neg) {
        chars[0] = '-';
        ++count;
        value = -value;
      }
      while (value != 0) {
        char digit = valueDigits[(int)(value % 10)];
        chars[count++] = digit;
        value /= 10;
      }
      if (neg) {
        ReverseChars(chars, 1, count - 1);
      } else {
        ReverseChars(chars, 0, count);
      }
      return new String(chars, 0, count);
    }

    private static void AppendComplexParamValue(
string name,
string str,
StringBuilder sb) {
      var length = 1;
      var contin = 0;
      const string ValueHex = "0123456789ABCDEF";
      length += name.Length + 12;
      const int MaxLength = 76;
      if (sb.Length + name.Length + 9 + (str.Length * 3) <= MaxLength) {
        // Very short
        length = sb.Length + name.Length + 9;
        sb.Append(name + "*=utf-8''");
      } else if (length + (str.Length * 3) <= MaxLength) {
        // Short enough that no continuations
        // are needed
        length -= 2;
        sb.Append(name + "*=utf-8''");
      } else {
        sb.Append(name + "*0*=utf-8''");
      }
      var first = true;
      var index = 0;
      while (index < str.Length) {
        int c = str[index];
        if ((c & 0xfc00) == 0xd800 && index + 1 < str.Length &&
            str[index + 1] >= 0xdc00 && str[index + 1] <= 0xdfff) {
          // Get the Unicode code point for the surrogate pair
          c = 0x10000 + ((c - 0xd800) << 10) + (str[index + 1] - 0xdc00);
          ++index;
        } else if ((c & 0xf800) == 0xd800) {
          // unpaired surrogate
          c = 0xfffd;
        }
        ++index;
      if (c >= 33 && c <= 126 && "()<>,;[]:@\"\\/?=*%'"
        .IndexOf((char)c) < 0) {
          ++length;
          if (!first && length + 1 > MaxLength) {
            sb.Append(";\r\n ");
            first = true;
            ++contin;
            string continString = name + "*" + IntToString(contin) + "*=";
            sb.Append(continString);
            length = 1 + continString.Length;
            ++length;
          }
          first = false;
          sb.Append((char)c);
        } else if (c < 0x80) {
          length += 3;
          if (!first && length + 1 > MaxLength) {
            sb.Append(";\r\n ");
            first = true;
            ++contin;
            string continString = name + "*" + IntToString(contin) +
              "*=";
            sb.Append(continString);
            length = 1 + continString.Length;
            length += 3;
          }
          first = false;
          sb.Append('%');
          sb.Append(ValueHex[(c >> 4) & 15]);
          sb.Append(ValueHex[c & 15]);
        } else if (c < 0x800) {
          length += 6;
          if (!first && length + 1 > MaxLength) {
            sb.Append(";\r\n ");
            first = true;
            ++contin;
            string continString = name + "*" + IntToString(contin) +
              "*=";
            sb.Append(continString);
            length = 1 + continString.Length;
            length += 6;
          }
          first = false;
          int w = (byte)(0xc0 | ((c >> 6) & 0x1f));
          int x = (byte)(0x80 | (c & 0x3f));
          sb.Append('%');
          sb.Append(ValueHex[(w >> 4) & 15]);
          sb.Append(ValueHex[w & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(x >> 4) & 15]);
          sb.Append(ValueHex[x & 15]);
        } else if (c < 0x10000) {
          length += 9;
          if (!first && length + 1 > MaxLength) {
            sb.Append(";\r\n ");
            first = true;
            ++contin;
            string continString = name + "*" + IntToString(contin) +
              "*=";
            sb.Append(continString);
            length = 1 + continString.Length;
            length += 9;
          }
          first = false;
          int w = (byte)(0xe0 | ((c >> 12) & 0x0f));
          int x = (byte)(0x80 | ((c >> 6) & 0x3f));
          int y = (byte)(0x80 | (c & 0x3f));
          sb.Append('%');
          sb.Append(ValueHex[(w >> 4) & 15]);
          sb.Append(ValueHex[w & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(x >> 4) & 15]);
          sb.Append(ValueHex[x & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(y >> 4) & 15]);
          sb.Append(ValueHex[y & 15]);
        } else {
          length += 12;
          if (!first && length + 1 > MaxLength) {
            sb.Append(";\r\n ");
            first = true;
            ++contin;
            string continString = name + "*" + IntToString(contin) + "*=";
            sb.Append(continString);
            length = 1 + continString.Length;
            length += 12;
          }
          first = false;
          int w = (byte)(0xf0 | ((c >> 18) & 0x07));
          int x = (byte)(0x80 | ((c >> 12) & 0x3f));
          int y = (byte)(0x80 | ((c >> 6) & 0x3f));
          int z = (byte)(0x80 | (c & 0x3f));
          sb.Append('%');
          sb.Append(ValueHex[(w >> 4) & 15]);
          sb.Append(ValueHex[w & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(x >> 4) & 15]);
          sb.Append(ValueHex[x & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(y >> 4) & 15]);
          sb.Append(ValueHex[y & 15]);
          sb.Append('%');
          sb.Append(ValueHex[(z >> 4) & 15]);
          sb.Append(ValueHex[z & 15]);
        }
      }
    }

    private static bool AppendSimpleParamValue(
string name,
string str,
StringBuilder sb) {
      sb.Append(name);
      sb.Append('=');
      if (str.Length == 0) {
        sb.Append("\"\"");
        return true;
      }
      var simple = true;
      for (int i = 0; i < str.Length; ++i) {
        char c = str[i];
        if (!(c >= 33 && c <= 126 && "()<>,;[]:@\"\\/?=".IndexOf(c) < 0)) {
          simple = false;
        }
      }
      if (simple) {
        sb.Append(str);
        return true;
      }
      sb.Append('"');
      for (int i = 0; i < str.Length; ++i) {
        char c = str[i];
        if (c >= 32 && c <= 126 && c != '\\' && c != '"') {
          sb.Append(c);
        } else if (c == 0x20 || c == 0x09 || c == '\\' || c == '"') {
          sb.Append('\\');
          sb.Append(c);
        } else {
          // Requires complex encoding
          return false;
        }
      }
      sb.Append('"');
      return true;
    }

    internal static int LastLineStart(StringBuilder sb) {
      string valueSbString = sb.ToString();
      for (int i = sb.Length - 1; i >= 0; --i) {
        if (valueSbString[i] == '\n') {
          return i + 1;
        }
      }
      return 0;
    }

    internal static void AppendParameters(
IDictionary<string, string>
      parameters,
 StringBuilder sb) {
      var tmp = new StringBuilder();
      foreach (string key in parameters.Keys) {
        int lineIndex = LastLineStart(sb);
        string name = key;
        string value = parameters[key];
        sb.Append(';');
        tmp.Length = 0;
        if (!AppendSimpleParamValue(name, value, tmp)) {
          tmp.Length = 0;
          AppendComplexParamValue(name, value, tmp);
       if ((sb.Length - lineIndex) + tmp.Length > (lineIndex == 0 ? 76 :
            75)) {
            sb.Append("\r\n ");
          }
          sb.Append(tmp);
        } else {
       if ((sb.Length - lineIndex) + tmp.Length > (lineIndex == 0 ? 76 :
            75)) {
            sb.Append("\r\n ");
          }
          sb.Append(tmp);
        }
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.ToString"]'/>
    public override string ToString() {
      var sb = new StringBuilder();
      sb.Append(this.topLevelType);
      sb.Append('/');
      sb.Append(this.subType);
      AppendParameters(this.parameters, sb);
      return sb.ToString();
    }

    internal static int SkipMimeToken(
string str,
int index,
int endIndex,
StringBuilder builder,
bool httpRules) {
      int i = index;
      const string ValueSpecials = "()<>@,;:\\\"/[]?=";
      while (i < endIndex) {
        char c = str[i];
        if (c <= 0x20 || c >= 0x7f || (c == (c & 0x7f) &&
           ValueSpecials.IndexOf(c) >= 0)) {
          break;
        }
        if (httpRules && (c == '{' || c == '}')) {
          break;
        }
        if (builder != null) {
          builder.Append(c);
        }
        ++i;
      }
      return i;
    }

    internal static int SkipAttributeNameRfc2231(
      string str,
      int index,
      int endIndex,
      StringBuilder builder,
      bool httpRules) {
      if (httpRules) {
        return SkipMimeToken(str, index, endIndex, builder, httpRules);
      }
      int i = index;
      while (i < endIndex) {
        char c = str[i];
        if (c <= 0x20 || c >= 0x7f || ((c & 0x7f) == c &&
          "()<>@,;:\\\"/[]?='%*" .IndexOf(c) >= 0)) {
          break;
        }
        if (builder != null) {
          builder.Append(c);
        }
        ++i;
      }
      if (i + 1 < endIndex && str[i] == '*' && str[i + 1] == '0') {
        // initial-section
        i += 2;
        if (builder != null) {
          builder.Append("*0");
        }
        if (i < endIndex && str[i] == '*') {
          ++i;
          if (builder != null) {
            builder.Append("*");
          }
        }
        return i;
      }
      if (i + 1 < endIndex && str[i] == '*' && str[i + 1] >= '1' && str[i +
        1] <= '9') {
        // other-sections
        if (builder != null) {
          builder.Append('*');
          builder.Append(str[i + 1]);
        }
        i += 2;
        while (i < endIndex && str[i] >= '0' && str[i] <= '9') {
          if (builder != null) {
            builder.Append(str[i]);
          }
          ++i;
        }
        if (i < endIndex && str[i] == '*') {
          if (builder != null) {
            builder.Append(str[i]);
          }
          ++i;
        }
        return i;
      }
      if (i < endIndex && str[i] == '*') {
        if (builder != null) {
          builder.Append(str[i]);
        }
        ++i;
      }
      return i;
    }

    internal static int skipMimeTypeSubtype(
string str,
int index,
int endIndex,
StringBuilder builder) {
      int i = index;
      var count = 0;
      while (i < endIndex) {
        char c = str[i];
        // See RFC6838
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' &&
          c <= '9')) {
          if (builder != null) {
            builder.Append(c);
          }
          ++i;
          ++count;
    } else if (count > 0 && (c == (c & 0x7F) && "!#$&-^_.+" .IndexOf(c) >=
          0)) {
          if (builder != null) {
            builder.Append(c);
          }
          ++i;
          ++count;
        } else {
          break;
        }
        // type or subtype too long
        if (count > 127) {
          return index;
        }
      }
      return i;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.GetCharset"]'/>
    #if CODE_ANALYSIS
    [System.Diagnostics.CodeAnalysis.SuppressMessage(
      "Microsoft.Design", "CA1024",
Justification="This method has different semantics from " +
        "GetParameter(\"charset\").")]
    #endif
    public string GetCharset() {
      // NOTE: RFC6657 changed the rules for the default charset in text
      // media types,
      // so that there is no default charset for as yet undefined media
      // types. However,
      // media types defined before this RFC are grandfathered from the
      // rule: those
      // media types "that fail to specify how the charset is determined" still
      // have US-ASCII as default. The text media types defined as of Nov. 20,
      // 2015, are listed below:
      //
      // -- No default charset assumed: --
      //
      // RTP payload types; these are usually unsuitable for MIME,
      // and don't permit a charset parameter, so a default charset is
      // irrelevant:
      // -- 1d-interleaved-parityfec, fwdred, red, parityfec, encaprtp,
      // raptorfec, rtp-enc-aescm128, t140, ulpfec, rtx, rtploopback
      //
      // These media types don't define a charset parameter:
      // -- csv-schema, dns, grammar-ref-list, mizar, vnd.latex-z,
      // vnd.motorola.reflex,
      // vnd.si.uricatalogue, prs.lines.tag, vnd.dmclientscript,
      // vnd.dvb.subtitle,
      // vnd.fly, rtf, rfc822-headers
      //
      // Special procedure defined for charset detection:
      // -- ecmascript, javascript, html
      //
      // XML formats (no default assumed if charset is absent, according
      // to RFC7303, the revision of the XML media type specification):
      // -- xml, xml-external-parsed-entity,
      // vnd.in3d.3dml*, vnd.iptc.newsml, vnd.iptc.nitf, vnd.ms-mediapackage,
      // vnd.net2phone.commcenter.command, vnd.radisys.msml-basic-layout,
      // vnd.wap.si, vnd.wap.sl, vnd.wap.wml
      //
      // Behavior deliberately undefined (so whether US-ASCII or another
      // charset is treated as default is irrelevant):
      // -- example
      //
      // No default specified (after RFC6657):
      // -- markdown*
      //
      // -- US-ASCII assumed: --
      //
      // These media types don't define a default charset:
      // -- css, richtext, enriched, tab-separated-values,
      // vnd.in3d.spot*, vnd.abc, vnd.wap.wmlscript, vnd.curl,
      // vnd.fmi.flexstor, uri-list, directory
      //
      // US-ASCII default:
      // -- plain, sgml, troff
      //
      // -- UTF-8 assumed: --
      //
      // UTF-8 only:
      // -- vcard, jcr-cnd, cache-manifest
      //
      // Charset parameter defined but is "always UTF-8":
      // -- n3, turtle, vnd.debian.copyright, provenance-notation
      //
      // UTF-8 default:
      // -- csv, calendar**, vnd.a***, parameters, prs.fallenstein.rst,
      // vnd.esmertec.theme.descriptor, vnd.trolltech.linguist,
      // vnd.graphviz, vnd.sun.j2me.app-descriptor
      //
      // * Required parameter.
      // ** No explicit default, but says that "[t]he charset supported
      // by this revision of iCalendar is UTF-8."
      // *** Default is UTF-8 "if 8-bit bytes are encountered" (even if
      // none are found, though, a 7-bit ASCII text is still also UTF-8)
      string param = this.GetParameter("charset");
      if (param != null) {
        return DataUtilities.ToLowerCaseAscii(param);
      }
      if (this.IsText) {
        string sub = this.SubType;
        // Media types that assume a default of US-ASCII
        if (sub.Equals("plain") || sub.Equals("sgml") ||
          sub.Equals("troff") || sub.Equals("directory") ||
          sub.Equals("css") || sub.Equals("richtext") ||
              sub.Equals("enriched") || sub.Equals("tab-separated-values") ||
              sub.Equals("vnd.in3d.spot") || sub.Equals("vnd.abc") ||
            sub.Equals("vnd.wap.wmlscript") || sub.Equals("vnd.curl") ||
              sub.Equals("vnd.fmi.flexstor") || sub.Equals("uri-list")) {
          return "us-ascii";
        }
        // Media types that assume a default of UTF-8
        if (sub.Equals("vcard") || sub.Equals("jcr-cnd") ||
          sub.Equals("n3") || sub.Equals("turtle") ||
            sub.Equals("vnd.debian.copyright") ||
              sub.Equals("provenance-notation") || sub.Equals("csv") ||
   sub.Equals("calendar") || sub.Equals("vnd.a") ||
              sub.Equals("parameters") || sub.Equals("prs.fallenstein.rst") ||
              sub.Equals("vnd.esmertec.theme.descriptor") ||
            sub.Equals("vnd.trolltech.linguist") ||
              sub.Equals("vnd.graphviz") || sub.Equals("cache-manifest") ||
              sub.Equals("vnd.sun.j2me.app-descriptor")) {
          return "utf-8";
        }
      }
      return String.Empty;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.GetParameter(System.String)"]'/>
    public string GetParameter(string name) {
      if (name == null) {
        throw new ArgumentNullException("name");
      }
      if (name.Length == 0) {
        throw new ArgumentException("name is empty.");
      }
      name = DataUtilities.ToLowerCaseAscii(name);
      return this.parameters.ContainsKey(name) ? this.parameters[name] : null;
    }

    internal static string DecodeRfc2231Extension(string value) {
      int firstQuote = value.IndexOf('\'');
      if (firstQuote < 0) {
        // not a valid encoded parameter
        return null;
      }
      int secondQuote = value.IndexOf('\'', firstQuote + 1);
      if (secondQuote < 0) {
        // not a valid encoded parameter
        return null;
      }
      string charset = value.Substring(0, firstQuote);
      string language = value.Substring(
firstQuote + 1,
secondQuote - (firstQuote + 1));
      if (language.Length > 0 && !ParserUtility.IsValidLanguageTag(language)) {
        // not a valid language tag
        return null;
      }
      string paramValue = value.Substring(secondQuote + 1);
      ICharacterEncoding cs = Encodings.GetEncoding(charset, true);
      cs = cs ?? Encodings.GetEncoding("us-ascii", true);
      return DecodeRfc2231Encoding(paramValue, cs);
    }

    private static ICharacterEncoding GetRfc2231Charset(string value) {
      if (value == null) {
        return Encodings.GetEncoding("us-ascii", true);
      }
      int firstQuote = value.IndexOf('\'');
      if (firstQuote < 0) {
        // not a valid encoded parameter
        return Encodings.GetEncoding("us-ascii", true);
      }
      int secondQuote = value.IndexOf('\'', firstQuote + 1);
      if (secondQuote < 0) {
        // not a valid encoded parameter
        return Encodings.GetEncoding("us-ascii", true);
      }
      string charset = value.Substring(0, firstQuote);
      string language = value.Substring(
firstQuote + 1,
secondQuote - (firstQuote + 1));
      if (language.Length > 0 && !ParserUtility.IsValidLanguageTag(language)) {
        // not a valid language tag
        return Encodings.GetEncoding("us-ascii", true);
      }
      ICharacterEncoding cs = Encodings.GetEncoding(charset, true);
      cs = cs ?? Encodings.GetEncoding("us-ascii", true);
      return cs;
    }

  private static string DecodeRfc2231Encoding(
string value,
ICharacterEncoding charset) {
      // a value without a quote
      // mark is not a valid encoded parameter
      int quote = value.IndexOf('\'');
      return (quote >= 0) ? null : Encodings.DecodeToString(
        charset,
        new PercentEncodingStringTransform(value));
    }

    private static bool ExpandRfc2231Extensions(IDictionary<string, string>
      parameters) {
      if (parameters.Count == 0) {
        return true;
      }
      IList<string> keyList = new List<string>(parameters.Keys);
      foreach (string name in keyList) {
        if (!parameters.ContainsKey(name)) {
          continue;
        }
        string value = parameters[name];
        int asterisk = name.IndexOf('*');
        if (asterisk == name.Length - 1 && asterisk > 0) {
          // name*="value" (except when the parameter is just "*")
          string realName = name.Substring(0, name.Length - 1);
          string realValue = DecodeRfc2231Extension(value);
          if (realValue == null) {
            continue;
          }
          parameters.Remove(name);
          // NOTE: Overrides the name without continuations
          parameters[realName] = realValue;
          continue;
        }
        // name*0 or name*0*
        if (asterisk > 0 && ((asterisk == name.Length - 2 &&
          name[asterisk + 1] == '0') || (asterisk == name.Length - 3 &&
          name[asterisk + 1] == '0' && name[asterisk + 2] == '*'))) {
          string realName = name.Substring(0, asterisk);
          string realValue = (asterisk == name.Length - 3) ?
            DecodeRfc2231Extension(value) : value;
          ICharacterEncoding charsetUsed = GetRfc2231Charset(
            (asterisk == name.Length - 3) ? value : null);
          parameters.Remove(name);
          var pindex = 1;
          var builder = new StringBuilder();
          builder.Append(realValue);
          // search for name*1 or name*1*, then name*2 or name*2*,
          // and so on
          while (true) {
            string contin = realName + "*" + IntToString(pindex);
            string continEncoded = contin + "*";
            if (parameters.ContainsKey(contin)) {
              // Unencoded continuation
              builder.Append(parameters[contin]);
              parameters.Remove(contin);
            } else if (parameters.ContainsKey(continEncoded)) {
              // Encoded continuation
              string newEnc = DecodeRfc2231Encoding(
             parameters[continEncoded],
             charsetUsed);
              if (newEnc == null) {
                // Contains a quote character in the encoding, so illegal
                return false;
              }
              builder.Append(newEnc);
              parameters.Remove(continEncoded);
            } else {
              break;
            }
            ++pindex;
          }
          realValue = builder.ToString();
          // NOTE: Overrides the name without continuations
          parameters[realName] = realValue;
        }
      }
      foreach (string name in parameters.Keys) {
        // Check parameter names using stricter format
        // in RFC6838
        if (skipMimeTypeSubtype(name, 0, name.Length, null) != name.Length) {
          // Illegal parameter name, so use default media type
          return false;
        }
      }
      return true;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.MediaType.TypeAndSubType"]'/>
    public string TypeAndSubType {
      get {
        return this.TopLevelType + "/" + this.SubType;
      }
    }

    internal static int skipOws(string s, int index, int endIndex) {
      int i2 = index;
      while (i2 < endIndex) {
        if (s[i2] == 0x09 || s[i2] == 0x20) {
          ++index;
        }
        break;
      }
      return index;
    }

    internal static bool ParseParameters(
string str,
      int index,
 int endIndex,
      bool httpRules,
 IDictionary<string, string> parameters) {
      while (true) {
        // RFC5322 uses ParseCFWS when skipping whitespace;
        // HTTP currently uses skipOws
    index = httpRules ? skipOws(str, index, endIndex) :
          HeaderParser.ParseCFWS(
            str,
            index,
            endIndex,
            null);
        if (index >= endIndex) {
          // No more parameters
          return httpRules || ExpandRfc2231Extensions(parameters);
        }
        if (str[index] != ';') {
          return false;
        }
        ++index;
    index = httpRules ? skipOws(str, index, endIndex) :
          HeaderParser.ParseCFWS(
str,
index,
endIndex,
null);
        var builder = new StringBuilder();
        // NOTE: RFC6838 restricts the format of parameter names to the same
        // syntax as types and subtypes, but this syntax is incompatible with
        // the RFC2231 format
        int afteratt = SkipAttributeNameRfc2231(
          str,
          index,
          endIndex,
          builder,
          httpRules);
        if (afteratt == index) {  // ill-formed attribute
          return false;
        }
        string attribute = builder.ToString();
        index = afteratt;
        if (!httpRules) {
          // NOTE: MIME implicitly doesn't restrict whether whitespace can
          // appear
          // around the equal sign separating an attribute and value, while
          // HTTP explicitly forbids such whitespace
          index = HeaderParser .ParseCFWS(str, index, endIndex, null);
        }
        if (index >= endIndex) {
          return false;
        }
        if (str[index] != '=') {
          return false;
        }
        attribute = DataUtilities.ToLowerCaseAscii(attribute);
        if (parameters.ContainsKey(attribute)) {
          // Console.WriteLine("Contains duplicate attribute " + attribute);
          return false;
        }
        ++index;
        if (!httpRules) {
          // See note above on whitespace around the equal sign
          index = HeaderParser.ParseCFWS(
str,
index,
endIndex,
null);
        }
        if (index >= endIndex) {
          // No more parameters
          return httpRules || ExpandRfc2231Extensions(parameters);
        }
        builder.Remove(0, builder.Length);
        int qs;
        // If the attribute name ends with '*' the value may not be a quoted
        // string
        if (attribute[attribute.Length - 1] != '*') {
          // try getting the value quoted
          qs = skipQuotedString(
            str,
            index,
            endIndex,
            builder,
            httpRules ? QuotedStringRule.Http : QuotedStringRule.Rfc5322);
          if (!httpRules && qs != index) {
            qs = HeaderParser.ParseCFWS(str, qs, endIndex, null);
          }
          if (qs != index) {
            parameters[attribute] = builder.ToString();
            index = qs;
            continue;
          }
          builder.Remove(0, builder.Length);
        }
        // try getting the value unquoted
        // Note we don't use getAtom
        qs = SkipMimeToken(str, index, endIndex, builder, httpRules);
        if (qs != index) {
          parameters[attribute] = builder.ToString();
          index = qs;
          continue;
        }
        // no valid value, return
        return false;
      }
    }

    private bool ParseMediaType(string str) {
      const bool HttpRules = false;
      var index = 0;
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      int endIndex = str.Length;
      index = HeaderParser.ParseCFWS(str, index, endIndex, null);
      int i = skipMimeTypeSubtype(str, index, endIndex, null);
      if (i == index || i >= endIndex || str[i] != '/') {
        return false;
      }
      this.topLevelType =
        DataUtilities.ToLowerCaseAscii(str.Substring(index, i - index));
      ++i;
      int i2 = skipMimeTypeSubtype(str, i, endIndex, null);
      if (i == i2) {
        return false;
      }
      this.subType = DataUtilities.ToLowerCaseAscii(str.Substring(i, i2 - i));
      if (i2 < endIndex) {
        // if not at end
        int i3 = HeaderParser.ParseCFWS(str, i2, endIndex, null);
        if (i3 == endIndex) {
          // at end
          return true;
        }
        if (i3 < endIndex && str[i3] != ';') {
          // not followed by ";", so not a media type
          return false;
        }
      }
      index = i2;
      return ParseParameters(str, index, endIndex, HttpRules, this.parameters);
    }

    #if CODE_ANALYSIS
    [System.Diagnostics.CodeAnalysis.SuppressMessage(
      "Microsoft.Security",
      "CA2104",
      Justification="This instance is immutable")]
    #endif
    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.TextPlainAscii"]'/>
    public static readonly MediaType TextPlainAscii =
      new MediaTypeBuilder(
"text",
"plain").SetParameter("charset",
        "us-ascii").ToMediaType();

    #if CODE_ANALYSIS
    [System.Diagnostics.CodeAnalysis.SuppressMessage(
      "Microsoft.Security",
      "CA2104",
      Justification="This instance is immutable")]
    #endif
    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.TextPlainUtf8"]'/>
    public static readonly MediaType TextPlainUtf8 =
      new MediaTypeBuilder(
"text",
"plain").SetParameter("charset",
        "utf-8").ToMediaType();

    #if CODE_ANALYSIS
    [System.Diagnostics.CodeAnalysis.SuppressMessage(
      "Microsoft.Security",
      "CA2104",
      Justification="This instance is immutable")]
    #endif
    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.MessageRfc822"]'/>
    public static readonly MediaType MessageRfc822 =
      new MediaTypeBuilder("message", "rfc822").ToMediaType();

#if CODE_ANALYSIS
    [System.Diagnostics.CodeAnalysis.SuppressMessage(
      "Microsoft.Security",
      "CA2104",
      Justification="This instance is immutable")]
#endif
    /// <include file='docs.xml'
    /// path='docs/doc[@name="F:PeterO.Mail.MediaType.ApplicationOctetStream"]'/>
    public static readonly MediaType ApplicationOctetStream =
      new MediaTypeBuilder("application", "octet-stream").ToMediaType();

    private MediaType() {
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.Parse(System.String)"]'/>
    public static MediaType Parse(string mediaTypeValue) {
      return Parse(mediaTypeValue, TextPlainAscii);
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.MediaType.Parse(System.String,PeterO.Mail.MediaType)"]'/>
    public static MediaType Parse(string str, MediaType defaultValue) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      var mt = new MediaType();
      mt.parameters = new SortedMap<string, string>();
      if (!mt.ParseMediaType(str)) {
        #if DEBUG
        // Console.WriteLine("Unparsable: " + str);
        #endif
return defaultValue;
      }
      return mt;
    }
  }
}