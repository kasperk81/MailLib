package com.upokecenter.mail;
/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */

    /**
     * Exception thrown when a message has invalid syntax.
     */
  public class MessageDataException extends RuntimeException {
private static final long serialVersionUID = 1L;
    /**
     * Initializes a new instance of the MessageDataException class.
     */
    public MessageDataException () {
    }

    /**
     * Initializes a new instance of the MessageDataException class.
     * @param message A string to use as the exception message.
     */
    public MessageDataException (String message) {
 super(message);
    }

    /**
     * Initializes a new instance of the MessageDataException class.
     * @param message A string to use as the exception message.
     * @param innerException An Exception object.
     */
    public MessageDataException (String message, Throwable innerException) {
 super(message, innerException);
    }
  }