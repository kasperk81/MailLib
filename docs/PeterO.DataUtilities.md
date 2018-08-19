## PeterO.DataUtilities

    public static class DataUtilities

Not documented yet.

Contains methods useful for reading and writing strings. It is designed o have no dependencies other than the basic runtime class library.Many of these methods work with text encoded in UTF-8, an encoding form f the Unicode Standard which uses one byte to encode the most basic haracters and two to four bytes to encode other characters. For xample, the `
          GetUtf8
        ` method converts a text string to an array of bytes in UTF-8.

In C# and Java, text strings are represented as sequences of 16-bit alues called `
          char
        ` s. These sequences are well-formed under UTF-16, a 16-bit encoding form f Unicode, except if they contain unpaired surrogate code points. (A urrogate code point is used to encode supplementary characters, those ith code points U+10000 or higher, in UTF-16. A surrogate pair is a igh surrogate [U+D800 to U+DBFF] followed by a low surrogate [U+DC00 to +DFFF]. An unpaired surrogate code point is a surrogate not appearing n a surrogate pair.) Many of the methods in this class allow setting he behavior to follow when unpaired surrogate code points are found in ext strings, such as throwing an error or treating the unpaired urrogate as a replacement character (U+FFFD).

Contains methods useful for reading and writing strings. It is designed o have no dependencies other than the basic runtime class library.Many of these methods work with text encoded in UTF-8, an encoding form f the Unicode Standard which uses one byte to encode the most basic haracters and two to four bytes to encode other characters. For xample, the `
           GetUtf8
        ` method converts a text string to an array of bytes in UTF-8.

In C# and Java, text strings are represented as sequences of 16-bit alues called `
           char
        ` s. These sequences are well-formed under UTF-16, a 16-bit encoding form f Unicode, except if they contain unpaired surrogate code points. (A urrogate code point is used to encode supplementary characters, those ith code points U+10000 or higher, in UTF-16. A surrogate pair is a igh surrogate [U+D800 to U+DBFF] followed by a low surrogate [U+DC00 to +DFFF]. An unpaired surrogate code point is a surrogate not appearing n a surrogate pair.) Many of the methods in this class allow setting he behavior to follow when unpaired surrogate code points are found in ext strings, such as throwing an error or treating the unpaired urrogate as a replacement character (U+FFFD).

Contains methods useful for reading and writing strings. It is designed o have no dependencies other than the basic runtime class library.Many of these methods work with text encoded in UTF-8, an encoding form f the Unicode Standard which uses one byte to encode the most basic haracters and two to four bytes to encode other characters. For xample, the `
           GetUtf8
        ` method converts a text string to an array of bytes in UTF-8.

In C# and Java, text strings are represented as sequences of 16-bit alues called `
           char
        ` s. These sequences are well-formed under UTF-16, a 16-bit encoding form f Unicode, except if they contain unpaired surrogate code points. (A urrogate code point is used to encode supplementary characters, those ith code points U+10000 or higher, in UTF-16. A surrogate pair is a igh surrogate [U+D800 to U+DBFF] followed by a low surrogate [U+DC00 to +DFFF]. An unpaired surrogate code point is a surrogate not appearing n a surrogate pair.) Many of the methods in this class allow setting he behavior to follow when unpaired surrogate code points are found in ext strings, such as throwing an error or treating the unpaired urrogate as a replacement character (U+FFFD).

### CodePointAt

    public static int CodePointAt(
        string str,
        int index);

Not documented yet.

Gets the Unicode code point at the given index of the string.

Gets the Unicode code point at the given index of the string.

Gets the Unicode code point at the given index of the string.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

<b>Return Value:</b>

The Unicode code point at the given position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns the eplacement character (U+FFFD) if the current character is an unpaired urrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
        char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the given position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns the eplacement character (U+FFFD) if the current character is an unpaired urrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
         char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the given position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns the eplacement character (U+FFFD) if the current character is an unpaired urrogate code point.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

### CodePointAt

    public static int CodePointAt(
        string str,
        int index,
        int surrogateBehavior);

Not documented yet.

Gets the Unicode code point at the given index of the string.

Gets the Unicode code point at the given index of the string.

Gets the Unicode code point at the given index of the string.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

<b>Return Value:</b>

The Unicode code point at the current position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
        char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the current position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
         char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the current position. Returns -1 if <i>index</i>
is less than 0, or is the string's length or greater. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

### CodePointBefore

    public static int CodePointBefore(
        string str,
        int index);

Not documented yet.

Gets the Unicode code point just before the given index of the string.

Gets the Unicode code point just before the given index of the string.

Gets the Unicode code point just before the given index of the string.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns the eplacement character (U+FFFD) if the previous character is an unpaired urrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
        char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns the eplacement character (U+FFFD) if the previous character is an unpaired urrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
         char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns the eplacement character (U+FFFD) if the previous character is an unpaired urrogate code point.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

### CodePointBefore

    public static int CodePointBefore(
        string str,
        int index,
        int surrogateBehavior);

Not documented yet.

Gets the Unicode code point just before the given index of the string.

Gets the Unicode code point just before the given index of the string.

Gets the Unicode code point just before the given index of the string.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>index</i>: Index of the current position into the string.

 * <i>surrogateBehavior</i>: Specifies what kind of value to return if the previous character is an npaired surrogate code point: if 0, return the replacement character U+FFFD); if 1, return the value of the surrogate code point; if neither 0 or 1, return -1.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
        char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.<b>NOTE:</b>If the return value is 65536 (0x10000) or greater, this indicates a upplementary code point that takes up two `
         char
      ` s rather than one.

<b>Return Value:</b>

The Unicode code point at the previous position. Returns -1 if <i>index</i>
is 0 or less, or is greater than the string's length. Returns a value as pecified under <i>surrogateBehavior</i>
if the previous character is an unpaired surrogate code point.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

### CodePointCompare

    public static int CodePointCompare(
        string strA,
        string strB);

Not documented yet.

Compares two strings in Unicode code point order. Unpaired surrogate code oints are treated as individual code points.

Compares two strings in Unicode code point order. Unpaired surrogate code oints are treated as individual code points.

Compares two strings in Unicode code point order. Unpaired surrogate code oints are treated as individual code points.

<b>Parameters:</b>

 * <i>strA</i>: The first string. Can be null.

 * <i>strB</i>: The second string. Can be null.

 * <i>strA</i>: The first string. Can be null.

 * <i>strB</i>: The second string. Can be null.

 * <i>strA</i>: The first string. Can be null.

 * <i>strB</i>: The second string. Can be null.

<b>Return Value:</b>

A value indicating which string is " less" or " greater" . 0: Both trings are equal or null. Less than 0: a is null and b isn't; or the irst code point that's different is less in A than in B; or b starts with and is longer than a. Greater than 0: b is null and a isn't; or the irst code point that's different is greater in A than in B; or a starts ith b and is longer than b.

<b>Return Value:</b>

A value indicating which string is " less" or " greater" . 0: Both trings are equal or null. Less than 0: a is null and b isn't; or the irst code point that's different is less in A than in B; or b starts with and is longer than a. Greater than 0: b is null and a isn't; or the irst code point that's different is greater in A than in B; or a starts ith b and is longer than b.

<b>Return Value:</b>

A value indicating which string is " less" or " greater" . 0: Both trings are equal or null. Less than 0: a is null and b isn't; or the irst code point that's different is less in A than in B; or b starts with and is longer than a. Greater than 0: b is null and a isn't; or the irst code point that's different is greater in A than in B; or a starts ith b and is longer than b.

### GetUtf8Bytes

    public static byte[] GetUtf8Bytes(
        string str,
        bool replace);

Not documented yet.

Encodes a string in UTF-8 as a byte array.

Encodes a string in UTF-8 as a byte array.

Encodes a string in UTF-8 as a byte array.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

### GetUtf8Bytes

    public static byte[] GetUtf8Bytes(
        string str,
        bool replace,
        bool lenientLineBreaks);

Not documented yet.

Encodes a string in UTF-8 as a byte array.

Encodes a string in UTF-8 as a byte array.

Encodes a string in UTF-8 as a byte array.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Return Value:</b>

The string encoded in UTF-8.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentException:
The string contains an unpaired surrogate code point and <i>replace</i>
is false, or an internal error occurred.

### GetUtf8Length

    public static long GetUtf8Length(
        string str,
        bool replace);

Not documented yet.

Calculates the number of bytes needed to encode a string in UTF-8.

Calculates the number of bytes needed to encode a string in UTF-8.

Calculates the number of bytes needed to encode a string in UTF-8.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, treats unpaired surrogate code points as having 3 UTF-8 bytes the UTF-8 length of the replacement character U+FFFD).

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, treats unpaired surrogate code points as having 3 UTF-8 bytes the UTF-8 length of the replacement character U+FFFD).

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>replace</i>: If true, treats unpaired surrogate code points as having 3 UTF-8 bytes the UTF-8 length of the replacement character U+FFFD).

<b>Return Value:</b>

The number of bytes needed to encode the given string in UTF-8, or -1 if he string contains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

The number of bytes needed to encode the given string in UTF-8, or -1 if he string contains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

The number of bytes needed to encode the given string in UTF-8, or -1 if he string contains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null.

### GetUtf8String

    public static string GetUtf8String(
        byte[] bytes,
        bool replace);

Not documented yet.

Generates a text string from a UTF-8 byte array.

Generates a text string from a UTF-8 byte array.

Generates a text string from a UTF-8 byte array.

<b>Parameters:</b>

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The string is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The string is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The string is not valid UTF-8 and <i>replace</i>
is false.

### GetUtf8String

    public static string GetUtf8String(
        byte[] bytes,
        int offset,
        int bytesCount,
        bool replace);

Not documented yet.

Generates a text string from a portion of a UTF-8 byte array.

Generates a text string from a portion of a UTF-8 byte array.

Generates a text string from a portion of a UTF-8 byte array.

<b>Parameters:</b>

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>bytes</i>: A byte array containing text encoded in UTF-8.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Return Value:</b>

A string represented by the UTF-8 byte array.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The portion of the byte array is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of data" .

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The portion of the byte array is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of data" .

 * System.ArgumentNullException:
The parameter <i>bytes</i>
is null.

 * System.ArgumentException:
The portion of the byte array is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of data" .

### ReadUtf8

    public static int ReadUtf8(
        System.IO.Stream stream,
        int bytesCount,
        System.Text.StringBuilder builder,
        bool replace);

Not documented yet.

Reads a string in UTF-8 encoding from a data stream.

Reads a string in UTF-8 encoding from a data stream.

Reads a string in UTF-8 encoding from a data stream.

<b>Parameters:</b>

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when an unpaired surrogate code point s seen.

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when an unpaired surrogate code point s seen.

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when an unpaired surrogate code point s seen.

<b>Return Value:</b>

0 if the entire string was read without errors, -1 if the string is not alid UTF-8 and <i>replace</i>
is false, or -2 if the end of the stream was reached before the last haracter was read completely (which is only the case if <i>bytesCount</i>
is 0 or greater).

<b>Return Value:</b>

0 if the entire string was read without errors, -1 if the string is not alid UTF-8 and <i>replace</i>
is false, or -2 if the end of the stream was reached before the last haracter was read completely (which is only the case if <i>bytesCount</i>
is 0 or greater).

<b>Return Value:</b>

0 if the entire string was read without errors, -1 if the string is not alid UTF-8 and <i>replace</i>
is false, or -2 if the end of the stream was reached before the last haracter was read completely (which is only the case if <i>bytesCount</i>
is 0 or greater).

<b>Exceptions:</b>

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null or <i>builder</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null or <i>builder</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null or <i>builder</i>
is null.

### ReadUtf8FromBytes

    public static int ReadUtf8FromBytes(
        byte[] data,
        int offset,
        int bytesCount,
        System.Text.StringBuilder builder,
        bool replace);

Not documented yet.

Reads a string in UTF-8 encoding from a byte array.

Reads a string in UTF-8 encoding from a byte array.

Reads a string in UTF-8 encoding from a byte array.

<b>Parameters:</b>

 * <i>data</i>: A byte array containing a UTF-8 string.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>data</i>: A byte array containing a UTF-8 string.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

 * <i>data</i>: A byte array containing a UTF-8 string.

 * <i>offset</i>: Offset into the byte array to start reading.

 * <i>bytesCount</i>: Length, in bytes, of the UTF-8 string.

 * <i>builder</i>: A string builder object where the resulting string will be stored.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, stops processing when invalid UTF-8 is seen.

<b>Return Value:</b>

0 if the entire string was read without errors, or -1 if the string is ot valid UTF-8 and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string was read without errors, or -1 if the string is ot valid UTF-8 and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string was read without errors, or -1 if the string is ot valid UTF-8 and <i>replace</i>
is false.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>data</i>
is null or <i>builder</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of <i>data</i>
.

 * System.ArgumentNullException:
The parameter <i>data</i>
is null or <i>builder</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of <i>data</i>
.

 * System.ArgumentNullException:
The parameter <i>data</i>
is null or <i>builder</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>bytesCount</i>
is less than 0, or offset plus bytesCount is greater than the length of <i>data</i>
.

### ReadUtf8ToString

    public static string ReadUtf8ToString(
        System.IO.Stream stream);

Not documented yet.

Reads a string in UTF-8 encoding from a data stream in full and returns hat string. Replaces invalid encoding with the replacement character U+FFFD).

Reads a string in UTF-8 encoding from a data stream in full and returns hat string. Replaces invalid encoding with the replacement character U+FFFD).

Reads a string in UTF-8 encoding from a data stream in full and returns hat string. Replaces invalid encoding with the replacement character U+FFFD).

<b>Parameters:</b>

 * <i>stream</i>: A readable data stream.

 * <i>stream</i>: A readable data stream.

 * <i>stream</i>: A readable data stream.

<b>Return Value:</b>

The string read.

<b>Return Value:</b>

The string read.

<b>Return Value:</b>

The string read.

<b>Exceptions:</b>

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

### ReadUtf8ToString

    public static string ReadUtf8ToString(
        System.IO.Stream stream,
        int bytesCount,
        bool replace);

Not documented yet.

Reads a string in UTF-8 encoding from a data stream and returns that tring.

Reads a string in UTF-8 encoding from a data stream and returns that tring.

Reads a string in UTF-8 encoding from a data stream and returns that tring.

<b>Parameters:</b>

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, throws an error if an unpaired surrogate code point is een.

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, throws an error if an unpaired surrogate code point is een.

 * <i>stream</i>: A readable data stream.

 * <i>bytesCount</i>: The length, in bytes, of the string. If this is less than 0, this unction will read until the end of the stream.

 * <i>replace</i>: If true, replaces invalid encoding with the replacement character U+FFFD). If false, throws an error if an unpaired surrogate code point is een.

<b>Return Value:</b>

The string read.

<b>Return Value:</b>

The string read.

<b>Return Value:</b>

The string read.

<b>Exceptions:</b>

 * System.IO.IOException:
An I/O error occurred; or, the string is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred; or, the string is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred; or, the string is not valid UTF-8 and <i>replace</i>
is false.

 * System.ArgumentNullException:
The parameter <i>stream</i>
is null.

### ToLowerCaseAscii

    public static string ToLowerCaseAscii(
        string str);

Not documented yet.

Returns a string with the basic upper-case letters A to Z (U+0041 to +005A) converted to lower-case. Other characters remain unchanged.

Returns a string with the basic upper-case letters A to Z (U+0041 to +005A) converted to lower-case. Other characters remain unchanged.

Returns a string with the basic upper-case letters A to Z (U+0041 to +005A) converted to lower-case. Other characters remain unchanged.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

<b>Return Value:</b>

The converted string, or null if <i>str</i>
is null.

<b>Return Value:</b>

The converted string, or null if <i>str</i>
is null.

<b>Return Value:</b>

The converted string, or null if <i>str</i>
is null.

### ToUpperCaseAscii

    public static string ToUpperCaseAscii(
        string str);

Not documented yet.

Returns a string with the basic lower-case letters A to Z (U+0061 to +007A) converted to upper-case. Other characters remain unchanged.

Returns a string with the basic lower-case letters A to Z (U+0061 to +007A) converted to upper-case. Other characters remain unchanged.

<b>Parameters:</b>

 * <i>str</i>: The parameter <i>str</i>
is a text string.

 * <i>str</i>: The parameter <i>str</i>
is a text string.

<b>Return Value:</b>

The converted string, or null if <i>str</i>
is null.

<b>Return Value:</b>

The converted string, or null if <i>str</i>
is null.

### WriteUtf8

    public static int WriteUtf8(
        string str,
        int offset,
        int length,
        System.IO.Stream stream,
        bool replace);

Not documented yet.

Writes a portion of a string in UTF-8 encoding to a data stream.

Writes a portion of a string in UTF-8 encoding to a data stream.

Writes a portion of a string in UTF-8 encoding to a data stream.

<b>Parameters:</b>

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

### WriteUtf8

    public static int WriteUtf8(
        string str,
        int offset,
        int length,
        System.IO.Stream stream,
        bool replace,
        bool lenientLineBreaks);

Not documented yet.

Writes a portion of a string in UTF-8 encoding to a data stream.

Writes a portion of a string in UTF-8 encoding to a data stream.

Writes a portion of a string in UTF-8 encoding to a data stream.

<b>Parameters:</b>

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

 * <i>str</i>: A string to write.

 * <i>offset</i>: The zero-based index where the string portion to write begins.

 * <i>length</i>: The length of the string portion to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>lenientLineBreaks</i>: If true, replaces carriage return (CR) not followed by line feed (LF) and F not preceded by CR with CR-LF pairs.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string portion was written; or -1 if the string portion ontains an unpaired surrogate code point and <i>replace</i>
is false.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.ArgumentException:
The parameter <i>offset</i>
is less than 0, <i>length</i>
is less than 0, or <i>offset</i>
plus <i>length</i>
is greater than the string's length.

 * System.IO.IOException:
An I/O error occurred.

### WriteUtf8

    public static int WriteUtf8(
        string str,
        System.IO.Stream stream,
        bool replace);

Not documented yet.

Writes a string in UTF-8 encoding to a data stream.

Writes a string in UTF-8 encoding to a data stream.

Writes a string in UTF-8 encoding to a data stream.

<b>Parameters:</b>

 * <i>str</i>: A string to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: A string to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

 * <i>str</i>: A string to write.

 * <i>stream</i>: A writable data stream.

 * <i>replace</i>: If true, replaces unpaired surrogate code points with the replacement haracter (U+FFFD). If false, stops processing when an unpaired surrogate ode point is seen.

<b>Return Value:</b>

0 if the entire string was written; or -1 if the string contains an npaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string was written; or -1 if the string contains an npaired surrogate code point and <i>replace</i>
is false.

<b>Return Value:</b>

0 if the entire string was written; or -1 if the string contains an npaired surrogate code point and <i>replace</i>
is false.

<b>Exceptions:</b>

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred.

 * System.ArgumentNullException:
The parameter <i>str</i>
is null or <i>stream</i>
is null.

 * System.IO.IOException:
An I/O error occurred.
