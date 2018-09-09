using System;
using NUnit.Framework;
using PeterO.Text;

namespace MailLibTest {
  [TestFixture]
  public class IdnaTest {
    [Test]
    public void TestEncodeDomainName() {
      string tmp;
      tmp = "ascii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "-ascii-1-";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "-ascii-1";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "ascii-1-";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "1ascii-1";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "2ascii-1-";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "as.cii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "as&cii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "as`cii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "\rascii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "\nascii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      tmp = "\u007fascii";
      Assert.AreEqual(tmp, Idna.EncodeDomainName(tmp));
      // Test other aspects of Punycode
      {
        string stringTemp = Idna.EncodeDomainName("e\u00e1");
        Assert.AreEqual(
        "xn--e-ufa",
        stringTemp);
      }
    }
    [Test]
    public void TestDecodeDomainName() {
      {
string stringTemp = Idna.DecodeDomainName("xn--e-ufa");
Assert.AreEqual(
  "e\u00e1",
  stringTemp);
}
      {
string stringTemp = Idna.DecodeDomainName("xn--e-ufa.example");
Assert.AreEqual(
  "e\u00e1.example",
  stringTemp);
}
      {
string stringTemp = Idna.DecodeDomainName("site.xn--e-ufa.example");
Assert.AreEqual(
  "site.e\u00e1.example",
  stringTemp);
}
    }

    [Test]
    public void TestProtocolStrings2() {

Assert.AreNotEqual(
ProtocolStrings.NicknameForComparison("a"),
ProtocolStrings.NicknameForComparison("b"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("  Swan  of   Avon   "),
      ProtocolStrings.NicknameForComparison("swan of avon"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("Foo"),
      ProtocolStrings.NicknameForComparison("foo"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("foo"),
      ProtocolStrings.NicknameForComparison("foo"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("Foo Bar"),
      ProtocolStrings.NicknameForComparison("foo bar"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("foo bar"),
      ProtocolStrings.NicknameForComparison("foo bar"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("Σ"),
      ProtocolStrings.NicknameForComparison("σ"));
      Assert.AreNotEqual(
      ProtocolStrings.NicknameForComparison("Σ"),
      ProtocolStrings.NicknameForComparison("ς"));
      Assert.AreNotEqual(
      ProtocolStrings.NicknameForComparison("σ"),
      ProtocolStrings.NicknameForComparison("ς"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("Richard Ⅳ"),
      ProtocolStrings.NicknameForComparison("richard iv"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("Å"),
      ProtocolStrings.NicknameForComparison("å"));
      Assert.AreEqual(
      ProtocolStrings.NicknameForComparison("ﬀ"),
      ProtocolStrings.NicknameForComparison("ff"));
      Assert.AreNotEqual(
      ProtocolStrings.NicknameForComparison("ß"),
      ProtocolStrings.NicknameForComparison("sS"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("‌a"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("‌ا"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ج‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ؐ‌ؐا"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("جؐ‌ؐ"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ج‌ا"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("جؐ‌ؐا"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("جؐؐ‌ؐؐا"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("جؐ‌ا"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ج‌ؐا"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ‌ج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲؐ‌ؐج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲؐؐ‌ؐؐج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲؐ‌ج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ‌ؐج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("੍‌"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ੍‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ꡲ੍ؐ‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ꡲ੍ؐ‌"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("્‌"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ્‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ꡲ્ؐ‌"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("ꡲ્ؐ‌"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ્‌ج"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ‌્ج"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("‍"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("‍a"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a‍"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("੍‍"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ꡲ੍‍"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("੍a‍"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("·"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("l·"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("·l"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a·"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("l·a"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a·a"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("l·l"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("al·la"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("͵"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("͵a"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("α͵"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("͵α"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("α͵α"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("͵͵α"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("α͵͵α"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("׳"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("׳ה"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a׳b"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ש׳"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ש׳׳׳"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("״"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("״ה"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("a״b"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ש״"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("ש״״״"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("aש״״״"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("・"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("abc・"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("・def"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("abc・def"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("aヅc・def"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("abc・dぶf"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("⺐bc・def"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("١٢٣٤٥۶"));
      Assert.IsFalse(ProtocolStrings.IsInFreeformClass("۱۲۳۴۵٦"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("١٢٣٤٥"));
      Assert.IsTrue(ProtocolStrings.IsInFreeformClass("۱۲۳۴۵"));
      Assert.AreEqual("Swan of Avon",
      ProtocolStrings.NicknameEnforce("  Swan  of   Avon   "));
      Assert.AreEqual(null,
      ProtocolStrings.NicknameEnforce(" "));
      Assert.AreEqual(null,
      ProtocolStrings.NicknameEnforce("  "));
      Assert.AreEqual("a a a a a a a a a a a a a a a a a",
      ProtocolStrings.NicknameEnforce("a a a a a a a a a a a a a a a a　a"));
      Assert.AreEqual("Foo",
      ProtocolStrings.NicknameEnforce("Foo"));
      Assert.AreEqual("foo",
      ProtocolStrings.NicknameEnforce("foo"));
      Assert.AreEqual("Foo Bar",
      ProtocolStrings.NicknameEnforce("Foo Bar"));
      Assert.AreEqual("foo bar",
      ProtocolStrings.NicknameEnforce("foo bar"));
      Assert.AreEqual("Σ",
      ProtocolStrings.NicknameEnforce("Σ"));
      Assert.AreEqual("σ",
      ProtocolStrings.NicknameEnforce("σ"));
      Assert.AreEqual("ς",
      ProtocolStrings.NicknameEnforce("ς"));
      Assert.AreEqual("♚",
      ProtocolStrings.NicknameEnforce("♚"));
      Assert.AreEqual("Richard IV",
      ProtocolStrings.NicknameEnforce("Richard Ⅳ"));
      Assert.AreEqual("Å",
      ProtocolStrings.NicknameEnforce("Å"));
      Assert.AreEqual("ff",
      ProtocolStrings.NicknameEnforce("ﬀ"));
      Assert.AreEqual("שa",
      ProtocolStrings.NicknameEnforce("שa"));
      Assert.AreEqual("동일조건변경허락",
      ProtocolStrings.NicknameEnforce("동일조건변경허락"));
      Assert.AreEqual("  Swan  of   Avon   ",
      ProtocolStrings.OpaqueStringEnforce("  Swan  of   Avon   "));
      Assert.AreEqual(" ",
      ProtocolStrings.OpaqueStringEnforce(" "));
      Assert.AreEqual("  ",
      ProtocolStrings.OpaqueStringEnforce("  "));
      Assert.AreEqual("a a a a a a a a a a a a a a a a a",
      ProtocolStrings.OpaqueStringEnforce("a a a a a a a a a a a a a a a a　a"));
      Assert.AreEqual("Foo",
      ProtocolStrings.OpaqueStringEnforce("Foo"));
      Assert.AreEqual("foo",
      ProtocolStrings.OpaqueStringEnforce("foo"));
      Assert.AreEqual("Foo Bar",
      ProtocolStrings.OpaqueStringEnforce("Foo Bar"));
      Assert.AreEqual("foo bar",
      ProtocolStrings.OpaqueStringEnforce("foo bar"));
      Assert.AreEqual("σ",
      ProtocolStrings.OpaqueStringEnforce("σ"));
      Assert.AreEqual("Richard Ⅳ",
      ProtocolStrings.OpaqueStringEnforce("Richard Ⅳ"));
      Assert.AreEqual("Å",
      ProtocolStrings.OpaqueStringEnforce("Å"));
      Assert.AreEqual("Jack of ♦s",
      ProtocolStrings.OpaqueStringEnforce("Jack of ♦s"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("my cat is a \tby"));
      Assert.AreEqual("שa",
      ProtocolStrings.OpaqueStringEnforce("שa"));
      Assert.AreEqual("juliet@example.com",
      ProtocolStrings.OpaqueStringEnforce("juliet@example.com"));
      Assert.AreEqual("fussball",
      ProtocolStrings.OpaqueStringEnforce("fussball"));
      Assert.AreEqual("fußball",
      ProtocolStrings.OpaqueStringEnforce("fußball"));
      Assert.AreEqual("π",
      ProtocolStrings.OpaqueStringEnforce("π"));
      Assert.AreEqual("σ",
      ProtocolStrings.OpaqueStringEnforce("Σ"));
      Assert.AreEqual("σ",
      ProtocolStrings.OpaqueStringEnforce("σ"));
      Assert.AreEqual("ς",
      ProtocolStrings.OpaqueStringEnforce("ς"));
      Assert.AreEqual("i",
      ProtocolStrings.OpaqueStringEnforce("I"));
      Assert.AreEqual("i",
      ProtocolStrings.OpaqueStringEnforce("I"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("ϒ"));
      Assert.AreEqual("ΰ",
      ProtocolStrings.OpaqueStringEnforce("ΰ"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("foo bar"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("♚"));
      Assert.AreEqual("~",
      ProtocolStrings.OpaqueStringEnforce("~"));
      Assert.AreEqual("a",
      ProtocolStrings.OpaqueStringEnforce("a"));
      Assert.AreEqual("!",
      ProtocolStrings.OpaqueStringEnforce("!"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("²"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("\t"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("\n"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("⛖"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("⛿"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("ﬀ"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce(" "));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce(" "));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("  "));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("ǅ"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("ᛮ"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("҈"));
      Assert.AreEqual("å",
      ProtocolStrings.OpaqueStringEnforce("Å"));
      Assert.AreEqual("å",
      ProtocolStrings.OpaqueStringEnforce("Å"));
      Assert.AreEqual("å",
      ProtocolStrings.OpaqueStringEnforce("Å"));
      Assert.AreEqual("ç",
      ProtocolStrings.OpaqueStringEnforce("ç"));
      Assert.AreEqual("ç",
      ProtocolStrings.OpaqueStringEnforce("ç"));
      Assert.AreEqual("ř",
      ProtocolStrings.OpaqueStringEnforce("Ř"));
      Assert.AreEqual("ř",
      ProtocolStrings.OpaqueStringEnforce("Ř"));
      Assert.AreEqual("ṡ",
      ProtocolStrings.OpaqueStringEnforce("ṡ"));
      Assert.AreEqual("а",
      ProtocolStrings.OpaqueStringEnforce("А"));
      Assert.AreEqual("ab",
      ProtocolStrings.OpaqueStringEnforce("ＡＢ"));
      Assert.AreEqual(null,
      ProtocolStrings.OpaqueStringEnforce("שc"));
      Assert.AreEqual("ABC",
      ProtocolStrings.UserpartEnforce("ABC", true));
      Assert.AreEqual("AB",
      ProtocolStrings.UserpartEnforce("ＡＢ", true));
      Assert.AreEqual(null,
      ProtocolStrings.UserpartEnforce("שc", true));
      Assert.AreEqual(null,
      ProtocolStrings.UserpartEnforce("ﬀ", true));
      Assert.AreEqual("Å",
      ProtocolStrings.UserpartEnforce("Å", true));
      Assert.AreEqual(null,
      ProtocolStrings.UserpartEnforce("ẛ", true));

    }

    [Test]
    public void TestProtocolStrings() {
      Assert.IsTrue(
       ProtocolStrings.IsInIdentifierClass("test\u007b}[]?^&"));
      Assert.IsTrue(
       ProtocolStrings.IsInFreeformClass("test\u007b}[]?^&"));
      Assert.IsFalse(
       ProtocolStrings.IsInIdentifierClass("test\u007b} []?^&"));
      Assert.IsTrue(
       ProtocolStrings.IsInFreeformClass("test\u007b} []?^&"));
      Assert.AreEqual("σa",
      ProtocolStrings.UsernameEnforce("Σa"));
      Assert.IsFalse(
       ProtocolStrings.IsInIdentifierClass("tes\nt\u007b} []?^&"));
      Assert.IsFalse(
       ProtocolStrings.IsInFreeformClass("tes\nt\u007b} []?^&"));
      {
string stringTemp = ProtocolStrings.UserpartEnforce("TeSt");
Assert.AreEqual(
  "test",
  stringTemp);
}
      {
string stringTemp = ProtocolStrings.UserpartEnforce("TeSt", false);
Assert.AreEqual(
  "test",
  stringTemp);
}
      {
string stringTemp = ProtocolStrings.UserpartEnforce("TeSt", true);
Assert.AreEqual(
  "TeSt",
  stringTemp);
}
      Assert.AreEqual(
       null,
       ProtocolStrings.UserpartEnforce("Te St", false));
      {
string stringTemp = ProtocolStrings.UsernameEnforce("Te St", false);
Assert.AreEqual(
  "te st",
  stringTemp);
}
      {
string stringTemp = ProtocolStrings.UsernameEnforce("Te St", true);
Assert.AreEqual(
  "Te St",
  stringTemp);
}
      // Final capital sigma
      {
string stringTemp = ProtocolStrings.UserpartEnforce("x\u03a3");
Assert.AreEqual(
  "x\u03c2",
  stringTemp);
}
Assert.AreEqual(
  null,
  ProtocolStrings.UsernameEnforce(null));
Assert.AreEqual(
  null,
  ProtocolStrings.UsernameEnforce(String.Empty));
Assert.AreEqual(
  null,
  ProtocolStrings.UserpartEnforce(null));
Assert.AreEqual(
  null,
  ProtocolStrings.UserpartEnforce(String.Empty));
Assert.AreEqual(
  null,
  ProtocolStrings.OpaqueStringEnforce(null));
Assert.AreEqual(
  null,
  ProtocolStrings.OpaqueStringEnforce(String.Empty));
Assert.AreEqual(
  null,
  ProtocolStrings.NicknameEnforce(null));
Assert.AreEqual(
  null,
  ProtocolStrings.NicknameEnforce(String.Empty));
Assert.AreEqual(
  null,
  ProtocolStrings.NicknameForComparison(null));
Assert.AreEqual(
  null,
  ProtocolStrings.NicknameForComparison(String.Empty));

{
string stringTemp = ProtocolStrings.OpaqueStringEnforce("a b ccccc test");
Assert.AreEqual(
  "a b ccccc test",
  stringTemp);
}
{
string stringTemp = ProtocolStrings.NicknameEnforce("a b ccccc test");
Assert.AreEqual(
  "a b ccccc test",
  stringTemp);
}
{
string stringTemp = ProtocolStrings.NicknameEnforce("  a b ccccc test  ");
Assert.AreEqual(
  "a b ccccc test",
  stringTemp);
}
{
string stringTemp = ProtocolStrings.NicknameEnforce("  a b ccccc   test  ");
Assert.AreEqual(
  "a b ccccc test",
  stringTemp);
}
{
string stringTemp =
  ProtocolStrings.NicknameEnforce("  a b\u00a0ccccc   test  ");
Assert.AreEqual(
  "a b ccccc test",
  stringTemp);
}
Assert.AreEqual(
  null,
  ProtocolStrings.OpaqueStringEnforce("a\ntest"));
{
string stringTemp = ProtocolStrings.OpaqueStringEnforce("A b Ccccc tEst");
Assert.AreEqual(
  "A b Ccccc tEst",
  stringTemp);
}
{
string stringTemp = ProtocolStrings.OpaqueStringEnforce("a\u00e7c");
Assert.AreEqual(
  "a\u00e7c",
  stringTemp);
}
{
string stringTemp = ProtocolStrings.OpaqueStringEnforce("a\u00a0c");
Assert.AreEqual(
  "a c",
  stringTemp);
}
    }
    [Test]
    public void TestIsValidDomainName() {
      Assert.IsTrue(Idna.IsValidDomainName("el\u00b7la", false));
      Assert.IsFalse(Idna.IsValidDomainName("-domain", false));
      Assert.IsFalse(Idna.IsValidDomainName("domain-", false));
      Assert.IsTrue(Idna.IsValidDomainName("xn--e-ufa", false));
      Assert.IsTrue(Idna.IsValidDomainName("xn--e-ufa.example", false));
      Assert.IsFalse(Idna.IsValidDomainName("ab--e-ufa", false));
      Assert.IsFalse(Idna.IsValidDomainName("ab--e-ufa.example", false));
      Assert.IsFalse(Idna.IsValidDomainName("xn--", false));
      Assert.IsFalse(Idna.IsValidDomainName("xn--.example", false));
      Assert.IsFalse(Idna.IsValidDomainName("example.xn--", false));
      // Label starting with digit is valid since there are no RTL labels
      Assert.IsTrue(Idna.IsValidDomainName("1domain.example", false));
      // Label starting with digit is not valid since there are RTL labels
      Assert.IsFalse(
  Idna.IsValidDomainName(
  "1domain.example.\u05d0\u05d0",
  false));
      Assert.IsFalse(
  Idna.IsValidDomainName(
  "\u05d0\u05d0.1domain.example",
  false));
      Assert.IsFalse(Idna.IsValidDomainName("el\u00b7", false));
      Assert.IsFalse(Idna.IsValidDomainName("el\u00b7ma", false));
      Assert.IsFalse(Idna.IsValidDomainName("em\u00b7la", false));
      // 0x300 is the combining grave accent
      Assert.IsFalse(Idna.IsValidDomainName("\u0300xyz", false));
      Assert.IsTrue(Idna.IsValidDomainName("x\u0300yz", false));
      // Has white space
      Assert.IsFalse(Idna.IsValidDomainName("x\u0300y z", false));
      // 0x323 is dot below, with a lower combining
      // class than grave accent
      Assert.IsTrue(Idna.IsValidDomainName("x\u0323\u0300yz", false));
      // Not in NFC, due to the reordered combining marks
      Assert.IsFalse(Idna.IsValidDomainName("x\u0300\u0323yz", false));
      // 0xffbf is unassigned as of Unicode 6.3
      Assert.IsFalse(Idna.IsValidDomainName("x\uffbfyz", false));
      // 0xffff is a noncharacter
      Assert.IsFalse(Idna.IsValidDomainName("x\uffffyz", false));
      // 0x3042 is hiragana A, 0x30a2 is katakana A,
      // and 0x5000 is a Han character
      Assert.IsFalse(Idna.IsValidDomainName("xy\u30fb", false));
      Assert.IsTrue(Idna.IsValidDomainName("xy\u3042\u30fb", false));
      Assert.IsTrue(Idna.IsValidDomainName("xy\u30a2\u30fb", false));
      Assert.IsTrue(Idna.IsValidDomainName("xy\u5000\u30fb", false));
      // ZWJ preceded by virama
      Assert.IsTrue(Idna.IsValidDomainName("xy\u094d\u200dz", false));
      Assert.IsFalse(Idna.IsValidDomainName("xy\u200dz", false));

  Assert.IsFalse(
  Idna.IsValidDomainName(
  "\ua840\u0300\u0300\u200d\u0300\u0300\ua840",
  false));
      // ZWNJ preceded by virama
      Assert.IsTrue(Idna.IsValidDomainName("xy\u094d\u200cz", false));
      Assert.IsFalse(Idna.IsValidDomainName("xy\u200cz", false));
      // Dual-joining character (U + A840, Phags-pa KA) on both sides
      Assert.IsTrue(Idna.IsValidDomainName("\ua840\u200c\ua840", false));
      // Dual-joining character with intervening T-joining characters
      Assert.IsTrue(
  Idna.IsValidDomainName(
  "\ua840\u0300\u0300\u200c\ua840",
  false));

  Assert.IsTrue(
  Idna.IsValidDomainName(
  "\ua840\u0300\u0300\u200c\u0300\u0300\ua840",
  false));
      // Left-joining character (U + A872, the only such character
      // in Unicode 6.3, with Bidi type L) on left side
      Assert.IsTrue(Idna.IsValidDomainName("\ua872\u200c\ua840", false));

  Assert.IsTrue(
  Idna.IsValidDomainName(
  "\ua872\u0300\u0300\u200c\u0300\u0300\ua840",
  false));
      // Left-joining character on right side
      Assert.IsFalse(Idna.IsValidDomainName("\ua840\u200c\ua872", false));

  Assert.IsFalse(
  Idna.IsValidDomainName(
  "\ua840\u0300\u0300\u200c\u0300\u0300\ua872",
  false));
      // Nonjoining character on right side
      Assert.IsFalse(Idna.IsValidDomainName("\ua840\u200cx", false));

  Assert.IsFalse(
  Idna.IsValidDomainName(
  "\ua840\u0300\u0300\u200c\u0300\u0300x",
  false));
      // Nonjoining character on left side
      Assert.IsFalse(Idna.IsValidDomainName("x\u200c\ua840", false));

  Assert.IsFalse(
  Idna.IsValidDomainName(
  "x\u0300\u0300\u200c\u0300\u0300\ua840",
  false));
      // Consecutive ZWNJs
      Assert.IsFalse(Idna.IsValidDomainName("\ua840\u200c\u200c\ua840", false));

      // Keraia
      Assert.IsTrue(Idna.IsValidDomainName("x\u0375\u03b1", false));  // Greek
      Assert.IsFalse(Idna.IsValidDomainName("x\u0375a", false));  // Non-Greek
      // Geresh and gershayim
      Assert.IsTrue(Idna.IsValidDomainName("\u05d0\u05f3", false));  // Hebrew
      // Arabic (non-Hebrew)
      Assert.IsFalse(Idna.IsValidDomainName("\u0627\u05f3", false));
      Assert.IsTrue(Idna.IsValidDomainName("\u05d0\u05f4", false));  // Hebrew
      // Arabic (non-Hebrew)
      Assert.IsFalse(Idna.IsValidDomainName("\u0627\u05f4", false));
      // Bidi Rule: Hebrew and Latin in the same label
      Assert.IsFalse(Idna.IsValidDomainName("a\u05d0", false));  // Hebrew
      Assert.IsFalse(Idna.IsValidDomainName("\u05d0a", false));  // Hebrew
      // Arabic-indic digits and extended Arabic-indic digits
      Assert.IsFalse(Idna.IsValidDomainName("\u0627\u0660\u06f0\u0627", false));
      // Right-joining character (U + 062F; since the only right-joining
      // characters in Unicode 6.3 have Bidi type R,
      // a different dual-joining character is used, U + 062D, which also has
      // the same Bidi type).
      Assert.IsTrue(Idna.IsValidDomainName("\u062d\u200c\u062f", false));

  Assert.IsTrue(
  Idna.IsValidDomainName(
  "\u062d\u0300\u0300\u200c\u0300\u0300\u062f",
  false));
      // Right-joining character on left side
      Assert.IsFalse(Idna.IsValidDomainName("\u062f\u200c\u062d", false));

  Assert.IsFalse(
  Idna.IsValidDomainName(
  "\u062f\u0300\u0300\u200c\u0300\u0300\u062d",
  false));
      // Regression testa: U + 07FA mistakenly allowed (since
      // U + 07FA has Bidi type R, the other characters in these tests
      // also have Bidi type R).
      Assert.IsFalse(Idna.IsValidDomainName("\u07ca\u07fa\u07ca", false));
      Assert.IsFalse(Idna.IsValidDomainName("\u07fa", false));
    }
  }
}
