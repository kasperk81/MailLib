/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */
using System;
using System.IO;

namespace PeterO {
    /// <summary>Not documented yet.</summary>
  public static class DataIO {
    private sealed class ByteArrayTransform : IByteReader {
      private byte[] bytes;
      private int offset;
      private int endOffset;

      public ByteArrayTransform(byte[] bytes, int offset, int length) {
        this.bytes = bytes;
        this.offset = offset;
        this.endOffset = offset + length;
      }

    /// <summary>Not documented yet.</summary>
    /// <returns>A 32-bit signed integer.</returns>
      public int ReadByte() {
        if (this.offset >= this.endOffset) {
          return -1;
        }
        int b = this.bytes[this.offset++];
        return ((int)b) & 0xff;
      }
    }

    private sealed class WrappedStream : IByteReader {
      private Stream stream;

      public WrappedStream(Stream stream) {
        this.stream = stream;
      }

    /// <summary>Not documented yet.</summary>
    /// <returns>A 32-bit signed integer.</returns>
      public int ReadByte() {
        try {
          return this.stream.ReadByte();
        } catch (IOException ex) {
          throw new InvalidOperationException(ex.Message, ex);
        }
      }
    }

    private sealed class WrappedOutputStreamFromByteWriter : IWriter {
      private IByteWriter output;

      public WrappedOutputStreamFromByteWriter(IByteWriter output) {
        this.output = output;
      }

    /// <summary>Not documented yet.</summary>
    /// <param name='byteValue'>A 32-bit signed integer.</param>
      public void WriteByte(int byteValue) {
        this.output.WriteByte((byte)byteValue);
      }

    /// <summary>Not documented yet.</summary>
    /// <param name='bytes'>A byte array.</param>
    /// <param name='offset'>A 32-bit signed integer.</param>
    /// <param name='length'>Another 32-bit signed integer.</param>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='bytes'/> is null.</exception>
    /// <exception cref='System.ArgumentException'>Either
    /// &#x22;offset&#x22; or &#x22;length&#x22; is less than 0 or greater
    /// than &#x22;bytes&#x22;&#x27;s length, or &#x22;bytes&#x22;&#x27;s
    /// length minus &#x22;offset&#x22; is less than
    /// &#x22;length&#x22;.</exception>
      public void Write(byte[] bytes, int offset, int length) {
        if (bytes == null) {
          throw new ArgumentNullException("bytes");
        }
        if (offset < 0) {
          throw new ArgumentException("offset (" + offset +
            ") is less than " + 0);
        }
        if (offset > bytes.Length) {
          throw new ArgumentException("offset (" + offset + ") is more than " +
            bytes.Length);
        }
        if (length < 0) {
          throw new ArgumentException("length (" + length +
            ") is less than " + 0);
        }
        if (length > bytes.Length) {
          throw new ArgumentException("length (" + length + ") is more than " +
            bytes.Length);
        }
        if (bytes.Length - offset < length) {
          throw new ArgumentException("bytes's length minus " + offset + " (" +
            (bytes.Length - offset) + ") is less than " + length);
        }
        for (int i = 0; i < length; ++i) {
          this.output.WriteByte((byte)bytes[i]);
        }
      }
    }

    private sealed class WrappedOutputStream : IWriter {
      private Stream output;

      public WrappedOutputStream(Stream output) {
        this.output = output;
      }

    /// <summary>Not documented yet.</summary>
    /// <param name='byteValue'>A 32-bit signed integer.</param>
      public void WriteByte(int byteValue) {
        try {
          this.output.WriteByte((byte)byteValue);
        } catch (IOException ex) {
          throw new InvalidOperationException(ex.Message, ex);
        }
      }

    /// <summary>Not documented yet.</summary>
    /// <param name='bytes'>A byte array.</param>
    /// <param name='offset'>A 32-bit signed integer.</param>
    /// <param name='length'>Another 32-bit signed integer.</param>
    /// <exception cref='System.ArgumentException'>Either
    /// &#x22;offset&#x22; or &#x22;length&#x22; is less than 0 or greater
    /// than &#x22;bytes&#x22;&#x27;s length, or &#x22;bytes&#x22;&#x27;s
    /// length minus &#x22;offset&#x22; is less than
    /// &#x22;length&#x22;.</exception>
    /// <exception cref='System.ArgumentNullException'>The parameter
    /// &#x22;bytes&#x22; is null.</exception>
      public void Write(byte[] bytes, int offset, int length) {
        try {
          this.output.Write(bytes, offset, length);
        } catch (IOException ex) {
          throw new InvalidOperationException(ex.Message, ex);
        }
      }
    }

    /// <summary>Not documented yet.
    /// <para>In the .NET implementation, this method is implemented as an
    /// extension method to any object implementing byte[] and can be
    /// called as follows: <c>bytes.ToTransform()</c>. If the object's
    /// class already has a ToTransform method with the same parameters,
    /// that method takes precedence over this extension
    /// method.</para></summary>
    /// <param name='bytes'>Not documented yet.</param>
    /// <returns>An ITransform object.</returns>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='bytes'/> is null.</exception>
    public static IByteReader ToTransform(this byte[] bytes) {
      if (bytes == null) {
        throw new ArgumentNullException("bytes");
      }
      return new ByteArrayTransform(bytes, 0, bytes.Length);
    }

    /// <summary>Not documented yet.
    /// <para>In the .NET implementation, this method is implemented as an
    /// extension method to any object implementing byte[] and can be
    /// called as follows: <c>bytes.ToTransform(offset, length)</c>. If
    /// the object's class already has a ToTransform method with the same
    /// parameters, that method takes precedence over this extension
    /// method.</para></summary>
    /// <param name='bytes'>Not documented yet.</param>
    /// <param name='offset'>Not documented yet.</param>
    /// <param name='length'>Not documented yet. (3).</param>
    /// <returns>An ITransform object.</returns>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='bytes'/> is null.</exception>
    /// <exception cref='System.ArgumentException'>Either
    /// &#x22;offset&#x22; or &#x22;length&#x22; is less than 0 or greater
    /// than &#x22;bytes&#x22;&#x27;s length, or &#x22;bytes&#x22;&#x27;s
    /// length minus &#x22;offset&#x22; is less than
    /// &#x22;length&#x22;.</exception>
    public static IByteReader ToTransform(
this byte[] bytes,
int offset,
int length) {
      if (bytes == null) {
        throw new ArgumentNullException("bytes");
      }
      if (offset < 0) {
        throw new ArgumentException("offset (" + offset +
          ") is less than " + 0);
      }
      if (offset > bytes.Length) {
        throw new ArgumentException("offset (" + offset + ") is more than " +
          bytes.Length);
      }
      if (length < 0) {
        throw new ArgumentException("length (" + length +
          ") is less than " + 0);
      }
      if (length > bytes.Length) {
        throw new ArgumentException("length (" + length + ") is more than " +
          bytes.Length);
      }
      if (bytes.Length - offset < length) {
        throw new ArgumentException("bytes's length minus " + offset + " (" +
          (bytes.Length - offset) + ") is less than " + length);
      }
      return new ByteArrayTransform(bytes, offset, length);
    }

    /// <summary>Not documented yet.
    /// <para>In the .NET implementation, this method is implemented as an
    /// extension method to any object implementing Stream and can be
    /// called as follows: <c>input.ToTransform()</c>. If the object's
    /// class already has a ToTransform method with the same parameters,
    /// that method takes precedence over this extension
    /// method.</para></summary>
    /// <param name='input'>Not documented yet.</param>
    /// <returns>An ITransform object.</returns>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='input'/> is null.</exception>
    public static IByteReader ToTransform(this Stream input) {
      if (input == null) {
        throw new ArgumentNullException("input");
      }
      return new WrappedStream(input);
    }

    /// <summary>Not documented yet.
    /// <para>In the .NET implementation, this method is implemented as an
    /// extension method to any object implementing Stream and can be
    /// called as follows: <c>output.ToWriter()</c>. If the object's class
    /// already has a ToWriter method with the same parameters, that method
    /// takes precedence over this extension method.</para></summary>
    /// <param name='output'>Not documented yet.</param>
    /// <returns>An IWriter object.</returns>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='output'/> is null.</exception>
    public static IWriter ToWriter(this Stream output) {
      if (output == null) {
        throw new ArgumentNullException("output");
      }
      return new WrappedOutputStream(output);
    }

    /// <summary>Not documented yet.
    /// <para>In the .NET implementation, this method is implemented as an
    /// extension method to any object implementing IByteWriter and can be
    /// called as follows: <c>output.ToWriter()</c>. If the object's class
    /// already has a ToWriter method with the same parameters, that method
    /// takes precedence over this extension method.</para></summary>
    /// <param name='output'>Not documented yet.</param>
    /// <returns>An IWriter object.</returns>
    /// <exception cref='ArgumentNullException'>The parameter <paramref
    /// name='output'/> is null.</exception>
    public static IWriter ToWriter(this IByteWriter output) {
      if (output == null) {
        throw new ArgumentNullException("output");
      }
      return new WrappedOutputStreamFromByteWriter(output);
    }
  }
}
