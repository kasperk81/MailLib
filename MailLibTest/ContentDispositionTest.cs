using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;
using PeterO;
using PeterO.Mail;
using PeterO.Text;
using Test;

namespace MailLibTest {
  [TestFixture]
  public class ContentDispositionTest {
    private static ContentDisposition ParseAndTestAspects(string s) {
      ContentDisposition mt = ContentDisposition.Parse(s);
      if (mt == null) {
        TestAspects(mt);
      }
      return mt;
    }

    private static ContentDisposition ParseAndTestAspects(
  string s,
  ContentDisposition defvalue) {
      ContentDisposition mt = ContentDisposition.Parse(s, defvalue);
      if (mt == null) {
        TestAspects(mt);
      }
      return mt;
    }

    private static void TestAspects(ContentDisposition mt) {
      if (mt == null) {
        return;
      }
      // Test round-tripping
      string str = mt.ToString();
      ContentDisposition mt2 = ContentDisposition.Parse(str, null);
      if (mt2 == null) {
        Assert.Fail();
      }
      Assert.AreEqual(str, mt2.ToString());
      TestCommon.AssertEqualsHashCode(mt, mt2);
      str = mt.ToSingleLineString();
      mt2 = ContentDisposition.Parse(str, null);
      if (mt2 == null) {
        Assert.Fail();
      }
      Assert.AreEqual(str, mt2.ToSingleLineString());
      TestCommon.AssertEqualsHashCode(mt, mt2);
    }
    [Test]
    public void TestDispositionType() {
      // not implemented yet
    }
    [Test]
    public void TestEquals() {
      ContentDisposition mt =
          ParseAndTestAspects("inline;param1=value1;param2=value2");
      ContentDisposition mt2 =
           ParseAndTestAspects("inline;param2=value2;param1=value1");
      ContentDisposition mt3 =
           ParseAndTestAspects("inline;param1=value2;param2=value2");
      TestCommon.AssertEqualsHashCode(mt, mt2);
      TestCommon.AssertEqualsHashCode(mt, mt3);
      TestCommon.AssertEqualsHashCode(mt3, mt2);
      Assert.AreEqual(mt, mt2);
      Assert.IsFalse(mt.Equals(mt3));
      Assert.IsFalse(mt2.Equals(mt3));
    }
    [Test]
    public void TestGetHashCode() {
      // not implemented yet
    }
    [Test]
    public void TestGetParameter() {
      foreach (IDictionary<string, string> dict in
           MediaTypeTest.ValueTestParamTypes) {
        ContentDisposition mt = ParseAndTestAspects("inline" + dict["params"]);
        Assert.AreEqual(
          dict["filename"],
          mt.GetParameter("filename"));
      }
    }
    [Test]
    public void TestIsAttachment() {
      ContentDisposition cd = ParseAndTestAspects("inline");
      Assert.IsFalse(cd.IsAttachment);
      cd = ParseAndTestAspects("cd-unknown");
      Assert.IsFalse(cd.IsAttachment);
      cd = ParseAndTestAspects("attachment");
      Assert.IsTrue(cd.IsAttachment);
    }

    [Test]
    public void TestIsInline() {
      ContentDisposition cd = ParseAndTestAspects("inline");
      Assert.IsTrue(cd.IsInline);
      cd = ParseAndTestAspects("cd-unknown");
      Assert.IsFalse(cd.IsInline);
      cd = ParseAndTestAspects("attachment");
      Assert.IsFalse(cd.IsInline);
    }

    private static string MakeQEncoding(string str) {
      byte[] bytes = DataUtilities.GetUtf8Bytes(str, false);
      var sb = new StringBuilder();
      string hex = "0123456789ABCDEF";
      sb.Append("=?utf-8?q?");
      for (var i = 0; i < bytes.Length; ++i) {
        int b = ((int)bytes[i]) & 0xff;
        if (b == 0x32) {
          sb.Append('_');
        } else if ((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z') ||
          (b >= '0' && b <= '9')) {
          sb.Append((char)b);
        } else {
          sb.Append('=');
          sb.Append(hex[(b >> 4) & 15]);
          sb.Append(hex[b & 15]);
        }
      }
      sb.Append("?=");
      return sb.ToString();
    }

    private static string MakeRfc2231Encoding(string str) {
      byte[] bytes = DataUtilities.GetUtf8Bytes(str, false);
      var sb = new StringBuilder();
      string hex = "0123456789ABCDEF";
      sb.Append("utf-8''");
      for (var i = 0; i < bytes.Length; ++i) {
        int b = ((int)bytes[i]) & 0xff;
        if ((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z') ||
          (b >= '0' && b <= '9')) {
          sb.Append((char)b);
        } else {
          sb.Append('%');
          sb.Append(hex[(b >> 4) & 15]);
          sb.Append(hex[b & 15]);
        }
      }
      return sb.ToString();
    }

    private static string RandomString(RandomGenerator rnd) {
      string ret = EncodingTest.RandomString(rnd);
      int ui = rnd.UniformInt(100);
      if (ui < 20) {
        ret = MakeQEncoding(ret);
      } else if (ui < 25) {
        ret = MakeRfc2231Encoding(ret);
      }
      return ret;
    }

    internal static void FailFilename(string filename, string str) {
      FailFilename(filename, str, null);
    }

    internal static void FailFilename(
    string filename,
    string newName,
    string extra) {
      string failstr = "original=" + EncodingTest.EscapeString(filename) +
 "\nfilename=" + EncodingTest.EscapeString(newName) + "\n" +
"AssertGoodFilename(\"" + EncodingTest.EscapeString(filename) +
         "\");" + (String.IsNullOrEmpty(extra) ? String.Empty : "\n" +
              extra);
      Assert.Fail(failstr);
    }

    internal static void AssertGoodFilename(string filename) {
      string str = ContentDisposition.MakeFilename(filename);
      if (str.Length == 0 && filename.Length > 0) {
        FailFilename(filename, str);
      } else if (str.Length == 0) {
        return;
      }
      if (str == null || str.Length > 255) {
        FailFilename(filename, str);
      }
      if (str[str.Length - 1] == '.' || str[str.Length - 1] == '~') {
        FailFilename(filename, str);
      }
      string strLower = DataUtilities.ToLowerCaseAscii(str);
      bool bracketDigit = str[0] == '{' && str.Length > 1 &&
              str[1] >= '0' && str[1] <= '9';
      bool homeFolder = str[0] == '~' || str[0] == '-' || str[0] ==
          '$';
      bool period = str[0] == '.';
      bool beginEndSpace = str[0] == 0x20 || str[str.Length - 1] ==
          0x20;
      if (bracketDigit) {
        FailFilename(filename, str);
      }
      if (homeFolder) {
        FailFilename(filename, str);
      }
      if (period) {
        FailFilename(filename, str);
      }
      if (beginEndSpace) {
        FailFilename(filename, str);
      }
      // Reserved filenames on Windows
      if (strLower.Equals(
       "nul")) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.Equals("clock$")) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.IndexOf(
        "nul.",
        StringComparison.Ordinal) == 0) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.Equals(
        "prn")) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.IndexOf(
        "prn.",
        StringComparison.Ordinal) == 0) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.IndexOf(
        "![",
        StringComparison.Ordinal) >= 0) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.Equals(
        "aux")) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.IndexOf(
        "aux.",
        StringComparison.Ordinal) == 0) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.Equals(
        "con")) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.IndexOf(
        "con.",
        StringComparison.Ordinal) == 0) {
        {
          FailFilename(filename, str, strLower);
        }
      }
      if (strLower.Length == 4 || (strLower.Length > 4 && (strLower[4]
        == '.' || strLower[4] == ' '))) {
        if (strLower.IndexOf(
          "lpt",
          StringComparison.Ordinal) == 0 && strLower[3] >= '0' &&
            strLower[3] <= '9') {
          {
            FailFilename(filename, str, strLower);
          }
        }
        if (strLower.IndexOf(
            "com",
            StringComparison.Ordinal) == 0 && strLower[3] >= '0' &&
            strLower[3] <= '9') {
          {
            FailFilename(filename, str, strLower);
          }
        }
      }
        int bracketedText = str.IndexOf('[');
        if (bracketedText >= 0) {
 bracketedText = str.IndexOf(']',bracketedText);
   if (bracketedText >= 0) {
            FailFilename(filename, str, strLower);
   }
}
      int i;
      for (i = 0; i < str.Length; ++i) {
        char c = str[i];
        if (c < 0x20 || (c >= 0x7f && c <= 0x9f) ||
          c == '%' || c == 0x2028 || c == 0x2029 ||
        c == '#' || c == ';' || c == '\'' ||
            c == '\\' || c == '/' || c == '*' || c == '?' || c == '|' ||
          c == ':' || c == '<' || c == '>' || c == '"' || c == '`' ||
c == '$' || c == 0xa0 || c == 0x3000 || c == 0x180e || c == 0x1680 ||
(c >= 0x2000 && c <= 0x200b) || c == 0x205f || c == 0x202f || c == 0xfeff ||
            (c & 0xfffe) == 0xfffe || (c >= 0xfdd0 && c <= 0xfdef)) {
          FailFilename(
  filename,
  str,
  "[" + EncodingTest.EscapeString(String.Empty + c) + "] index=" + i);
        }
        // Code points that decompose to "bad" characters
        if (c == 0x1fef) {
          FailFilename(
  filename,
  str,
  "[" + EncodingTest.EscapeString(String.Empty + c) + "] index=" + i);
        }
      }
      if (str.IndexOf("\u0020\u0020", StringComparison.Ordinal) >= 0) {
        FailFilename(filename, str);
      }
      if (str.IndexOf("\u0020\t", StringComparison.Ordinal) >= 0) {
        FailFilename(filename, str);
      }
      if (str.IndexOf("\t\u0020", StringComparison.Ordinal) >= 0) {
        FailFilename(filename, str);
      }

      // Avoid space before and after last dot
      for (i = str.Length - 1; i >= 0; --i) {
        if (str[i] == '.') {
          bool spaceAfter = i + 1 < str.Length && str[i + 1] == 0x20;
          bool spaceBefore = i > 0 && str[i - 1] == 0x20;
          if (spaceAfter || spaceBefore) {
            FailFilename(filename, str);
          }
          break;
        }
      }
      bool finalRet = NormalizerInput.IsNormalized(
  str,
  Normalization.NFC);
      if (!finalRet) {
        FailFilename(filename, str);
      }
      // Assert that MakeFilename is idempotent
      string newstr = ContentDisposition.MakeFilename(str);
      if (!newstr.Equals(str)) {
        FailFilename(
  filename,
  str,
  "Not idempotent:\nnewname_=" + EncodingTest.EscapeString(newstr));
      }
    }

    public static readonly string[] FileNames = {
"hello.\u0020txt", "hello._txt",
  "hello\u0020.txt", "hello_.txt",
  "hello\u0020.\u0020txt", "hello_._txt",
  "hello._", "hello._",
      "com1.x", "_com1.x",
      "lpt1.x", "_lpt1.x",
  "xx#xx", "xx_xx",
  "=?utf=?utf-8?q?test?=", "=_utftest",
  "=?utf-8?q=?utf-8?q?test?=", "=_utf-8_qtest",
  "=?utf-8?=?utf-8?q?test?=", "=_utf-8_test",
  "=?utf-8?q?t=?utf-8?q?test?=", "ttest",
  "=?utf-8?q?long_filename?=", "long filename",
  "com.txt", "com.txt",
  "com0.txt", "_com0.txt",
  "lpt0.txt", "_lpt0.txt",
  "-hello.txt", "_-hello.txt",
  "hello.txt", "hello.txt",
  "=?utf-8?q?hello=2Etxt?=", "hello.txt",
  "=?utf-8?q?hello.txt?=", "hello.txt",
  "utf-8''hello%2Etxt", "hello.txt",
  "utf-8'en'hello%2Etxt", "hello.txt",
  "hello" + " " + " " + "txt", "hello txt",
  "hello.txt" + " " + " ", "hello.txt",
  " " + "hello.txt", "hello.txt",
  "hello" + " " + "txt", "hello txt",
  "hello.txt" + " ", "hello.txt",
  "=?utf-8?q?___hello.txt___?=", "hello.txt",
  "=?utf-8?q?a?= =?utf-8?q?b?=", "ab",
  "=?utf-8?q?a?= =?x-unknown?q?b?=", "a b",
  "a" + " " + " " + " " + "b", "a b",
  "=?iso-8859-1*en?q?fil=E7test?=", "fil\u00e7test",
  "=?iso-8859-1*en-us?q?fil=E7test?=", "fil\u00e7test",
  "=?iso-8859-1*xx9x9x?q?fil=E7test?=", "fil\u00e7test",
  "=?iso-8859-1*en?q?fil=e7test?=", "fil\u00e7test",
  "=?iso-8859-1*en-us?q?fil=e7test?=", "fil\u00e7test",
  "=?iso-8859-1*xx9x9x?q?fil=e7test?=", "fil\u00e7test",
  "=?us-ascii*en?q?filetest?=", "filetest",
  "=?us-ascii*en-us?q?filetest?=", "filetest",
  "=?us-ascii*xx9x9x?q?filetest?=", "filetest",
  "d\ud800e", "d\ufffde",
  "d\udc00e", "d\ufffde",
  "d'e", "d_e",
  "utf-8'e", "utf-8_e",
  "com0.txt", "_com0.txt",
  "-hello.txt", "_-hello.txt",
  "lpt0.txt", "_lpt0.txt",
  "com1.txt", "_com1.txt",
  "lpt1.txt", "_lpt1.txt",
  "nul.txt", "_nul.txt",
  "hello . txt", "hello_._txt",
  "hello\u2028world.txt", "hello_world.txt",
  "hello\u2029world.txt", "hello_world.txt",
  "hello\u0085world.txt", "hello_world.txt",
  "prn.txt", "_prn.txt",
  "aux.txt", "_aux.txt",
  "con.txt", "_con.txt",

          " =?utf-8?q?hello.txt?= ", "hello.txt",

            " =?utf-8?q?___hello.txt___?= ", "hello.txt",

            " =?utf-8*en?q?___hello.txt___?= ", "hello.txt",
      " =?utf-8*?q?___hello.txt___?= ", "___hello.txt___",
      " =?utf-8*i-unknown?q?___hello.txt___?= ", "hello.txt",
  " =?*en?q?___hello.txt___?= ", "___hello.txt___",
  "=?iso-8859-1?q?a=E7=E3o.txt?=", "a\u00e7\u00e3o.txt",

            "a\u00e7\u00e3o.txt", "a\u00e7\u00e3o.txt",

          "=?x-unknown?q?hello.txt?=", "hello.txt",
  "=?x-unknown", "=_x-unknown",
  "my?file<name>.txt", "my_file_name_.txt",

            "my file\tname\".txt", "my file name_.txt",

          "my\ud800file\udc00name\ud800\udc00.txt",
  "my\ufffdfile\ufffdname\ud800\udc00.txt",
  "=?x-unknown?Q?file\ud800name?=", "file\ufffdname",

          "utf-8''file%c2%bename.txt", "file\u00bename.txt",

            "utf-8'en'file%c2%bename.txt", "file\u00bename.txt",

            "windows-1252'en'file%bename.txt", "file\u00bename.txt",

          "x-unknown'en'file%c2%bename.txt",
              "x-unknown_en_file_c2_bename.txt",

            "utf-8'en-us'file%c2%bename.txt", "file\u00bename.txt",
  "utf-8''file%c2%bename.txt", "file\u00bename.txt",
  "...", "_..._",
  "~home", "_~home",
  "~nul", "_~nul",

            "myfilename.txt.", "myfilename.txt._",
  "nul", "_nul",
  " nul ", "_nul",
  " ordinary ", "ordinary",
  "nul.txt", "_nul.txt",
  "con", "_con",
  "aux", "_aux",
  "lpt1device", "lpt1device",
  "my\u0001file\u007fname*.txt", "my_file_name_.txt",
  "=?utf-8?q?folder\\hello.txt?=", "folder_hello.txt",
  "folder/", "folder_",
  "folder//////", "folder______",
  ".", "_._",
  "..", "_.._",
  "fol/der/", "fol_der_",
  "fol/der//////", "fol_der______",
  "com1 .x", "_com1_.x",
  "lpt1 .x", "_lpt1_.x",
  "com1 .x.y", "_com1 .x.y",
  "lpt1 .x.y", "_lpt1 .x.y",
      String.Empty, String.Empty,
      "folder/hello.txt", "folder_hello.txt",
  "fol/der/hello.txt", "fol_der_hello.txt",
  "=?x-unknown?q?folder\\hello.txt?=", "folder_hello.txt",
      "\u0020\u0020hello.txt", "hello.txt"
};

    private static string[] specificFilenames = {
      "utf-8''%2A%EF%AB%87%EC%A5%B2%2B67%20Tqd%20R%E3%80%80%2E",
      "xx\u1fefxx",
      "xx!\ud845\udd33[xx",
      "com20020",
      "xx#xx",
      "xx!\ud845\udd33[",
      "xx![xx",

  "0_@S\u2000\u164d7~?H |Hw\u669b\u007f\u12c6>kT\ud802\udda8 .hu-z\u2e03A\ua944}N.\u176cL\uffffJRm+{K `\"\u7ff2D\u2f2d7Q(\"[~JWP@Dy\u2f77voW\u202f\u001b\uf8e2;w\ud9d6\ude5c\udb66\udf9d?o\ufeff\u2f0c \u1384l1N_tG?\u2eae\u008f.\ubf99l5<p.@\"S\ufdefiU ~\u73d6ag/l7\ufdd0\u27a4u W$vZ!(jxf^eQ\u13ac \uf8a4l0\"\ufeffz3.2\u179b$V9,b\u24fe\u4b27S\u001bO\u072a|H6 e_\u2377.F*##xX\u007f ~\u2aa4xU\uc09b$MXPI\u007fMr\uc880 u#'Do5qR; |;:1(A\u200bRR*T*:xLAR#;%.||k?v4/~6EB..1\udacc\udd9bP\ud824\ude7d.|%'Z970<?u'\\gG\u3189V.es0.f\tu? %t&=6\u205f\u2a4f#F\u2000 {*\\ &(]Rk<u<|\ud80e\udeb7l>s}/JG'\u205f-t-k\uc774#.\u0020\u0020",

  "\u1492\u0f68r\t\ud9d6\udf2cquip %T;K=_%\u008fW\ufffe-\u2ef5u%.p\u0010~#uI_U0!6 {1?uIFA 0iO4y9 (\u53807aPz+\u009f}rj\u0a81 \u2446fo[\\? \u0757 I\t0\u19c8.z(c\uffffgc)J5VdW\ufeff4*\u200b%.\u00aaR\ufbbfw\u16d0Rm%\u001f\u189d\u00a0W\ufffe\u0bfa(9!.'\u1499.\u200b_m\ufffe>7v\u2000N},gch[3\ufffe\u2a07pD:gXhG_\u0000&\ufffeyT$&\u2fa5 N\ud8fd\udd2am \u0000)1\u009f$y1 \ud9e1\udc78\u001f;\u2bdd9.\u1d21B}\u1271 X.U|O/\ufeffQQ.A>cW!1'\u2374hmt \u0866\ufeff&t\\fe\u009f\u2cado?\ud9f5\ude56;\\b^\udb81\udf2d\u008f \u00a0\udbfd\udf53@.]7MD\u008fxwKs\u202f}\"\u17ff^m\u0010\ufdef'FF\u2000T>:\u2000h.J\u1e10\ufdefI$\u0355eIL`CDcH\u0dffrX4.'qx {. p:w. E64cF?1\\;",

  ".Zw\"\ud91f\udd46\u0010p *L {fN_\t5Wvs%Bka-\u00fb\ufdef@\uffffy|-\u001fDWqpX\uda60\udeadznb'\u00a0h1 \udb32\uddcah..\u0cab\u26eff\u21114\u2b8aSz,\t \u2d0d.Q\u009f\ufacfD\u0010E+r@!.MY/\u0010dFN\ubdb8\u21203\ud9af\udf5e`\u3000\u15ae _>vg",

  "\u216a2s\u1e19C<snhs\ud87a\ude8dX(\ufdef\ufdd0,u.y\u001c.|}Y \u2f18Yx\u2a11N%(..s3^(N\u0084`(r|41X_.})\ud84c\udef3\ufe3c/\\/ sq?G![{\ufeffZ\"qSMdgv3#dg\tK@^X;`jl\ud892\udcd3' e@5a(\u00a0 wg0g hH?5\u202flh\u04c1 \uffff(,\u044d qQ7b:uFs9m\u0b6b\\AT|HDAsH6's!_B>rb(q?KpUv;fa r!\u1dc2.5.U\\Ez\u1f5a/J.8`?U\u01ba\\/v\ufdef_p.%|}.;.(OL9\u00001O.RV\u2433z,E\u008f%o\u008f.fpDN=G {(\udac5\udd76XC\uffff..z\ud9e4\udc62^(u=|'93\u0f6bWvz\u0f09\u26d2$?y\ud9c5\udcd4P:)+iO\u009f[f?>JTo,Ge`:'I\u5ccf\u009f\u9c3a<+yC {\ub10bm(j\u7959.tL=\ud86a\udea3\\(i \u001fG0 +np\u180erFt.hoy ny)\".6 +j ",

  "K GY2n8 Uml\ufdd0U {\\\udbee\ude3brac,;8d\u3000i\ud965\uddd1W&9\ufffe`)nM@(\u1125=nZ:_='g5 ?g[\u1432S\ufdef/Y\u001fzF\ud84d\udda1\u009fb'C:\u00a0-M\u205f476\u001b\ud8c7\udc378=\"z\u0010\u2d33 {:\"mN\"5V!\ufdd0\u00a0> \u1680mdnR8\u03b2s\u008f^7*{yH\u001fil1>\u00108C6 \"p\u009fV,?/.C.o P9yP}s {\"{>\u205f\\(U\ufdd0\u205f!/ \"%K\u2000@ Y\u205fP/C,?O(\u03eb+\u009f\ubd8b\udbf3\udf10f.rv8\u009f%v6!]H6\u001bp`.\u008f:BVkI\u09f5|8!FQ\\Fp.88\u2000m\u0933 s.~cO$ fQoq\"\u3000\u6b07\ud8bd\udca6H\ud9be\udc02zY(N.h1\u0000|=!\ud845\udd33[\ua233o'dt;)H1p\u00a0?TVw5sZ\"\u205fF5.)M&?Kq<#\u0f96Td5Zr3@`~8.:",

      "utf-8'en'utf-8%27%27test",
      "utf-8'en'utf-8%27en%27test",
      "utf-8''utf-8%27%27test",
      "utf-8''utf-8%27en%27test",
      "utf-8''unknown%27%27test",
      "utf-8'en'unknown%27%27test",
      "utf-8'en'unknown%27en%27test",

  ".Fm\u2a32\u16801c sl\u001fvU0O\u2af4\ufeff7r'\ufdd0&R|.W\".R@)\u02f1|q|\u2a84Ji4Lj65XTP2&\u3000t\ta]:\u008fk0$\"^QNU\ub7e7l\tpj>K\ud81e\udcb24\u8463pC[\ufdd0aJL ZSDX./|!3(lA\\a\ud800\udca6N?\"\uffff\\/\u06b5V1\"\u0000K\u1a41MZ.(iE&\u0d91\tJ\u009f\u0da3x)\"\u0396 hN\u1585uCF U2/|\\\u2043s9Zkd {\u2fdcZB+\u008f.\ud942\udda6.+!\\j!-`nuM@H/y\u205f0';$?^Q.&Mo.e?\u2000FY$2\u0559|B>\"7'A\u2e51\u07463.\u009f3\u12a4U|~>2.#\"t!X,I|vn\u2000.\ufffe6\u00a0X\u2315*G+*%^\ufeff\u001bt\ud87e\udcb0z}ig\u4609y\ud943\udf81>o%<g,\u205f&)\u007f\u200b|\udb79\ude00?a'X*z|Bm\udaa1\udc53#N$\"&)O: F\u0000\uda2b\uddbdeAte\ufffe\\pqb'\u202fT}\u23cdC!K.^2}c:Wj)[ZCa\u19094\u3000\udb4b\udff1R\ufdef64o.\u26d94hf.+&P>_\u22b1\t\ufdd0f\u200b\\P\uc5a0\u05ddf*P \u1ecav\ufdd0S"
};

    [Test]
    public void TestMakeFilenameSpecific() {
      foreach (string str in specificFilenames) {
        AssertGoodFilename(str);
      }
    }

    [Test]
    [Timeout(200000)]
    public void TestMakeFilename() {
      var rnd = new RandomGenerator(new XorShift128Plus(false));
      Assert.AreEqual(
          String.Empty,
          ContentDisposition.MakeFilename(null));
      for (var i = 0; i < 10000; ++i) {
        if (i % 1000 == 0) {
          Console.WriteLine(i);
        }
        AssertGoodFilename(RandomString(rnd));
      }
      for (var i = 0; i < ContentDispositionTest.FileNames.Length; i += 2) {
        string str = ContentDisposition.MakeFilename(
          ContentDispositionTest.FileNames[i]);
        Assert.AreEqual(
  ContentDispositionTest.FileNames[i + 1],
  str,
  ContentDispositionTest.FileNames[i]);
        AssertGoodFilename(ContentDispositionTest.FileNames[i]);
        AssertGoodFilename(ContentDispositionTest.FileNames[i + 1]);
      }
    }

    [Test]
    public void TestParameters() {
      ContentDisposition mt =
          ParseAndTestAspects("inline;param1=value1;param2=value2");
      IDictionary<string, string> parameters;
      parameters = mt.Parameters;
      Assert.IsTrue(parameters.ContainsKey("param1"));
      Assert.IsTrue(parameters.ContainsKey("param2"));
      Assert.AreEqual("value1", parameters["param1"]);
      Assert.AreEqual("value2", parameters["param2"]);
    }

    [Test]
    public void TestParse() {
      try {
        ParseAndTestAspects(null);
        Assert.Fail("Should have failed");
      } catch (ArgumentNullException) {
        // NOTE: Intentionally empty
      } catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }

      ContentDisposition mt;
      IDictionary<string, string> parameters;
      mt = ParseAndTestAspects("inline;param1=\"value1\"");
      parameters = mt.Parameters;
      Assert.AreEqual("value1", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=utf-8''value2");
      parameters = mt.Parameters;
      Assert.AreEqual("value2", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=utf-8'en'value3");
      parameters = mt.Parameters;
      Assert.AreEqual("value3", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*0*=utf-8'en'val;param1*1*=ue4");
      parameters = mt.Parameters;
      Assert.AreEqual("value4", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1''valu%e72");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1''valu%E72");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1'en'valu%e72");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1'en'valu%E72");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1'en'valu%4E2");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u004e2", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=iso-8859-1'en'valu%4e2");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u004e2", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1*=utf-8''value2;param1=dummy");
      parameters = mt.Parameters;
      Assert.AreEqual("value2", parameters["param1"]);
      mt = ParseAndTestAspects("inline;param1=dummy;param1*=utf-8''value2");
      parameters = mt.Parameters;
      Assert.AreEqual("value2", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1*0*=utf-8'en'val;param1*1*=ue4;param1=dummy");
      parameters = mt.Parameters;
      Assert.AreEqual("value4", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1=dummy;param1*0*=utf-8'en'val;param1*1*=ue4");
      parameters = mt.Parameters;
      Assert.AreEqual("value4", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1*=iso-8859-1''valu%e72;param1=dummy");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1=dummy;param1*=iso-8859-1''valu%E72");
      parameters = mt.Parameters;
      Assert.AreEqual("valu\u00e72", parameters["param1"]);
      TestPercentEncodingOne("test\u00be", "test%C2%BE");
      TestPercentEncodingOne("test\u00be", "test%c2%be");
      TestPercentEncodingOne("tesA", "tes%41");
      TestPercentEncodingOne("tesa", "tes%61");
      TestPercentEncodingOne("tes\r\na", "tes%0D%0Aa");
      TestPercentEncodingOne(
  "tes%xx",
  "tes%xx");
      TestPercentEncodingOne("tes%dxx", "tes%dxx");
    }

    private static void TestPercentEncodingOne(string expected, string input) {
      ContentDisposition cd =
        ParseAndTestAspects("inline; filename*=utf-8''" + input);
      Assert.AreEqual(expected, cd.GetParameter("filename"));
    }

    // Parameters not conforming to RFC 2231, but
    // have names with asterisks
    internal static readonly string[] NoParams = {
";param*xx=value",
  ";param*0xx=value",
  ";param*xx0=value",
  ";param*xx*=value",
  ";param*0*0=value",
  ";param*0*x=value",
  ";param*0xx*=value",
  ";param*xx0*=value",
  ";param*0*0*=value",
  ";param*0*x*=value",
  ";param*x*0*=value",
  ";param*x*x*=value",
      "; charset*='i-unknown'utf-8" /* invalid language tag, no charset */,
  "; charset*=us-ascii'i-unknown'utf-8" /* invalid language tag, defined
  charset */,
  ";param*xx*=utf-8''value",
  ";param*0xx*=utf-8''value",
  ";param*xx0*=utf-8''value",
  ";param*0*0*=utf-8''value",
  ";param*0*x*=utf-8''value",
  ";param*x*0*=utf-8''value",
  ";param*x*x*=utf-8''value"
};

    [Test]
    public void TestParseIDB() {
      // NOTE: The following tests implementation-dependent behavior
      // since RFC 2231 doesn't provide for this case.
      ContentDisposition mt;
      IDictionary<string, string> parameters;
      mt =

  ParseAndTestAspects("inline;param=value1;param1*=utf-8''value2;param1*0=value3");
      parameters = mt.Parameters;
      Assert.AreEqual("value3", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param=value1;param1*0=value3;param1*=utf-8''value2");
      parameters = mt.Parameters;
      Assert.AreEqual("value3", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1*0=value3;param=value1;param1*=utf-8''value2");
      parameters = mt.Parameters;
      Assert.AreEqual("value3", parameters["param1"]);
      mt =

  ParseAndTestAspects("inline;param1*0*=utf8''val;param=value1;param1*=utf-8''value2;param1*1*=ue3");
      parameters = mt.Parameters;
      Assert.AreEqual("value3", parameters["param1"]);
      foreach (var str in NoParams) {
        mt = ParseAndTestAspects("inline" + str, null);
        parameters = mt.Parameters;
        IList<string> keys;
        keys = new List<string>(parameters.Keys);
        Assert.AreEqual(0, keys.Count);
        Assert.AreEqual("inline", mt.DispositionType);
      }
 mt =
  ParseAndTestAspects("inline; charset*0=ab;charset*1*=iso-8859-1'en'xyz");
      {
        string stringTemp = mt.GetParameter("charset");
        Assert.AreEqual(
          "ab",
          stringTemp);
      }
      Assert.AreEqual("inline", mt.DispositionType);
      if (mt.GetParameter("charset*0") != null) {
        Assert.Fail();
      }
      if (mt.GetParameter("charset*1*") != null) {
        Assert.Fail();
      }
      mt =

  ParseAndTestAspects("inline; charset*0*=utf-8''a%20b;charset*1*=iso-8859-1'en'xyz");
      {
        string stringTemp = mt.GetParameter("charset");
        Assert.AreEqual(
          "a b",
          stringTemp);
      }
      Assert.AreEqual("inline", mt.DispositionType);
      if (mt.GetParameter("charset*0") != null) {
        Assert.Fail();
      }
      if (mt.GetParameter("charset*1*") != null) {
        Assert.Fail();
      }
    }

    internal static readonly string[] ParseErrors = {
";x=,y", ";x=x.z,y", ";x=y,", ";x=y,y", ";x=y;",
  ";x=[y", ";x=x.z[y", ";x=y[", ";x=y[y",
  ";x=]y", ";x=x.z]y", ";x=y]", ";x=y]y",
      ";x *=y", ";x *0=y", ";x *0*=y",
  ";x *=utf-8''y", ";x *0=utf-8''y", ";x *0*=utf-8''y",

";x=x.z y", ";x=y y", ";x=x_z y",
  ";,y=x", ";x.z,y=x", ";y=x,", ";x=y,y=x",
  ";[y=x", ";x.z[y=x", ";y[=x", ";x=y[y=x",
  ";]y=x", ";x.z]y=x", ";y]=x", ";x=y]y=x",
  ";x.z y=x", ";y y=x", ";x_z y=x",
      ";;x=y", ";x=y;;y=z", ";x=y,z=w", ",x=y", ";x=y,x=z",
  ";x==x", ";x==?utf-8?q?x?=", ";x;z=w", ";x;x=y",
  ";x=?utf-8?q?x?=",
  ";x=?x", ";x=?utf-8?q?x?=",
     ";x=a b;x=y",
  ";x=a, b;x=y",
      ";x=a x=y",
  ";x=a,x=y",
      "x=y", ":x=y", " x=y", "/x=y",
      ";x=y;z", "=y;z", "=y",
 ";x==?utf-8*x?q?x?=", "\"x=y\";x=z",
      "\"x=y;x=z\"", "x=y;\"x=z\"",
      ";x=\"y", ";x=\"y\"z", ";x=z\"y\"",
      ";x=z\"y\"z",
      ";x=z\"y?,\"z",
      ";x=z\"y?;?\"z"
};

    [Test]
    public void TestParseErrors() {
      foreach (string str in ContentDispositionTest.ParseErrors) {
        Assert.IsNull(ParseAndTestAspects("inline" + str, null), str);
      }
      if (ParseAndTestAspects("inl/ine;y=z", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects("inline=x;y=z", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects("inline=x", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(":inline;y=z", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(":inline", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(";inline;y=z", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(";inline", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(";x=y", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(";x=y;z=w", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(" ; x=y", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(" ; x=y;z=w", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(" ;x=y", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects(" ;x=y;z=w", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects("??;x=y", null) != null) {
        Assert.Fail();
      }
      if (ParseAndTestAspects("??;x=y;z=w", null) != null) {
        Assert.Fail();
      }
    }

    [Test]
    public void TestToString() {
      // not implemented yet
    }

    [Test]
    public void TestToSingleLineString() {
      // not implemented yet
    }
  }
}
