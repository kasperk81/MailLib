using System;
using System.Collections.Generic;
using System.Text;

namespace PeterO.Enriched {
    /// <summary>Not documented yet.</summary>
  public static class EnrichedText {
    /// <summary>Not documented yet.</summary>
    /// <param name='str'>The parameter <paramref name='str'/> is not
    /// documented yet.</param>
    /// <param name='index'>The parameter <paramref name='index'/> is not
    /// documented yet.</param>
    /// <param name='endIndex'>The parameter <paramref name='endIndex'/> is
    /// not documented yet.</param>
    /// <returns>A string object.</returns>
    private static string ParseColor(string str, int index, int endIndex) {
      if (index + 2 == endIndex - 1 && (str[index] & ~32) == 82 &&
        (str[index + 1] & ~32) == 69 && (str[index + 2] & ~32) == 68) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 3 == endIndex - 1 && (str[index] & ~32) == 66 && (str[index +

   1] & ~32) == 76 && (str[index + 2] & ~32) == 85 && (str[index + 3] & ~32)
                   == 69) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 4 == endIndex - 1 && (str[index] & ~32) == 71 &&
      (str[index + 1] & ~32) == 82 && (str[index + 2] & ~32) == 69 &&
      (str[index + 3] & ~32) == 69 && (str[index + 4] & ~32) == 78) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 5 == endIndex - 1 && (str[index] & ~32) == 89 &&
      (str[index + 1] & ~32) == 69 && (str[index + 2] & ~32) == 76 &&
      (str[index + 3] & ~32) == 76 && (str[index + 4] & ~32) == 79 &&
      (str[index + 5] & ~32) == 87) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 3 == endIndex - 1 && (str[index] & ~32) == 67 &&
      (str[index + 1] & ~32) == 89 && (str[index + 2] & ~32) == 65 &&
      (str[index + 3] & ~32) == 78) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 6 == endIndex - 1 && (str[index] & ~32) == 77 &&
      (str[index + 1] & ~32) == 65 && (str[index + 2] & ~32) == 71 &&
      (str[index + 3] & ~32) == 69 && (str[index + 4] & ~32) == 78 &&
      (str[index + 5] & ~32) == 84 && (str[index + 6] & ~32) == 65) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 4 == endIndex - 1 && (str[index] & ~32) == 66 &&
      (str[index + 1] & ~32) == 76 && (str[index + 2] & ~32) == 65 &&
      (str[index + 3] & ~32) == 67 && (str[index + 4] & ~32) == 75) {
        return str.Substring(index, endIndex - index);
      }
      if (index + 4 == endIndex - 1 && (str[index] & ~32) == 87 &&
      (str[index + 1] & ~32) == 72 && (str[index + 2] & ~32) == 73 &&
      (str[index + 3] & ~32) == 84 && (str[index + 4] & ~32) == 69) {
        return str.Substring(index, endIndex - index);
      }
      {
        if (index + 3 < endIndex && (((str[index] >= 65 && str[index] <=
               70) || (str[index] >= 97 && str[index] <= 102) || (str[index] >=
               48 && str[index] <= 57)) && ((str[index + 1] >= 65 && str[index +
               1] <=
70) || (str[index + 1] >= 97 && str[index + 1] <= 102) || (str[index + 1] >=
 48 && str[index + 1] <= 57)) && ((str[index + 2] >=

               65 &&
           str[index + 2] <= 70) || (str[index + 2] >= 97 && str[index +
             2] <= 102) || (str[index + 2] >= 48 && str[index + 2] <=
             57)) && ((str[index + 3] >= 65 && str[index + 3] <= 70) ||
    (str[index + 3] >= 97 && str[index + 3] <= 102) || (str[index + 3] >= 48 &&

               str[index + 3] <= 57)))) {
          index += 4;
        } else {
          return null;
        }
   if (index + 4 < endIndex && (str[index] == 44) && (((str[index + 1] >= 65
          &&
    str[index + 1] <= 70) || (str[index + 1] >= 97 && str[index + 1] <= 102) ||
          (str[index + 1] >= 48 && str[index + 1] <=

     57)) && ((str[index + 2] >= 65 && str[index + 2] <= 70) || (str[index +
          2] >= 97 && str[index + 2] <= 102) || (str[index + 2] >= 48 &&

   str[index + 2] <= 57)) && ((str[index + 3] >= 65 && str[index + 3] <= 70) ||
          (str[index + 3] >= 97 && str[index + 3] <= 102) ||

   (str[index + 3] >= 48 && str[index + 3] <= 57)) && ((str[index + 4] >= 65
          &&
    str[index + 4] <= 70) || (str[index + 4] >= 97 && str[index + 4] <= 102) ||
          (str[index + 4] >= 48 && str[index + 4] <=

                    57)))) {
          index += 5;
        } else {
          return null;
        }
    if (index + 4 == endIndex - 1 && (str[index] == 44) && (((str[index + 1]
          >= 65 && str[index + 1] <= 70) || (str[index + 1] >= 97
&&
                str[index + 1] <= 102) || (str[index + 1] >= 48 &&
                    str[index +
                    1] <= 57)) && ((str[index + 2] >= 65 && str[index + 2] <=
   70) || (str[index + 2] >= 97 && str[index + 2] <= 102) || (str[index + 2]
          >= 48 && str[index + 2] <= 57)) && ((str[index + 3] >= 65 &&

                  str[index + 3] <= 70) || (str[index + 3] >= 97 &&
                    str[index +
                    3] <= 102) || (str[index + 3] >= 48 && str[index + 3] <=
                    57)) && ((str[index + 4] >= 65 && str[index + 4] <= 70) ||
    (str[index + 4] >= 97 && str[index + 4] <= 102) || (str[index + 4] >= 48
               &&

                    str[index + 4] <= 57)))) {
          index += 5;
        } else {
          return null;
        }
        string ret = "#";
        return
  ret + str.Substring(index, 2) + str.Substring(index + 5, 2) +
    str.Substring(
  index,
  10);
      }
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='str'>The parameter <paramref name='str'/> is not
    /// documented yet.</param>
    /// <param name='index'>The parameter <paramref name='index'/> is not
    /// documented yet.</param>
    /// <param name='endIndex'>The parameter <paramref name='endIndex'/> is
    /// not documented yet.</param>
    /// <returns>A 32-bit signed integer.</returns>
    private static int SkipFont(string str, int index, int endIndex) {
      int indexTemp = index;
      do {
        while (true) {
          int indexTemp2 = index;
          do {
            if (index < endIndex && ((str[index] >= 48 && str[index] <=
              57) ||
           (str[index] >= 44 && str[index] <= 45) || (str[index] == 32) ||
              (str[index] >= 12 && str[index] <= 13) || (str[index]
              >= 9 &&
           str[index] <= 10) || (str[index] >= 97 && str[index] <= 122) ||
              (str[index] >= 65 && str[index] <= 90))) {
              ++indexTemp2; break;
            }
            int indexTemp3 = index;
            do {
              if (index < endIndex && ((str[index] >= 128 && str[index]
          <= 55295) || (str[index] >= 57344 && str[index] <=
              65535))) {
                ++indexTemp3; break;
              }
              if (index + 1 < endIndex && ((str[index] >= 55296 &&
str[index] <= 56319) && (str[index + 1] >= 56320 && str[index + 1] <= 57343))) {
                indexTemp3 += 2; break;
              }
            } while (false);
            if (indexTemp3 != index) {
              indexTemp2 = indexTemp3; break;
            }
          } while (false);
          if (indexTemp2 != index) {
            index = indexTemp2;
          } else {
            break;
          }
        }
        indexTemp = index;
      } while (false);
      return indexTemp;
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='str'>The parameter <paramref name='str'/> is not
    /// documented yet.</param>
    /// <param name='index'>The parameter <paramref name='index'/> is not
    /// documented yet.</param>
    /// <param name='endIndex'>The parameter <paramref name='endIndex'/> is
    /// not documented yet.</param>
    /// <returns>A 32-bit signed integer.</returns>
    private static int SkipLang(string str, int index, int endIndex) {
      while (index < endIndex && ((str[index] >= 48 && str[index] <= 57) ||
            (str[index] == 45) || (str[index] >= 97 && str[index] <= 122) ||
          (str[index] >= 65 && str[index] <= 90))) {
        ++index;
      }
      return index;
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='s'>The parameter <paramref name='s'/> is not
    /// documented yet.</param>
    /// <param name='delimiter'>The parameter <paramref name='delimiter'/>
    /// is not documented yet.</param>
    /// <returns>A string[] object.</returns>
    private static string[] SplitAt(string s, string delimiter) {
      if (delimiter == null || delimiter.Length == 0) {
        throw new ArgumentException();
      }
      if (s == null || s.Length == 0) {
        return new string[] { String.Empty };
      }
      var index = 0;
      var first = true;
      List<string> strings = null;
      int delimLength = delimiter.Length;
      while (true) {
        int index2 = s.IndexOf(
  delimiter,
  index,
  StringComparison.Ordinal);
        if (index2 < 0) {
          if (first) {
            return new string[] { s };
          }
          strings.Add(s.Substring(index));
          break;
        } else {
          if (first) {
            strings = new List<string>();
            first = false;
          }
          string newstr = s.Substring(index, index2 - index);
          strings.Add(newstr);
          index = index2 + delimLength;
        }
      }
      return strings.ToArray();
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='s'>The parameter <paramref name='s'/> is not
    /// documented yet.</param>
    /// <returns>A string object.</returns>
    private static string TrimSpaces(string s) {
      if (s == null || s.Length == 0) {
        return s;
      }
      var index = 0;
      int valueSLength = s.Length;
      while (index < valueSLength) {
        char c = s[index];
        if (c != 0x09 && c != 0x0a && c != 0x0c && c != 0x0d && c !=
            0x20) {
          break;
        }
        ++index;
      }
      if (index == valueSLength) {
        return String.Empty;
      }
      int startIndex = index;
      index = valueSLength - 1;
      while (index >= 0) {
        char c = s[index];
        if (c != 0x09 && c != 0x0a && c != 0x0c && c != 0x0d && c !=
            0x20) {
          return s.Substring(startIndex, (index + 1) - startIndex);
        }
        --index;
      }
      return String.Empty;
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='str'>The parameter <paramref name='str'/> is not
    /// documented yet.</param>
    /// <param name='index'>The parameter <paramref name='index'/> is not
    /// documented yet.</param>
    /// <param name='endIndex'>The parameter <paramref name='endIndex'/> is
    /// not documented yet.</param>
    /// <returns>A string object.</returns>
    public static string EnrichedToPlain(
  string str,
  int index,
  int endIndex) {
      var originalBuilder = new StringBuilder();
      var paramBuilder = new StringBuilder();
      StringBuilder currentBuilder = originalBuilder;
      var withinParam = false;
      var nofillDepth = 0;
      do {
        while (true) {
          int indexTemp2 = index;
          do {
        if (index + 1 < endIndex && str[index] == 60 && str[index + 1] ==
              60) {
              currentBuilder.Append("<");
              indexTemp2 += 2; break;
            }
            int indexTemp3 = index;
            do {
              int indexStart3 = index;
              if (index < endIndex && (str[index] == 60)) {
                ++index;
              } else {
                break;
              }
              var isEndTag = false;
              if (index < endIndex && (str[index] == 47)) {
                ++index;
                isEndTag = true;
              }
              int commandStart = index;
              for (int i3 = 0; i3 < 60; ++i3) {
                if (index < endIndex && ((str[index] >= 48 && str[index]
<= 57) || (str[index] == 45) || (str[index] >= 97 && str[index] <= 122) ||
(str[index] >= 65 && str[index] <=

                90))) {
                  ++index;
                } else if (i3 < 1) {
                  index = indexStart3; break;
                } else {
                  break;
                }
              }
              if (index == indexStart3) {
                break;
              }
              int commandEnd = index;
              if (index < endIndex && (str[index] == 62)) {
                ++index;
                string command = str.Substring(
  commandStart,
  commandEnd - commandStart).ToLowerInvariant();
                if (command.Equals("nofill")) {
                  if (isEndTag && nofillDepth > 0) {
                    --nofillDepth;
                  } else if (!isEndTag) {
                    ++nofillDepth;
                  }
                }
                if (command.Equals("param")) {
                  if (isEndTag) {
                    withinParam = false;
                    currentBuilder = originalBuilder;
                  } else {
                    withinParam = true;
                    paramBuilder.Remove(0, paramBuilder.Length);
                    currentBuilder = paramBuilder;
                  }
                }
              } else {
                index = indexStart3; break;
              }
              indexTemp3 = index;
              index = indexStart3;
            } while (false);
            if (indexTemp3 != index) {
              indexTemp2 = indexTemp3; break;
            }
            int indexStart2 = index;
            var lineBreakCount = 0;
            for (int i2 = 0; ; ++i2) {
              indexTemp3 = index;
              do {
        if (index + 1 < endIndex && str[index] == 13 && str[index + 1] ==
                  10) {
                  indexTemp3 += 2; break;
                }
                if (index < endIndex && ((str[index] == 13) || (str[index]
                == 10))) {
                  ++indexTemp3; break;
                }
              } while (false);
              if (indexTemp3 == index) {
                if (i2 < 1) {
                  indexTemp2 = indexStart2;
                }
                lineBreakCount = i2;
                break;
              } else {
                index = indexTemp3;
              }
            }
            index = indexStart2;
            if (indexTemp3 != indexStart2) {
              // Line breaks
              if (nofillDepth > 0) {
                for (int j = 0; j < lineBreakCount; ++j) {
                  currentBuilder.Append("\r\n");
                }
              } else {
                if (lineBreakCount == 1) {
                  currentBuilder.Append(' ');
                } else if (!withinParam) {
                  if (lineBreakCount == 2) {
                    currentBuilder.Append("\r\n");
                  } else {
                    var j = 0;
                    for (j = 1; j < lineBreakCount; ++j) {
                    currentBuilder.Append("\r\n");
                    }
                  }
                } else {
                  currentBuilder.Append(' ');
                }
              }
              indexTemp2 = indexTemp3;
              index = indexStart2;
              break;
            }
            if (index < endIndex && ((str[index] >= 0 && str[index] <=
            9) || (str[index] >= 11 && str[index] <= 12) || (str[index] >= 14 &&
            str[index] <= 127))) {
              // Ordinary character
              if (str[index] == 0) {
                // Null
                currentBuilder.Append((char)0xfffd);
              } else {
                currentBuilder.Append(str[index]);
              }
              ++indexTemp2; break;
            }
            indexTemp3 = index;
            do {
              if (index < endIndex && ((str[index] >= 128 && str[index]
          <= 55295) || (str[index] >= 57344 && str[index] <=
              65535))) {
                // BMP character
                currentBuilder.Append(str[index]);
                ++indexTemp3; break;
              }
              if (index + 1 < endIndex && ((str[index] >= 55296 &&
str[index] <= 56319) && (str[index + 1] >= 56320 && str[index + 1] <= 57343))) {
                // Supplementary character
                currentBuilder.Append(str[index]);
                currentBuilder.Append(str[index + 1]);
                indexTemp3 += 2; break;
              }
            } while (false);
            if (indexTemp3 != index) {
              indexTemp2 = indexTemp3; break;
            }
            if (index < endIndex && (str[index] >= 55296 && str[index]
            <= 57343)) {
              // Unpaired surrogate
              currentBuilder.Append((char)0xfffd);
              ++indexTemp2; break;
            }
          } while (false);
          if (indexTemp2 != index) {
            index = indexTemp2;
          } else {
            break;
          }
        }
      } while (false);
      return originalBuilder.ToString();
    }

    /// <summary>Not documented yet.</summary>
    /// <param name='str'>The parameter <paramref name='str'/> is not
    /// documented yet.</param>
    /// <param name='index'>The parameter <paramref name='index'/> is not
    /// documented yet.</param>
    /// <param name='endIndex'>The parameter <paramref name='endIndex'/> is
    /// not documented yet.</param>
    /// <returns>A string object.</returns>
    public static string EnrichedToHtml(
  string str,
  int index,
  int endIndex) {
      var originalBuilder = new StringBuilder();
      var paramBuilder = new StringBuilder();
      StringBuilder currentBuilder = originalBuilder;
      var withinParam = false;
      var nofillDepth = 0;
      originalBuilder.Append("<!DOCTYPE html><html><title>Untitled</title>");
  originalBuilder.Append("<style>p { margin-bottom: 0em; margin-top: 0em; }");
      originalBuilder.Append("</style><body>");
      string lastCommand = String.Empty;
      do {
        while (true) {
          int indexTemp2 = index;
          do {
        if (index + 1 < endIndex && str[index] == 60 && str[index + 1] ==
              60) {
              currentBuilder.Append("&lt;");
              indexTemp2 += 2; break;
            }
            int indexTemp3 = index;
            do {
              int indexStart3 = index;
              if (index < endIndex && (str[index] == 60)) {
                ++index;
              } else {
                break;
              }
              var isEndTag = false;
              if (index < endIndex && (str[index] == 47)) {
                ++index;
                isEndTag = true;
              }
              int commandStart = index;
              for (int i3 = 0; i3 < 60; ++i3) {
                if (index < endIndex && ((str[index] >= 48 && str[index]
<= 57) || (str[index] == 45) || (str[index] >= 97 && str[index] <= 122) ||
(str[index] >= 65 && str[index] <=

                90))) {
                  ++index;
                } else if (i3 < 1) {
                  index = indexStart3; break;
                } else {
                  break;
                }
              }
              if (index == indexStart3) {
                break;
              }
              int commandEnd = index;
              if (index < endIndex && (str[index] == 62)) {
                ++index;
                string command = str.Substring(
  commandStart,
  commandEnd - commandStart).ToLowerInvariant();
                if (!withinParam) {
                  if (command.Equals("bold")) {
                    currentBuilder.Append('<');
                    if (isEndTag) {
                    currentBuilder.Append('/');
                    }
                    currentBuilder.Append("b>");
                  } else if (command.Equals("italic")) {
                    currentBuilder.Append('<');
                    if (isEndTag) {
                    currentBuilder.Append('/');
                    }
                    currentBuilder.Append("i>");
                  } else if (command.Equals("fixed")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    } else {
                    currentBuilder.Append("<span style='font-family:");
                    currentBuilder.Append("monospaced'>");
                    }
                  } else if (command.Equals("center")) {
                    if (isEndTag) {
                    currentBuilder.Append("</div>");
                    } else {
                    currentBuilder.Append("<div style='text-align:center'>");
                    }
                  } else if (command.Equals("flushleft")) {
                    if (isEndTag) {
                    currentBuilder.Append("</div>");
                    } else {
                    currentBuilder.Append("<div style='text-align:left'>");
                    }
                  } else if (command.Equals("flushright")) {
                    if (isEndTag) {
                    currentBuilder.Append("</div>");
                    } else {
                    currentBuilder.Append("<div style='text-align:right'>");
                    }
                  } else if (command.Equals("flushboth")) {
                    if (isEndTag) {
                    currentBuilder.Append("</div>");
                    } else {
                    currentBuilder.Append("<div style='text-align:justify'>");
                    }
                  } else if (command.Equals("fontfamily")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    }
                  } else if (command.Equals("color")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    }
                  } else if (command.Equals("paraindent")) {
                    if (isEndTag) {
                    currentBuilder.Append("</div>");
                    }
                  } else if (command.Equals("smaller")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    } else {
                    currentBuilder.Append("<span style='font-size:85%'>");
                    }
                  } else if (command.Equals("nofill")) {
                    if (isEndTag && nofillDepth > 0) {
                    --nofillDepth;
                    } else if (!isEndTag) {
                    ++nofillDepth;
                    }
                  } else if (command.Equals("bigger")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    } else {
                    currentBuilder.Append("<span style='font-size:110%'>");
                    }
                  } else if (command.Equals("lang")) {
                    if (isEndTag) {
                    currentBuilder.Append("</span>");
                    }
                  } else if (command.Equals("excerpt")) {
                    if (isEndTag) {
                    currentBuilder.Append("</blockquote>");
                    } else {
                    currentBuilder.Append("<blockquote>");
                    }
                  }
                  if (!command.Equals("param")) {
                    lastCommand = command;
                  }
                }
                bool wasWithinParam = withinParam;
                if (command.Equals("param")) {
                  if (isEndTag) {
                    withinParam = false;
                    currentBuilder = originalBuilder;
                    string p = TrimSpaces(paramBuilder.ToString());
                    if (lastCommand.Equals("fontfamily")) {
                    if (SkipFont(p, 0, p.Length) == p.Length) {
                    currentBuilder.Append("<span style='font-family: " + p +
                    "'> ");
                    } else {
                    currentBuilder.Append("<span>");
                    }
                    } else if (lastCommand.Equals("color")) {
                p = ParseColor(
  DataUtilities.ToLowerCaseAscii(p),
  0,
  p.Length);
                    if (p != null) {
                    currentBuilder.Append("<span style='color: " + p + "'>");
                    } else {
                    currentBuilder.Append("<span>");
                    }
                    } else if (lastCommand.Equals("lang")) {
                    if (SkipLang(p, 0, p.Length) == p.Length) {
    currentBuilder.Append("<span lang=' " + DataUtilities.ToLowerCaseAscii(p) +
           "'> ");
                    } else {
                    currentBuilder.Append("<span>");
                    }
                    } else if (lastCommand.Equals("paraindent")) {
                    p = DataUtilities.ToLowerCaseAscii(p);
                    string[] valuePList = SplitAt(p, ",");
                    var leftFlag = false;
                    var rightFlag = false;
                    var inFlag = false;
                    var outFlag = false;
                    var styleBuilder = new StringBuilder();
                    foreach (string valuePItem in valuePList) {
                    string valuePItem2 = TrimSpaces(valuePItem);
                    if (!leftFlag && valuePItem2.Equals("left")) {
                    styleBuilder.Append("padding-left: 2em;");
                    } else if (!rightFlag && valuePItem2.Equals("right")) {
                    styleBuilder.Append("padding-right: 2em;");
                    } else if (!inFlag && valuePItem2.Equals("in")) {
                    styleBuilder.Append("text-indent: 2em;");
                    } else if (!outFlag && valuePItem2.Equals("out")) {
                    styleBuilder.Append("text-indent: -2em;");
                    styleBuilder.Append("margin-left: 2em;");
                    }
                    }
                    if (!inFlag && !outFlag) {
                    styleBuilder.Append("padding-top:0;");
                    styleBuilder.Append("padding-bottom: 0;");
                    }
                    currentBuilder.Append("<div style=' " +
                    styleBuilder.ToString() + "'> ");
                    }
                    lastCommand = String.Empty;
                  } else {
                    withinParam = true;
                    paramBuilder.Remove(0, paramBuilder.Length);
                    currentBuilder = paramBuilder;
                  }
                }
                if (withinParam && wasWithinParam) {
                  currentBuilder.Append("<");
                  if (isEndTag) {
                    currentBuilder.Append('/');
                  }
                  currentBuilder.Append(command);
                  currentBuilder.Append(">");
                }
              } else {
                index = indexStart3; break;
              }
              indexTemp3 = index;
              index = indexStart3;
            } while (false);
            if (indexTemp3 != index) {
              indexTemp2 = indexTemp3; break;
            }
            int indexStart2 = index;
            var lineBreakCount = 0;
            for (int i2 = 0; ; ++i2) {
              indexTemp3 = index;
              do {
        if (index + 1 < endIndex && str[index] == 13 && str[index + 1] ==
                  10) {
                  indexTemp3 += 2; break;
                }
                if (index < endIndex && ((str[index] == 13) || (str[index]
                == 10))) {
                  ++indexTemp3; break;
                }
              } while (false);
              if (indexTemp3 == index) {
                if (i2 < 1) {
                  indexTemp2 = indexStart2;
                }
                lineBreakCount = i2;
                break;
              } else {
                index = indexTemp3;
              }
            }
            index = indexStart2;
            if (indexTemp3 != indexStart2) {
              // Line breaks
              if (nofillDepth > 0) {
                for (int j = 0; j < lineBreakCount; ++j) {
                  currentBuilder.Append("<br>");
                }
              } else {
                if (lineBreakCount == 1) {
                  currentBuilder.Append(' ');
                } else if (!withinParam) {
                  if (lineBreakCount == 2) {
                    currentBuilder.Append("<br>");
                  } else {
                    var j = 0;
                    currentBuilder.Append("<p>");
                    for (j = 2; j < lineBreakCount; ++j) {
                    currentBuilder.Append("<br>");
                    }
                  }
                } else {
                  currentBuilder.Append(' ');
                }
              }
              indexTemp2 = indexTemp3;
              index = indexStart2;
              break;
            }
            if (index < endIndex && ((str[index] >= 0 && str[index] <=
            9) || (str[index] >= 11 && str[index] <= 12) || (str[index] >= 14 &&
            str[index] <= 127))) {
              // Ordinary character
              if (str[index] == 0) {
                // Null
                currentBuilder.Append((char)0xfffd);
              } else if (str[index] == '&') {
                currentBuilder.Append(withinParam ? "&" : "&amp;");
              } else {
                currentBuilder.Append(str[index]);
              }
              ++indexTemp2; break;
            }
            indexTemp3 = index;
            do {
              if (index < endIndex && ((str[index] >= 128 && str[index]
          <= 55295) || (str[index] >= 57344 && str[index] <=
              65535))) {
                // BMP character
                currentBuilder.Append(str[index]);
                ++indexTemp3; break;
              }
              if (index + 1 < endIndex && ((str[index] >= 55296 &&
str[index] <= 56319) && (str[index + 1] >= 56320 && str[index + 1] <= 57343))) {
                // Supplementary character
                currentBuilder.Append(str[index]);
                currentBuilder.Append(str[index + 1]);
                indexTemp3 += 2; break;
              }
            } while (false);
            if (indexTemp3 != index) {
              indexTemp2 = indexTemp3; break;
            }
            if (index < endIndex && (str[index] >= 55296 && str[index]
            <= 57343)) {
              // Unpaired surrogate
              currentBuilder.Append((char)0xfffd);
              ++indexTemp2; break;
            }
          } while (false);
          if (indexTemp2 != index) {
            index = indexTemp2;
          } else {
            break;
          }
        }
      } while (false);
      originalBuilder.Append("</body></html>");
      return originalBuilder.ToString();
    }
  }
}