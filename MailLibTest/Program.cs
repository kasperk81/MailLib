/*
Written by Peter O.
Any copyright to this work is released to the Public Domain.
In case this is not possible, this work is also
licensed under Creative Commons Zero (CC0):
https://creativecommons.org/publicdomain/zero/1.0/

 */
using System;
using System.IO;
using PeterO.Mail;

namespace MailLibTest {
  internal class Program {
    public static void Main() {
      new UnitTest1().TestMessageCoaHtml();
      new UnitTest1().TestMessageCore();
    }
  }
}
