using System;
using System.Text;
using PeterO.Text;
using Microsoft.VisualStudio.TestTools.UnitTesting;
namespace MailLibTest {
  [TestClass]
  public partial class NormalizingCharacterInputTest {
    [TestMethod]
    public void TestConstructor() {
      // not implemented yet
    }
    [TestMethod]
    public void TestGetChars() {
      // not implemented yet
    }

    public static string RandomAscii(Random rnd) {
      int length = rnd.Next(50) + 1;
      var sb = new StringBuilder();
      for (var i = 0;i< length; ++i) {
        var c = (char)rnd.Next(128);
        sb.Append(c);
      }
      return sb.ToString();
    }

    public static string RandomLatinOne(Random rnd) {
      int length = rnd.Next(50) + 1;
      var sb = new StringBuilder();
      for (var i = 0; i < length; ++i) {
        var c = (char)rnd.Next(256);
        sb.Append(c);
      }
      return sb.ToString();
    }

    [TestMethod]
public void TestNormalizationAscii() {
  var rnd = new Random();
  for (var i = 0; i < 50000; ++i) {
    string str = RandomAscii(rnd);
    // ASCII strings are already normalized
    Assert.IsTrue(NormalizingCharacterInput.IsNormalized(
      str,
      Normalization.NFC));
    Assert.IsTrue(NormalizingCharacterInput.IsNormalized(
      str,
      Normalization.NFD));
    Assert.IsTrue(NormalizingCharacterInput.IsNormalized(
      str,
      Normalization.NFKC));
    Assert.IsTrue(NormalizingCharacterInput.IsNormalized(
      str,
      Normalization.NFKD));
    // ASCII strings normalize to themselves
    string str2 = NormalizingCharacterInput.Normalize(str,
      Normalization.NFC);
    Assert.AreEqual(str, str2);
    str2 = NormalizingCharacterInput.Normalize(str,
      Normalization.NFD);
    Assert.AreEqual(str, str2);
    str2 = NormalizingCharacterInput.Normalize(str,
      Normalization.NFKC);
    Assert.AreEqual(str, str2);
    str2 = NormalizingCharacterInput.Normalize(str,
      Normalization.NFKD);
    Assert.AreEqual(str, str2);
  }
}

    [TestMethod]
public void TestNormalizationLatinOne() {
  var rnd = new Random();
  for (var i = 0; i < 50000; ++i) {
    string str = RandomLatinOne(rnd);
    // Latin-1 strings are already normalized in NFC
    Assert.IsTrue(NormalizingCharacterInput.IsNormalized(
      str,
      Normalization.NFC));
    // Latin-1 strings normalize to themselves in NFC
    string str2 = NormalizingCharacterInput.Normalize(str,
      Normalization.NFC);
    Assert.AreEqual(str, str2);
  }
}

    [TestMethod]
    public void TestIsNormalized() {
      // Additional normalization tests
      Assert.IsFalse(NormalizingCharacterInput.IsNormalized(
        "x\u0300\u0323yz",
        Normalization.NFC));
      Assert.IsFalse(NormalizingCharacterInput.IsNormalized(
        "x\u0300\u0323",
        Normalization.NFC));
      try {
        NormalizingCharacterInput.IsNormalized((ICharacterInput)null,
          Normalization.NFC);
        Assert.Fail("Should have failed");
      } catch (ArgumentNullException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      Assert.IsTrue(
NormalizingCharacterInput.IsNormalized(
new int[] { 0x1d800, 0x1d900, 0x1da00, 0x1db00, 0x1dc00, 0x1df00 },
Normalization.NFC));
      Assert.IsTrue(
      NormalizingCharacterInput.IsNormalized(
       new int[] { 0x1d800, 0x1d900, 0x1da00, 0x1db00, 0x1dc00, 0x1df00 },
         Normalization.NFD));
      Assert.IsTrue(
      NormalizingCharacterInput.IsNormalized(
       new int[] { 0x1d800, 0x1d900, 0x1da00, 0x1db00, 0x1dc00, 0x1df00 },
         Normalization.NFKC));
      Assert.IsTrue(
      NormalizingCharacterInput.IsNormalized(
       new int[] { 0x1d800, 0x1d900, 0x1da00, 0x1db00, 0x1dc00, 0x1df00 },
         Normalization.NFKD));
    }
    [TestMethod]
    public void TestNormalize() {
      // not implemented yet
    }
    [TestMethod]
    public void TestRead() {
      var nci = new NormalizingCharacterInput("test");
      try {
        nci.Read(null, 0, 0);
        Assert.Fail("Should have failed");
      } catch (ArgumentNullException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      try {
        nci.Read(new int[] { 't' }, -1, 1);
        Assert.Fail("Should have failed");
      } catch (ArgumentException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      try {
        nci.Read(new int[] { 't' }, 5, 1);
        Assert.Fail("Should have failed");
      } catch (ArgumentException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      try {
        nci.Read(new int[] { 't' }, 0, -1);
        Assert.Fail("Should have failed");
      } catch (ArgumentException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      try {
        nci.Read(new int[] { 't' }, 0, 5);
        Assert.Fail("Should have failed");
      } catch (ArgumentException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      try {
        nci.Read(new int[] { 't', 't' }, 1, 2);
        Assert.Fail("Should have failed");
      } catch (ArgumentException) {
        Console.Write(String.Empty);
} catch (Exception ex) {
        Assert.Fail(ex.ToString());
        throw new InvalidOperationException(String.Empty, ex);
      }
      Assert.AreEqual(1, nci.Read(new int[] { 't', 't' }, 1, 1));
    }
    [TestMethod]
    public void TestReadChar() {
      // not implemented yet
    }
  }
}