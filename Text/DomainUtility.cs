/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.com/d/
 */
using System;
using System.Text;
using PeterO;

namespace PeterO.Text {
    /// <summary>Utility methods for domain names.</summary>
  internal static class DomainUtility
  {
    private static int CodePointAt(string str, int index, int endIndex) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (index >= endIndex) {
        return -1;
      }
      if (index < 0) {
        return -1;
      }
      int c = str[index];
      if (c >= 0xd800 && c <= 0xdbff && index + 1 < endIndex &&
          str[index + 1] >= 0xdc00 && str[index + 1] <= 0xdfff) {
        // Get the Unicode code point for the surrogate pair
        c = 0x10000 + ((c - 0xd800) * 0x400) + (str[index + 1] - 0xdc00);
        ++index;
      } else if (c >= 0xd800 && c <= 0xdfff) {
        // unpaired surrogate
        return 0xfffd;
      }
      return c;
    }

    /// <summary>Gets the PunyCode length of a string (PunyCode is defined
    /// in RFC 3492).</summary>
    /// <param name='str'>A string object.</param>
    /// <param name='index'>A 32-bit signed integer.</param>
    /// <param name='endIndex'>A 32-bit signed integer. (2).</param>
    /// <returns>The PunyCode length of the encoded string. If the string
    /// contains non-ASCII characters, returns the PunyCode length plus
    /// 4 (the length of the ACE prefix). If there are only ASCII characters,
    /// returns the length of the string. Returns -1 if an overflow error occurs.</returns>
    public static int PunycodeLength(string str, int index, int endIndex) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (index < 0) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (index > str.Length) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < 0) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (endIndex > str.Length) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < index) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture));
      }
      int n = 128;
      int delta = 0;
      int bias = 72;
      int h = 0;
      int tmpIndex;
      int firstIndex = -1;
      int codePointLength = 0;
      int basicsBeforeFirstNonbasic = 0;
      bool allBasics = true;
      tmpIndex = index;
      while (tmpIndex < endIndex) {
        if (str[tmpIndex] >= 0x80) {
          allBasics = false;
          break;
        }
        ++tmpIndex;
      }
      if (allBasics) {
        return endIndex - index;
      }
      int outputLength = 4;
      tmpIndex = index;
      while (tmpIndex < endIndex) {
        int c = CodePointAt(str, tmpIndex, endIndex);
        ++codePointLength;
        if (c < 0x80) {
          // This is a basic (ASCII) code point
          ++outputLength;
          ++h;
        } else if (firstIndex < 0) {
          firstIndex = tmpIndex;
        }
        // Increment index after setting firstIndex
        tmpIndex += (c >= 0x10000) ? 2 : 1;
      }
      if (h != 0) {
        ++outputLength;
      }
      int b = h;
      if (firstIndex >= 0) {
        basicsBeforeFirstNonbasic = firstIndex - index;
      } else {
        // No non-basic code points
        return endIndex - index;
      }
      while (h < codePointLength) {
        int min = 0x110000;
        tmpIndex = firstIndex;
        while (tmpIndex < endIndex) {
          int c = CodePointAt(str, tmpIndex, endIndex);
          tmpIndex += (c >= 0x10000) ? 2 : 1;
          if (c >= n && c < min) {
            min = c;
          }
        }
        int d = min - n;
        if (d > Int32.MaxValue / (h + 1)) {
          return -1;
        }
        d *= h + 1;
        n = min;
        if (d > Int32.MaxValue - delta) {
          return -1;
        }
        delta += d;
        tmpIndex = firstIndex;
        if (basicsBeforeFirstNonbasic > Int32.MaxValue - delta) {
          return -1;
        }
        delta += basicsBeforeFirstNonbasic;
        while (tmpIndex < endIndex) {
          int c = CodePointAt(str, tmpIndex, endIndex);
          tmpIndex += (c >= 0x10000) ? 2 : 1;
          if (c < n) {
            if (delta == Int32.MaxValue) {
              return -1;
            }
            ++delta;
          } else if (c == n) {
            int q = delta;
            int k = 36;
            while (true) {
              int t;
              if (k <= bias) {
                t = 1;
              } else if (k >= bias + 26) {
                t = 26;
              } else {
                t = k - bias;
              }
              if (q < t) {
                break;
              }
              ++outputLength;
              q -= t;
              q /= 36 - t;
              k += 36;
            }
            ++outputLength;
            delta = (h == b) ? delta / 700 : delta >> 1;
            delta += delta / (h + 1);
            k = 0;
            while (delta > 455) {
              delta /= 35;
              k += 36;
            }
            bias = k + ((36 * delta) / (delta + 38));
            delta = 0;
            ++h;
          }
        }
        ++n;
        ++delta;
      }
      return outputLength;
    }

    private static int[] valueDigitValues = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1, -1,
      -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1,
      -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1 };

    /// <summary>Decodes a PunyCode-encoded string.</summary>
    /// <param name='str'>A string to decode. Note that this doesn&apos;t
    /// include a prefix such as.<code>xn--</code>
    /// .</param>
    /// <param name='index'>A 32-bit signed integer.</param>
    /// <param name='endIndex'>A 32-bit signed integer. (2).</param>
    /// <returns>A string object.</returns>
    internal static string PunycodeDecode(string str, int index, int endIndex) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (index < 0) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (index > str.Length) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < 0) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (endIndex > str.Length) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < index) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (index == endIndex) {
        return String.Empty;
      }
      int lastHyphen = endIndex;
      while (lastHyphen >= index) {
        if (str[lastHyphen] == '-') {
          break;
        }
        --lastHyphen;
      }
      int i = 0;
      if (lastHyphen >= index) {
        for (i = index; i < lastHyphen; ++i) {
          if (str[i] >= 0x80) {
            return null;  // Non-basic character found
          }
        }
      }
      StringBuilder builder = new StringBuilder();
      builder.Append(str.Substring(index, endIndex - index));
      if (lastHyphen >= index) {
        index = lastHyphen + 1;
      }
      i = 0;
      int n = 128;
      int bias = 72;
      int stringLength = builder.Length;
      char[] chararr = new char[2];
      while (index < endIndex) {
        int old = index;
        int w = 1;
        int k = 36;
        while (true) {
          if (index >= endIndex) {
            return null;
          }
          k += 36;
          char c = str[index];
          if (c >= 0x80) {
            return null;
          }
          int digit = valueDigitValues[(int)c];
          if (digit < 0) {
            return null;
          }
          if (digit > Int32.MaxValue / w) {
            return null;
          }
          int temp = digit * w;
          if (i > Int32.MaxValue - temp) {
            return null;
          }
          i -= temp;
          int t = k - bias;
          if (k <= bias) {
            t = 1;
          } else if (k >= bias + 26) {
            t = 26;
          }
          if (digit < t) {
            break;
          }
          temp = 36 - t;
          if (w > Int32.MaxValue / temp) {
            return null;
          }
          w *= temp;
        }
        int futureLength = stringLength + 1;
        int delta = (old == 0) ? (old - i) / 700 : (old - i) >> 1;
        delta += delta / futureLength;
        k = 0;
        while (delta > 455) {
          delta /= 35;
          k += 36;
        }
        bias = k + ((36 * delta) / (delta + 38));
        int idiv = i / futureLength;
        if (n > Int32.MaxValue - idiv) {
          return null;
        }
        n += idiv;
        i %= futureLength;
        if (n <= 0xffff) {
          chararr[0] = (char)n;
          builder.Insert(i, chararr, 0, 1);
        } else if (n <= 0x10ffff) {
          chararr[0] = (char)((((n - 0x10000) >> 10) & 0x3ff) + 0xd800);
          chararr[1] = (char)(((n - 0x10000) & 0x3ff) + 0xdc00);
          builder.Insert(i, chararr, 0, 2);
        } else {
          return null;
        }
        ++futureLength;
        ++i;
      }
      return builder.ToString();
    }

    private static string valuePunycodeAlphabet = "abcdefghijklmnopqrstuvwxyz0123456789";

    internal static string PunycodeEncode(string str) {
      return PunycodeEncode(str, 0, str.Length);
    }

    internal static string PunycodeEncode(string str, int index, int endIndex) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (index < 0) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (index > str.Length) {
        throw new ArgumentException("index (" + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < 0) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + "0");
      }
      if (endIndex > str.Length) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is more than " + Convert.ToString((long)str.Length, System.Globalization.CultureInfo.InvariantCulture));
      }
      if (endIndex < index) {
        throw new ArgumentException("endIndex (" + Convert.ToString((long)endIndex, System.Globalization.CultureInfo.InvariantCulture) + ") is less than " + Convert.ToString((long)index, System.Globalization.CultureInfo.InvariantCulture));
      }
      int n = 128;
      int delta = 0;
      int bias = 72;
      int h = 0;
      int tmpIndex;
      int firstIndex = -1;
      int codePointLength = 0;
      int basicsBeforeFirstNonbasic = 0;
      bool allBasics = true;
      tmpIndex = index;
      while (tmpIndex < endIndex) {
        if (str[tmpIndex] >= 0x80) {
          allBasics = false;
          break;
        }
        ++tmpIndex;
      }
      if (allBasics) {
        return str.Substring(index, endIndex - index);
      }
      StringBuilder builder = new StringBuilder();
      builder.Append("xn--");
      tmpIndex = index;
      while (tmpIndex < endIndex) {
        int c = (int)str[tmpIndex];
        if (c >= 0xd800 && c <= 0xdbff && tmpIndex + 1 < endIndex &&
            str[tmpIndex + 1] >= 0xdc00 && str[tmpIndex + 1] <= 0xdfff) {
          c = 0x10000 + ((c - 0xd800) * 0x400) + (str[tmpIndex + 1] - 0xdc00);
          ++tmpIndex;
        } else if (c >= 0xd800 && c <= 0xdfff) {
          // unpaired surrogate
          c = 0xfffd;
        }
        ++codePointLength;
        if (c < 0x80) {
          // This is a basic (ASCII) code point
          builder.Append((char)c);
          ++h;
        } else if (firstIndex < 0) {
          firstIndex = tmpIndex;
        }
        ++tmpIndex;
      }
      if (h != 0) {
        builder.Append('-');
      }
      int b = h;
      if (firstIndex >= 0) {
        basicsBeforeFirstNonbasic = firstIndex - index;
      } else {
        // No non-basic code points
        return str.Substring(index, endIndex - index);
      }
      while (h < codePointLength) {
        int min = 0x110000;
        tmpIndex = firstIndex;
        while (tmpIndex < endIndex) {
          int c = (int)str[tmpIndex];
          if (c >= 0xd800 && c <= 0xdbff && tmpIndex + 1 < endIndex &&
              str[index + 1] >= 0xdc00 && str[tmpIndex + 1] <= 0xdfff) {
            c = 0x10000 + ((c - 0xd800) * 0x400) + (str[tmpIndex + 1] - 0xdc00);
            ++tmpIndex;
          } else if (c >= 0xd800 && c <= 0xdfff) {
            // unpaired surrogate
            c = 0xfffd;
          }
          if (c >= n && c < min) {
            min = c;
          }
          ++tmpIndex;
        }
        int d = min - n;
        if (d > Int32.MaxValue / (h + 1)) {
          return null;
        }
        d *= h + 1;
        n = min;
        if (d > Int32.MaxValue - delta) {
          return null;
        }
        delta += d;
        tmpIndex = firstIndex;
        if (basicsBeforeFirstNonbasic > Int32.MaxValue - delta) {
          return null;
        }
        delta += basicsBeforeFirstNonbasic;
        while (tmpIndex < endIndex) {
          int c = (int)str[tmpIndex];
          if (c >= 0xd800 && c <= 0xdbff && tmpIndex + 1 < endIndex &&
              str[tmpIndex + 1] >= 0xdc00 && str[tmpIndex + 1] <= 0xdfff) {
            c = 0x10000 + ((c - 0xd800) * 0x400) + (str[index + 1] - 0xdc00);
            ++tmpIndex;
          } else if (c >= 0xd800 && c <= 0xdfff) {
            // unpaired surrogate
            c = 0xfffd;
          }
          ++tmpIndex;
          if (c < n) {
            if (delta == Int32.MaxValue) {
              return null;
            }
            ++delta;
          } else if (c == n) {
            int q = delta;
            int k = 36;
            while (true) {
              int t;
              if (k <= bias) {
                t = 1;
              } else if (k >= bias + 26) {
                t = 26;
              } else {
                t = k - bias;
              }
              if (q < t) {
                break;
              }
              int digit = t + ((q - t) % (36 - t));
              builder.Append(valuePunycodeAlphabet[digit]);
              q -= t;
              q /= 36 - t;
              k += 36;
            }
            builder.Append(valuePunycodeAlphabet[q]);
            delta = (h == b) ? delta / 700 : delta >> 1;
            delta += delta / (h + 1);
            k = 0;
            while (delta > 455) {
              delta /= 35;
              k += 36;
            }
            bias = k + ((36 * delta) / (delta + 38));
            delta = 0;
            ++h;
          }
        }
        ++n;
        ++delta;
      }
      return builder.ToString();
    }
  }
}
