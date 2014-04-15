/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.com/d/
 */
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace PeterO.Mail
{
  internal sealed class WordWrapEncoder {
    private const int MaxLineLength = 76;
    private string lastSpaces;
    private StringBuilder fullString;
    private int lineLength;
    private bool haveNonwhitespace;

    // TODO: Collapse spaces in this implementation
    public WordWrapEncoder(string c) {
      this.fullString = new StringBuilder();
      this.fullString.Append(c);
      if (this.fullString.Length >= MaxLineLength) {
        this.fullString.Append("\r\n");
        this.lastSpaces = " ";
        this.haveNonwhitespace = false;
      } else {
        this.haveNonwhitespace = true;  // assume have nonwhitespace
        this.lastSpaces = " ";
        this.lineLength = this.fullString.Length;
      }
    }

    private void AppendSpaces(string str) {
      if (this.lineLength + this.lastSpaces.Length + str.Length > MaxLineLength) {
        // Too big to fit the current line
        this.lastSpaces = " ";
      } else {
        this.lastSpaces = str;
      }
    }

    private void AppendWord(string str) {
      if (this.lineLength + this.lastSpaces.Length + str.Length > MaxLineLength &&
         this.haveNonwhitespace) {
        // Too big to fit the current line,
        // create a new line (but only if the current
        // line isn't all whitespace)
        this.fullString.Append("\r\n");
        this.lastSpaces = " ";
        this.haveNonwhitespace = false;
        this.lineLength = 0;
      }
      this.fullString.Append(this.lastSpaces);
      this.fullString.Append(str);
      this.haveNonwhitespace = true;
      this.lineLength += this.lastSpaces.Length;
      this.lineLength += str.Length;
      this.lastSpaces = String.Empty;
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='str'>A string object.</param>
    public void AddString(string str) {
      int wordStart = 0;
      for (int j = 0; j < str.Length; ++j) {
        int c = str[j];
        if (c == 0x20 || c == 0x09) {
          int wordEnd = j;
          if (wordStart != wordEnd) {
            this.AppendWord(str.Substring(wordStart, wordEnd - wordStart));
          }
          while (j < str.Length) {
            if (str[j] == 0x20 || str[j] == 0x09) {
              ++j;
            } else {
              break;
            }
          }
          wordStart = j;
          this.AppendSpaces(str.Substring(wordEnd, wordStart - wordEnd));
          --j;
        }
      }
      if (wordStart != str.Length) {
        this.AppendWord(str.Substring(wordStart, str.Length - wordStart));
      }
    }

    /// <summary>Converts this object to a text string.</summary>
    /// <returns>A string representation of this object.</returns>
    public override string ToString() {
      return this.fullString.ToString();
    }
  }
}
