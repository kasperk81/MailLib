/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://peteroupc.github.io/
 */
using System;
using PeterO;
using PeterO.Mail;

namespace PeterO.Mail.Transforms {
  internal sealed class SevenBitTransform : IByteReader {
    private readonly IByteReader transform;

    public SevenBitTransform(IByteReader stream) {
      this.transform = stream;
    }

    public int ReadByte() {
      int ret = this.transform.ReadByte();
      if (ret > 0x80 || ret == 0) {
          throw new MessageDataException("Invalid character in message body");
      }
      return ret;
    }
  }
}
