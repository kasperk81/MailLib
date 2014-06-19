/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.com/d/
 */
using System;

namespace PeterO.Mail {
    /// <summary>A lightweight version of MemoryStream, since it doesn't
    /// derive from Stream and doesn't use IO exceptions.</summary>
  internal sealed class ArrayWriter {
    private int retvalPos;
    private int retvalMax;
    private byte[] retval;

    public ArrayWriter() : this(16) {
    }

    public ArrayWriter(int initialSize) {
      this.retval = new byte[initialSize];
    }

    public void SetLength(int length) {
      if (length < 0) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (length > this.retvalMax) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)this.retvalMax, System.Globalization.CultureInfo.InvariantCulture));
      }
      this.retvalMax = length;
      if (this.retvalPos > this.retvalMax) {
        this.retvalPos = this.retvalMax;
      }
    }

    public int Position {
      get {
        return this.retvalPos;
      }

      set {
        if (value < 0) {
          throw new ArgumentException("value (" + Convert.ToString((int)value, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
        }
        if (value > this.retvalMax) {
          throw new ArgumentException("value (" + Convert.ToString((int)value, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)this.retvalMax, System.Globalization.CultureInfo.InvariantCulture));
        }
        this.retvalPos = value;
      }
    }

    public byte[] ToArray() {
      var ret = new byte[this.retvalMax];
      Array.Copy(this.retval, 0, ret, 0, this.retvalMax);
      return ret;
    }

    public int ReadBytes(byte[] src, int offset, int length) {
      if (src == null) {
        throw new ArgumentNullException("src");
      }
      if (offset < 0) {
        throw new ArgumentException("offset (" + Convert.ToString((int)offset, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (offset > src.Length) {
        throw new ArgumentException("offset (" + Convert.ToString((int)offset, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)src.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (length < 0) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (length > src.Length) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)src.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (src.Length - offset < length) {
        throw new ArgumentException("src's length minus " + offset + " (" + Convert.ToString((int)(src.Length - offset), System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture));
      }
      int maxLength = Math.Min(length, this.retvalMax - this.retvalPos);
      Array.Copy(this.retval, this.retvalPos, src, offset, maxLength);
      this.retvalPos = checked(this.retvalPos + maxLength);
      this.retvalMax = Math.Max(this.retvalMax, this.retvalPos);
      return maxLength;
    }

    public void WriteBytes(byte[] src, int offset, int length) {
      if (src == null) {
        throw new ArgumentNullException("src");
      }
      if (offset < 0) {
        throw new ArgumentException("offset (" + Convert.ToString((int)offset, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (offset > src.Length) {
        throw new ArgumentException("offset (" + Convert.ToString((int)offset, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)src.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (length < 0) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (length > src.Length) {
        throw new ArgumentException("length (" + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((int)src.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (src.Length - offset < length) {
        throw new ArgumentException("src's length minus " + offset + " (" + Convert.ToString((int)(src.Length - offset), System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + Convert.ToString((int)length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (this.retval.Length - this.retvalPos < length) {
        // Array too small, make it grow
        int newLength = Math.Max(this.retvalPos + length + 1000, this.retval.Length * 2);
        var newArray = new byte[newLength];
        Array.Copy(this.retval, 0, newArray, 0, this.retvalPos);
        this.retval = newArray;
      }
      Array.Copy(src, offset, this.retval, this.retvalPos, length);
      this.retvalPos = checked(this.retvalPos + length);
      this.retvalMax = Math.Max(this.retvalMax, this.retvalPos);
    }
  }
}
