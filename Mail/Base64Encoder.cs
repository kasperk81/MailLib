/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */
using System;
using System.IO;
using System.Text;

using PeterO.Text;

namespace PeterO.Mail {
    /// <summary>Encodes binary data in Base64.</summary>
  internal sealed class Base64Encoder : ICharacterEncoder
  {
    private static readonly byte[] Base64Classic = {
  0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x4d,
  0x4e, 0x4f, 0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5a,
  0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d,
  0x6e, 0x6f, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a,
        0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x2b, 0x2f
      };

    private int lineCount;
    private int quantumCount;
    private int byte1;
    private int byte2;
    private bool padding;
    private bool lenientLineBreaks;
    private bool haveCR;
    private bool unlimitedLineLength;
    private byte[] alphabet;

    private bool finalized;

    private static byte[] StringAlphabetToBytes(string alphabetString) {
      if (alphabetString == null) {
        throw new ArgumentNullException("alphabet");
      }
      if (alphabetString.Length != 64) {
      throw new ArgumentException("alphabet.Length (" + alphabetString.Length +
          ") is not equal to 64");
      }
      var alphabet = new byte[64];
      for (var i = 0; i < alphabetString.Length; ++i) {
        if (alphabetString[i ]>= 0x100) {
 throw new ArgumentException("alphabet string contains a non-Latin1 character");
}
        alphabet[i ]=(byte)alphabetString[i];
      }
      return alphabet;
    }

    public Base64Encoder(
bool padding,
bool lenientLineBreaks,
bool unlimitedLineLength) : this(
padding,
lenientLineBreaks,
unlimitedLineLength,
Base64Classic) {
    }

        public Base64Encoder(
bool padding,
bool lenientLineBreaks,
bool unlimitedLineLength,
string alphabetString) : this(
padding,
lenientLineBreaks,
unlimitedLineLength,
StringAlphabetToBytes(alphabetString)) {
    }

    public Base64Encoder(
bool padding,
bool lenientLineBreaks,
bool unlimitedLineLength,
byte[] alphabet) {
      if (alphabet == null) {
        throw new ArgumentNullException("alphabet");
      }
      if (alphabet.Length != 64) {
        throw new ArgumentException("alphabet.Length (" + alphabet.Length +
          ") is not equal to 64");
      }
      this.padding = padding;
      this.unlimitedLineLength = unlimitedLineLength;
      this.lenientLineBreaks = lenientLineBreaks;
      this.byte1 = -1;
      this.byte2 = -1;
      this.alphabet = alphabet;
    }

    private int LineAwareAppend(Stream output, byte c) {
      int charCount = 0;
      if (!this.unlimitedLineLength) {
        if (this.lineCount >= 76) {
          output.WriteByte((byte)0x0d);
          output.WriteByte((byte)0x0a);
          charCount += 2;
          this.lineCount = 0;
        }
        ++this.lineCount;
      }
      output.WriteByte((byte)c);
      return 1 + charCount;
    }

    private int LineAwareAppendFour(
Stream stream,
byte c1,
byte c2,
byte c3,
byte c4) {
      int charCount = 0;
      if (!this.unlimitedLineLength) {
        if (this.lineCount >= 76) {
          // Output CRLF
          stream.WriteByte((byte)0x0d);
          stream.WriteByte((byte)0x0a);
          charCount += 2;
          this.lineCount = 0;
        } else if (this.lineCount + 3 >= 76) {
          charCount += this.LineAwareAppend(stream, c1);
          charCount += this.LineAwareAppend(stream, c2);
          charCount += this.LineAwareAppend(stream, c3);
          charCount += this.LineAwareAppend(stream, c4);
          return charCount;
        }
        this.lineCount += 4;
      }
      stream.WriteByte((byte)c1);
      stream.WriteByte((byte)c2);
      stream.WriteByte((byte)c3);
      stream.WriteByte((byte)c4);
      return 4 + charCount;
    }

    private int AddByteInternal(Stream output, byte b) {
      int ib = ((int)b) & 0xff;
      if (this.quantumCount == 2) {
        int ret = this.LineAwareAppendFour(
output,
          this.alphabet[(this.byte1 >> 2) & 63],
 this.alphabet[((this.byte1 & 3) << 4) + ((this.byte2 >> 4) & 15)],
          this.alphabet[((this.byte2 & 15) << 2) + ((ib >> 6) & 3)],
          this.alphabet[ib & 63]);
        this.byte1 = -1;
        this.byte2 = -1;
        this.quantumCount = 0;
        return ret;
      } else if (this.quantumCount == 1) {
        this.byte2 = ib;
        this.quantumCount = 2;
        return 0;
      } else {
        this.byte1 = ib;
        this.quantumCount = 1;
        return 0;
      }
    }

    private int FinalizeEncoding(Stream stream) {
      int count = 0;
      if (this.quantumCount == 2) {
        byte c1 = this.alphabet[(this.byte1 >> 2) & 63];
        byte c2 = this.alphabet[((this.byte1 & 3) << 4) + ((this.byte2 >> 4) &
          15)];
        byte c3 = this.alphabet[((this.byte2 & 15) << 2)];
        if (this.padding) {
          count += this.LineAwareAppendFour(stream, c1, c2, c3, (byte)'=');
        } else {
          count += this.LineAwareAppend(stream, c1);
          count += this.LineAwareAppend(stream, c2);
          count += this.LineAwareAppend(stream, c3);
        }
        this.byte1 = -1;
        this.byte2 = -1;
        this.quantumCount = 0;
      } else if (this.quantumCount == 1) {
        byte c1 = this.alphabet[(this.byte1 >> 2) & 63];
        byte c2 = this.alphabet[((this.byte1 & 3) << 4)];
        if (this.padding) {
       count += this.LineAwareAppendFour(stream, c1, c2, (byte)'=' , (byte)'='
);
        } else {
          count += this.LineAwareAppend(stream, c1);
          count += this.LineAwareAppend(stream, c2);
        }
        this.byte1 = -1;
        this.byte2 = -1;
        this.quantumCount = 0;
      }
      this.haveCR = false;
      this.finalized = true;
      return count;
    }

    public int Encode(int b, Stream output) {
      if (b < 0) {
        return this.finalized ? (-1) : this.FinalizeEncoding(output);
      }
      b &= 0xff;
      int count = 0;
      if (this.lenientLineBreaks) {
        if (b == 0x0d) {
          // CR
          this.haveCR = true;
          count += this.AddByteInternal(output, (byte)0x0d);
          count += this.AddByteInternal(output, (byte)0x0a);
          return count;
        }
        if (b == 0x0a && !this.haveCR) {
          // bare LF
          if (this.haveCR) {
            // Do nothing, this is an LF that follows CR
            this.haveCR = false;
          } else {
            count += this.AddByteInternal(output, (byte)0x0d);
            count += this.AddByteInternal(output, (byte)0x0a);
            this.haveCR = false;
          }
          return count;
        }
      }
      count += this.AddByteInternal(output, (byte)b);
      this.haveCR = false;
      return count;
    }
  }
}
