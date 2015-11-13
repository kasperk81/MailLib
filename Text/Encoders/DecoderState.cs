using System;
using PeterO.Mail;

namespace PeterO.Text.Encoders {
internal class DecoderState {
  // NOTE: bytes is an int array because some
  // decoders can prepend end-of-stream (-1).
  private int[] bytes;
  private int[] chars;
  private int prependedBytes;
  private int charCount;
  private int charOffset;

  public DecoderState(int initialSize) {
    this.bytes = new int[initialSize];
  }

  public void AppendChar(int ch) {
    this.chars = this.chars ?? (new int[4]);
    if (this.charCount >= this.chars.Length) {
      var newchars = new int[this.chars.Length + 8];
      Array.Copy(this.chars, newchars, this.chars.Length);
      this.chars = newchars;
    }
    this.chars[this.charCount ]=ch;
    ++this.charCount;
  }

  public int GetChar() {
    if (this.charCount == 0) {
 return -1;
}
    int c = this.chars[this.charOffset++];
    if (this.charOffset >= this.charCount) {
      this.charCount = 0;
      this.charOffset = 0;
    }
    return c;
  }

  private class StateToTransform : ITransform {
    ITransform t;
    DecoderState s;
    public StateToTransform(DecoderState s, ITransform t) {
      this.t = t;
      this.s = s;
    }

    public int ReadByte() {
      return s.ReadByte(t);
    }
  }

  public ITransform ToTransform(ITransform stream) {
    return new StateToTransform(this, stream);
  }

  public ITransform ToTransformIfBuffered(ITransform stream) {
    return (this.prependedBytes == 0) ? (stream) : (new StateToTransform(this,
      stream));
  }

  public int ReadByte(ITransform stream) {
   if (this.prependedBytes > 0) {
    --this.prependedBytes;
    int b = this.bytes[this.prependedBytes];
    return b;
   } else {
    return stream.ReadByte();
   }
  }

  public void PrependOne(int b1) {
    if (this.prependedBytes + 1 > this.bytes.Length) {
      var newbytes = new int[this.prependedBytes + 8];
      Array.Copy(this.bytes, newbytes, this.bytes.Length);
      this.bytes = newbytes;
    }
    this.bytes[this.prependedBytes++ ]=b1;
  }

  public void PrependTwo(int b1, int b2) {
    if (this.prependedBytes + 2 > this.bytes.Length) {
      var newbytes = new int[this.prependedBytes + 8];
      Array.Copy(this.bytes, newbytes, this.bytes.Length);
      this.bytes = newbytes;
    }
    this.bytes[this.prependedBytes++ ]=b2;
    this.bytes[this.prependedBytes++ ]=b1;
  }

  public void PrependThree(int b1, int b2, int b3) {
    if (this.prependedBytes + 3 > this.bytes.Length) {
      var newbytes = new int[this.prependedBytes + 8];
      Array.Copy(this.bytes, newbytes, this.bytes.Length);
      this.bytes = newbytes;
    }
    this.bytes[this.prependedBytes++ ]=b3;
    this.bytes[this.prependedBytes++ ]=b2;
    this.bytes[this.prependedBytes++ ]=b1;
  }
}
}
