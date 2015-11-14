package com.upokecenter.util;
/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */

    /**
     * A generic interface for reading data one byte at a time.
     */
  public interface ITransform {
    /**
     * Reads a byte from the data source.
     * @return The byte read, or -1 if the end of the source is reached.
     */
    int read();
  }
