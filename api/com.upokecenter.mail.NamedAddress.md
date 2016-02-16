# com.upokecenter.mail.NamedAddress

    public class NamedAddress extends Object

Represents an email address and a name for that address. Can represent a
 group of email addresses instead.

## Methods

* `NamedAddress(String address)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String displayName,
            Address address)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String groupName,
            List<NamedAddress> mailboxes)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String displayName,
            String address)`<br>
 Initializes a new instance of the NamedAddress class using the given display
 name and email address.
* `NamedAddress(String displayName,
            String localPart,
            String domain)`<br>
 Initializes a new instance of the NamedAddress class using the given name
 and an email address made up of its local part and domain.
* `Address getAddress()`<br>
 Gets the email address associated with this object.
* `List<NamedAddress> getGroupAddresses()`<br>
 Gets a read-only list of addresses that make up the group, if this object
 represents a group, or an empty list otherwise.
* `String getName()`<br>
 Gets the display name for this email address (or the email address's value
 if the display name is absent).
* `boolean isGroup()`<br>
 Gets a value indicating whether this represents a group of addresses rather
 than a single address.
* `String toString()`<br>
 Converts this object to a text string.

## Constructors

* `NamedAddress(String address)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String displayName,
            Address address)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String groupName,
            List<NamedAddress> mailboxes)`<br>
 Initializes a new instance of the NamedAddress class.
* `NamedAddress(String displayName,
            String address)`<br>
 Initializes a new instance of the NamedAddress class using the given display
 name and email address.
* `NamedAddress(String displayName,
            String localPart,
            String domain)`<br>
 Initializes a new instance of the NamedAddress class using the given name
 and an email address made up of its local part and domain.

## Method Details

### NamedAddress
    public NamedAddress(String address)
Initializes a new instance of the NamedAddress class. Examples: <ul>
 <li><code>john@example.com</code></li> <li><code>"John Doe"
 &lt;john@example.com&gt;</code></li>
 <li><code>=?utf-8?q?John</code><code>=</code><code>27s_Office?=
 &lt;john@example.com&gt;</code></li> <li><code>John
 &lt;john@example.com&gt;</code></li> <li><code>"Group" : Tom
 &lt;tom@example.com&gt;, Jane &lt;jane@example.com&gt;;</code></li></ul>

**Parameters:**

* <code>address</code> - A string object identifying a single email address or a group
 of email addresses. Comments, or text within parentheses, can appear.
 Multiple email addresses are not allowed unless they appear in the
 group syntax given above. Encoded words under RFC 2047 that appear
 within comments or display names will be decoded. <p>An RFC 2047
 encoded word consists of "=?", a character encoding name, such as
 <code>utf-8</code>, either "?B?" or "?Q?" (in upper or lower case), a
 series of bytes in the character encoding, further encoded using B or
 Q encoding, and finally "?=". B encoding uses Base64, while in Q
 encoding, spaces are changed to "_", equals are changed to "=3D",
 and most bytes other than the basic digits 0 to 9 (0x30 to 0x39) and
 the basic letters A/a to Z/z (0x41 to 0x5a, 0x61 to 0x7a) are changed
 to "=" followed by their 2-digit hexadecimal form. An encoded word's
 maximum length is 75 characters. See the second example.</p>.

**Throws:**

* <code>NullPointerException</code> - The parameter <code>address</code> is null.

* <code>IllegalArgumentException</code> - The named address has an invalid syntax.

### NamedAddress
    public NamedAddress(String displayName, String address)
Initializes a new instance of the NamedAddress class using the given display
 name and email address.

**Parameters:**

* <code>displayName</code> - The address's display name. Can be null or empty, in
 which case the email address is used instead. Encoded words under RFC
 2047 will not be decoded.

* <code>address</code> - An email address.

**Throws:**

* <code>NullPointerException</code> - The parameter <code>address</code> is null.

* <code>IllegalArgumentException</code> - The display name or address has an invalid syntax.

### NamedAddress
    public NamedAddress(String displayName, Address address)
Initializes a new instance of the NamedAddress class.

**Parameters:**

* <code>displayName</code> - A string object. If this value is null or empty, uses the
 email address as the display name. Encoded words under RFC 2047 will
 not be decoded.

* <code>address</code> - An email address.

**Throws:**

* <code>NullPointerException</code> - The parameter <code>address</code> is null.

### NamedAddress
    public NamedAddress(String displayName, String localPart, String domain)
Initializes a new instance of the NamedAddress class using the given name
 and an email address made up of its local part and domain.

**Parameters:**

* <code>displayName</code> - A string object. If this value is null or empty, uses the
 email address as the display name.

* <code>localPart</code> - The local part of the email address (before the "@").

* <code>domain</code> - The domain of the email address (before the "@").

**Throws:**

* <code>NullPointerException</code> - The parameter <code>localPart</code> or <code>domain</code> is null.

### NamedAddress
    public NamedAddress(String groupName, List<NamedAddress> mailboxes)
Initializes a new instance of the NamedAddress class. Takes a group name and
 several named email addresses as parameters, and forms a group with
 them.

**Parameters:**

* <code>groupName</code> - The group's name.

* <code>mailboxes</code> - A list of named addresses that make up the group.

**Throws:**

* <code>NullPointerException</code> - The parameter <code>groupName</code> or <code>mailboxes</code> is null.

* <code>IllegalArgumentException</code> - The parameter <code>groupName</code> is empty, or an
 item in the list is itself a group.

### getName
    public final String getName()
Gets the display name for this email address (or the email address's value
 if the display name is absent).

**Returns:**

* The display name for this email address.

### getAddress
    public final Address getAddress()
Gets the email address associated with this object.

**Returns:**

* The email address associated with this object. This value is null if
 this object represents a group of addresses instead.

### isGroup
    public final boolean isGroup()
Gets a value indicating whether this represents a group of addresses rather
 than a single address.

**Returns:**

* True if this represents a group of addresses; otherwise, false.

### toString
    public String toString()
Converts this object to a text string.

**Overrides:**

* <code>toString</code>&nbsp;in class&nbsp;<code>Object</code>

**Returns:**

* A string representation of this object.

### getGroupAddresses
    public final List<NamedAddress> getGroupAddresses()
Gets a read-only list of addresses that make up the group, if this object
 represents a group, or an empty list otherwise.

**Returns:**

* A list of addresses that make up the group, if this object
 represents a group, or an empty list otherwise.