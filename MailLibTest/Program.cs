/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://peteroupc.github.io/
 */
using System;
using System.IO;
using PeterO.Mail;

namespace MailLibTest {
  internal class Program {
    public static void Main() {
      new UnitTest1().TestMessageCoaHtml();
      var strs = new string[0];
      Console.WriteLine("------");
      foreach (var s in strs) {
        var sc = PeterO.Mail.ContentDisposition.MakeFilename(s);
        Console.WriteLine(s);
        Console.WriteLine(sc);
        Console.WriteLine(s == sc);
      }
    }
  }
}
