package com.upokecenter.mail;
/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */

  interface IHeaderFieldParser {
    boolean IsStructured();

    int Parse(String str, int index, int endIndex, ITokener tokener);

    String DowngradeFieldValue(String str);

    String DecodeEncodedWords(String str);

    String UncommentAndCollapse(String str);
  }