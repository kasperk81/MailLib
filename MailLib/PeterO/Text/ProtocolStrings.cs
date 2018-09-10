using System;
using System.Text;

namespace PeterO.Text {
    /// <summary>Contains methods for preparing user-facing protocol
    /// strings (such as user identifiers) for comparison and validity
    /// checking. Such strings can be _internationalized_, that is, contain
    /// characters beyond the Basic Latin block (U + 0000 to U + 007F) of
    /// the Unicode Standard. See RFC 8264. (Currently there are three
    /// profiles for internationalized strings: one each for strings
    /// serving as user identifiers, arbitrary single-line strings [such as
    /// passwords], or display names. Other user-facing internationalized
    /// strings not expressly handled by this class include file and
    /// directory names, domain names, profile data voluntarily entered by
    /// users, and the text of article, post, and message
    /// bodies.).</summary>
  public static class ProtocolStrings {
    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.IsInIdentifierClass(System.String)"]/*'/>
    public static bool IsInIdentifierClass(string str) {
      return Idna.IsInIdentifierClass(str);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.IsInFreeformClass(System.String)"]/*'/>
    public static bool IsInFreeformClass(string str) {
      return Idna.IsInFreeformClass(str);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.UserpartEnforce(System.String)"]/*'/>
    public static string UserpartEnforce(string str) {
      return UserpartEnforce(str, false);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.UsernameEnforce(System.String)"]/*'/>
    public static string UsernameEnforce(string str) {
      return UsernameEnforce(str, false);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.UserpartEnforce(System.String,System.Boolean)"]/*'/>
    public static string UserpartEnforce(string str, bool preserveCase) {
      if (preserveCase) {
        return Idna.UsernameCasePreservedEnforce(str);
      } else {
        return Idna.UsernameCaseMappedEnforce(str);
      }
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.UsernameEnforce(System.String,System.Boolean)"]/*'/>
    public static string UsernameEnforce(string str, bool preserveCase) {
      if (String.IsNullOrEmpty(str)) {
        return null;
      }
      if (str[0] == ' ' || str[str.Length - 1] == ' ') {
        return null;
      }
      var lastPos = 0;
      var i = 0;
      StringBuilder sb = null;
      while (i < str.Length) {
        if (str[i] == ' ') {
          string part = UserpartEnforce(
            str.Substring(lastPos, i - lastPos),
            preserveCase);
          if (part == null) {
            return null;
          }
          sb = sb ?? (new StringBuilder());
          sb.Append(part);
          while (i < str.Length) {
            if (str[i] != ' ') {
              break;
            }
            sb.Append(' ');
            ++i;
          }
          lastPos = i;
        } else {
          ++i;
        }
      }
      if (lastPos == 0) {
        return UserpartEnforce(str, preserveCase);
      }
      if (lastPos != str.Length) {
        string part = UserpartEnforce(
          str.Substring(lastPos, str.Length - lastPos),
          preserveCase);
        if (part == null) {
          return null;
        }
        sb = sb ?? (new StringBuilder());
        sb.Append(part);
      }
      return sb.ToString();
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.OpaqueStringEnforce(System.String)"]/*'/>
    public static string OpaqueStringEnforce(string str) {
      return Idna.OpaqueStringEnforce(str);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.NicknameEnforce(System.String)"]/*'/>
    public static string NicknameEnforce(string str) {
      return Idna.NicknameEnforce(str);
    }

    /// <include file='../../docs.xml'
    /// path='docs/doc[@name="M:PeterO.Text.ProtocolStrings.NicknameForComparison(System.String)"]/*'/>
    public static string NicknameForComparison(string str) {
      return Idna.NicknameForComparison(str);
    }
  }
}