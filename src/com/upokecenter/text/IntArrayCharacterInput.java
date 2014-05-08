package com.upokecenter.text;

    /**
     * A character input with an integer array as the backing store.
     */
  final class IntArrayCharacterInput implements ICharacterInput {
    private int pos;
    private int[] ilist;

    public IntArrayCharacterInput (int[] ilist) {
      this.ilist = ilist;
    }

    /**
     * Not documented yet.
     * @return A 32-bit signed integer.
     */
    public int ReadChar() {
      int[] arr = this.ilist;
      if (this.pos < this.ilist.length) {
        return arr[this.pos++];
      }
      return -1;
    }

    /**
     * Not documented yet.
     * @param buf An array of 32-bit unsigned integers.
     * @param offset A 32-bit signed integer. (2).
     * @param unitCount A 32-bit signed integer. (3).
     * @return A 32-bit signed integer.
     */
    public int Read(int[] buf, int offset, int unitCount) {
      if (buf == null) {
        throw new NullPointerException("buf");
      }
      if (offset < 0) {
        throw new IllegalArgumentException("offset (" + Integer.toString((int)offset) + ") is less than " + "0");
      }
      if (offset > buf.length) {
        throw new IllegalArgumentException("offset (" + Integer.toString((int)offset) + ") is more than " + Integer.toString((int)buf.length));
      }
      if (unitCount < 0) {
        throw new IllegalArgumentException("unitCount (" + Integer.toString((int)unitCount) + ") is less than " + "0");
      }
      if (unitCount > buf.length) {
        throw new IllegalArgumentException("unitCount (" + Integer.toString((int)unitCount) + ") is more than " + Integer.toString((int)buf.length));
      }
      if (buf.length - offset < unitCount) {
        throw new IllegalArgumentException("buf's length minus " + offset + " (" + Integer.toString((int)(buf.length - offset)) + ") is less than " + Integer.toString((int)unitCount));
      }
      if (unitCount == 0) {
        return 0;
      }
      int[] arr = this.ilist;
      int size = this.ilist.length;
      int count = 0;
      while (this.pos < size && unitCount > 0) {
        buf[offset] = arr[this.pos];
        ++offset;
        ++count;
        --unitCount;
        ++this.pos;
      }
      return count == 0 ? -1 : count;
    }
  }