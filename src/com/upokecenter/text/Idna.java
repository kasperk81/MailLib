package com.upokecenter.text;
/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.com/d/
 */

import com.upokecenter.util.*;
import com.upokecenter.mail.*;

    /**
     * Contains methods that implement Internationalized Domain Names
     * in Applications (IDNA).
     */
  public class Idna
  {
    private static final int Unassigned = 0;
    private static final int PValid = 1;
    private static final int Disallowed = 2;
    private static final int ContextJ = 3;
    private static final int ContextO = 4;
    private static final int BidiClassL = 0;
    private static final int BidiClassR = 1;
    private static final int BidiClassAL = 2;
    private static final int BidiClassEN = 3;
    private static final int BidiClassES = 4;
    private static final int BidiClassET = 5;
    private static final int BidiClassAN = 6;
    private static final int BidiClassCS = 7;
    private static final int BidiClassNSM = 8;
    private static final int BidiClassBN = 9;
    private static final int BidiClassON = 10;

    private static ByteData bidiClasses;
    private static ByteData joiningTypes;
    private static ByteData scripts;
    private static Object bidiClassesSync = new Object();
    private static Object joiningTypesSync = new Object();
    private static Object scriptsSync = new Object();

    private static int GetBidiClass(int ch) {
      ByteData table = null;
      synchronized(bidiClassesSync) {
        if (bidiClasses == null) {
          bidiClasses = ByteData.Decompress(IdnaData.BidiClasses);
        }
        table = bidiClasses;
      }
      return table.GetByte(ch);
    }

    private static int GetJoiningType(int ch) {
      ByteData table = null;
      synchronized(joiningTypesSync) {
        if (joiningTypes == null) {
          joiningTypes = ByteData.Decompress(IdnaData.JoiningTypes);
        }
        table = joiningTypes;
      }
      return table.GetByte(ch);
    }

    private static int GetScript(int ch) {
      ByteData table = null;
      synchronized(scriptsSync) {
        if (scripts == null) {
          scripts = ByteData.Decompress(IdnaData.IdnaRelevantScripts);
        }
        table = scripts;
      }
      return table.GetByte(ch);
    }

    private static boolean JoiningTypeTransparent(int ch) {
      return GetJoiningType(ch) == 1;
    }

    private static boolean JoiningTypeLeftOrDual(int ch) {
      int jtype = GetJoiningType(ch);
      return jtype == 3 || jtype == 4;
    }

    private static boolean JoiningTypeRightOrDual(int ch) {
      int jtype = GetJoiningType(ch);
      return jtype == 2 || jtype == 4;
    }

    private static boolean IsGreek(int ch) {
      return GetScript(ch) == 1;
    }

    private static boolean IsHebrew(int ch) {
      return GetScript(ch) == 2;
    }

    private static boolean IsKanaOrHan(int ch) {
      return GetScript(ch) == 3;
    }

    private static boolean IsValidConjunct(String str, int index) {
      // Assumes that the character at the given index
      // is Zero-Width Non-Joiner
      // Check the left
      boolean found = false;
      int oldIndex = index;
      while (index > 0) {
        int ch = DataUtilities.CodePointBefore(str, index);
        index -= (ch >= 0x10000) ? 2 : 1;
        if (JoiningTypeLeftOrDual(ch)) {
          found = true;
        } else if (!JoiningTypeTransparent(ch)) {
          return false;
        }
      }
      if (!found) {
        return false;
      }
      // Check the right
      index = oldIndex + 1;
      while (index < str.length()) {
        int ch = DataUtilities.CodePointAt(str, index);
        index += (ch >= 0x10000) ? 2 : 1;
        if (JoiningTypeRightOrDual(ch)) {
          return true;
        } else if (!JoiningTypeTransparent(ch)) {
          return false;
        }
      }
      return false;
    }

    private static boolean HasRtlCharacters(String str) {
      for (int i = 0; i < str.length(); ++i) {
        if (str.charAt(i) >= 0x80) {
          int c = DataUtilities.CodePointAt(str, i);
          if (c >= 0x10000) {
            ++i;
          }
          int bidiClass = GetBidiClass(c);
          if (bidiClass == BidiClassAL || bidiClass == BidiClassAN || bidiClass == BidiClassR) {
            return true;
          }
        }
      }
      return false;
    }

    /**
     * Tries to encode each label of a domain name into PunyCode.
     * @param value A domain name.
     * @return The domain name where each label with non-ASCII characters
     * is encoded into PunyCode. Labels where this is not possible remain
     * unchanged.
     * @throws java.lang.NullPointerException Value is null.
     */
    public static String EncodeDomainName(String value) {
      if (value == null) {
        throw new NullPointerException("value");
      }
      if (value.length() == 0) {
        return "";
      }
      StringBuilder builder = new StringBuilder();
      String retval = null;
      int lastIndex = 0;
      for (int i = 0; i < value.length(); ++i) {
        char c = value.charAt(i);
        if (c == '.') {
          if (i != lastIndex) {
            retval = DomainUtility.PunycodeEncode(value, lastIndex, i);
            if (retval == null) {
              // Append the unmodified domain plus the dot
              builder.append(value.substring(lastIndex,(lastIndex)+((i + 1) - lastIndex)));
            } else {
              builder.append(retval);
              builder.append('.');
            }
          }
          lastIndex = i + 1;
        }
      }
      retval = DomainUtility.PunycodeEncode(value, lastIndex, value.length());
      if (retval == null) {
        builder.append(value.substring(lastIndex,(lastIndex)+(value.length() - lastIndex)));
      } else {
        builder.append(retval);
      }
      return builder.toString();
    }

    public static boolean IsValidDomainName(String str, boolean lookupRules) {
      if (((str)==null || (str).length()==0)) {
        return false;
      }
      boolean bidiRule = HasRtlCharacters(str);
      int lastIndex = 0;
      for (int i = 0; i < str.length(); ++i) {
        char c = str.charAt(i);
        if (c == '.') {
          if (i == lastIndex) {
            // Empty label
            return false;
          }
          if (!IsValidLabel(str.substring(lastIndex,(lastIndex)+(i - lastIndex)), lookupRules, bidiRule)) {
            return false;
          }
          lastIndex = i + 1;
        }
      }
      if (str.length() == lastIndex) {
        return false;
      }
      return IsValidLabel(str.substring(lastIndex,(lastIndex)+(str.length() - lastIndex)), lookupRules, bidiRule);
    }

    private static boolean IsValidLabel(String str, boolean lookupRules, boolean bidiRule) {
      if (((str)==null || (str).length()==0)) {
        return false;
      }
      boolean maybeALabel = false;
      if (str.length() >= 4 && (str.charAt(0) == 'x' || str.charAt(0) == 'X') && (str.charAt(0) == 'n' || str.charAt(0) == 'N') && str.charAt(2) == '-' && str.charAt(3) == '-') {
        maybeALabel = true;
      }
      for (int i = 0; i < str.length(); ++i) {
        if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
            (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
            (str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '-') {
          // LDH character
          continue;
        } else if (str.charAt(i) >= 0x80) {
          // Non-ASCII character
          continue;
        } else {
          return false;
        }
      }
      if (maybeALabel) {
        str = DataUtilities.ToLowerCaseAscii(str);
        String ustr = DomainUtility.PunycodeDecode(str, 4, str.length());
        if (str == null) {
          return false;
        }
        if (!IsValidULabel(ustr, lookupRules, bidiRule)) {
          return false;
        }
        String astr = DomainUtility.PunycodeEncode(ustr, 0, ustr.length());
        if (astr == null) {
          return false;
        }
        if (DataUtilities.CodePointCompare(astr, str) != 0) {
          return false;
        }
        return true;
      } else {
        return IsValidULabel(str, lookupRules, bidiRule);
      }
    }

    private static boolean IsValidULabel(String str, boolean lookupRules, boolean bidiRule) {
      if (((str)==null || (str).length()==0)) {
        return false;
      }
      if (str.length() > 63 && !lookupRules) {
        // Too long
        return false;
      }
      if (!Normalizer.IsNormalized(str)) {
        return false;
      }
      if (str.length() >= 4 && str.charAt(2) == '-' && str.charAt(3) == '-') {
        return false;
      }
      if (!lookupRules) {
        // Checking for a hyphen at the start and
        // the end is part of the registration validity
        // rules (sec. 4.2 of RFC 5891), but not the lookup
        // rules (sec. 5.4).
        if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-') {
          return false;
        }
      }
      int ch;
      boolean first = true;
      boolean haveContextual = false;
      int firstChar = -1;
      boolean rtl = false;
      int bidiClass;
      for (int i = 0; i < str.length(); ++i) {
        ch = DataUtilities.CodePointAt(str, i);
        if (ch >= 0x10000) {
          ++i;
        }
        int category = UnicodeDatabase.GetIdnaCategory(ch);
        if (category == Disallowed || category == Unassigned) {
          return false;
        }
        if (first) {
          firstChar = ch;
          if (UnicodeDatabase.IsCombiningMark(ch)) {
            return false;
          }
          if (bidiRule) {
            bidiClass = GetBidiClass(ch);
            if (bidiClass == BidiClassR || bidiClass == BidiClassAL) {
              rtl = true;
            } else if (bidiClass != BidiClassL) {
              // forbidden bidi type as the first character
              return false;
            }
          }
        }
        if (category == ContextO || category == ContextJ) {
          haveContextual = true;
        }
        first = false;
      }
      if (haveContextual) {
        boolean regArabDigits = false;
        boolean extArabDigits = false;
        boolean haveKatakanaMiddleDot = false;
        boolean haveKanaOrHan = false;
        int lastChar = 0;
        for (int i = 0; i < str.length(); ++i) {
          int thisChar = DataUtilities.CodePointAt(str, i);
          if (thisChar >= 0x660 && thisChar <= 0x669) {
            // Arabic-Indic digits
            // NOTE: Test done here even under lookup rules,
            // even though they're CONTEXTO characters
            if (extArabDigits) {
              return false;
            }
            regArabDigits = true;
          } else if (thisChar >= 0x6f0 && thisChar <= 0x6f9) {
            // Extended Arabic-Indic digits
            // NOTE: Test done here even under lookup rules,
            // even though they're CONTEXTO characters
            if (regArabDigits) {
              return false;
            }
            extArabDigits = true;
          } else if (thisChar == 0xb7) {
            // Middle dot
            // NOTE: Test done here even under lookup rules,
            // even though it's a CONTEXTO character
            if (!(i - 1 >= 0 && i + 1 < str.length() &&
                  lastChar == 0x6c &&
                  str.charAt(i + 1) == 0x6c)) {
              // Dot must come between two l's
              return false;
            }
          } else if (thisChar == 0x200d) {
            // Zero-width joiner
            if (UnicodeDatabase.GetCombiningClass(lastChar) != 9) {
              return false;
            }
          } else if (thisChar == 0x200c) {
            // Zero-width non-joiner
            if (UnicodeDatabase.GetCombiningClass(lastChar) != 9 &&
                !IsValidConjunct(str, i)) {
              return false;
            }
          } else if (thisChar == 0x375) {
            // Keraia
            // NOTE: Test done here even under lookup rules,
            // even though it's a CONTEXTO character
            if (i + 1 >= str.length() || !IsGreek(DataUtilities.CodePointAt(str, i + 1))) {
              return false;
            }
          } else if (thisChar == 0x5f3 || thisChar == 0x5f4) {
            // Geresh or gershayim
            // NOTE: Test done here even under lookup rules,
            // even though they're CONTEXTO characters
            if (i <= 0 || !IsHebrew(lastChar)) {
              return false;
            }
          } else if (thisChar == 0x30fb) {
            haveKatakanaMiddleDot = true;
          } else {
            int category = UnicodeDatabase.GetIdnaCategory(thisChar);
            if (category == ContextJ || category == ContextO) {
              // Context character without a rule
              return false;
            }
          }
          if (!haveKanaOrHan && IsKanaOrHan(thisChar)) {
            haveKanaOrHan = true;
          }
          if (thisChar >= 0x10000) {
            ++i;
          }
          lastChar = thisChar;
        }
        if (haveKatakanaMiddleDot && !haveKanaOrHan) {
          // NOTE: Test done here even under lookup rules,
          // even though it's a CONTEXTO character
          return false;
        }
      }
      // Bidi Rule
      if (bidiRule) {
        boolean found = false;
        for (int i = str.length(); i > 0; --i) {
          int c = DataUtilities.CodePointBefore(str, i);
          if (c >= 0x10000) {
            --i;
          }
          bidiClass = GetBidiClass(c);
          if (rtl && (bidiClass == BidiClassR || bidiClass == BidiClassAL || bidiClass == BidiClassAN)) {
            found = true;
            break;
          }
          if (!rtl && (bidiClass == BidiClassL)) {
            found = true;
            break;
          }
          if (bidiClass == BidiClassEN) {
            found = true;
            break;
          } else if (bidiClass != BidiClassNSM) {
            return false;
          }
        }
        if (!found) {
          return false;
        }
        boolean haveEN = false;
        boolean haveAN = false;
        for (int i = 0; i < str.length(); ++i) {
          int c = DataUtilities.CodePointAt(str, i);
          if (c >= 0x10000) {
            ++i;
          }
          bidiClass = GetBidiClass(c);
          if (rtl && (bidiClass == BidiClassR || bidiClass == BidiClassAL || bidiClass == BidiClassAN)) {
            if (bidiClass == BidiClassAN) {
              if (haveEN) {
                return false;
              }
              haveAN = true;
            }
            continue;
          }
          if (!rtl && (bidiClass == BidiClassL)) {
            continue;
          }
          if (bidiClass == BidiClassEN) {
            if (rtl) {
              if (haveAN) {
                return false;
              }
              haveEN = false;
            }
            continue;
          } else if (bidiClass == BidiClassES ||
                     bidiClass == BidiClassCS ||
                     bidiClass == BidiClassET ||
                     bidiClass == BidiClassON ||
                     bidiClass == BidiClassBN ||
                     bidiClass == BidiClassNSM) {
            continue;
          } else {
            return false;
          }
        }
      }
      int aceLength = DomainUtility.PunycodeLength(str, 0, str.length());
      if (aceLength < 0) {
        return false;  // Overflow error
      }
      if (!lookupRules) {
        // Additional rules for non-lookup validation
        if (aceLength > 63) {
          return false;
        }
      }
      return true;
    }
  }
