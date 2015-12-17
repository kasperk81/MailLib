/*
Written by Peter O. in 2014.
Any copyright is dedicated to the Public Domain.
http://creativecommons.org/publicdomain/zero/1.0/
If you like this, you should donate to Peter O.
at: http://upokecenter.dreamhosters.com/articles/donate-now-2/
 */
using System;
using System.Collections.Generic;

using PeterO;

namespace PeterO.Mail {
    /// <summary>A mutable media type object.</summary>
  public sealed class MediaTypeBuilder {
    private string type;
    private string subtype;
    private readonly IDictionary<string, string> parameters;

    /// <summary>Gets or sets this value's top-level type.</summary>
    /// <value>This value&#x27;s top-level type.</value>
    public string TopLevelType {
      get {
        return this.type;
      }

      set {
        this.SetTopLevelType(value);
      }
    }

    /// <summary>Gets or sets this value's subtype.</summary>
    /// <value>This value&#x27;s subtype.</value>
    public string SubType {
      get {
        return this.subtype;
      }

      set {
        this.SetSubType(value);
      }
    }

    /// <summary>Initializes a new instance of the MediaTypeBuilder
    /// class.</summary>
    public MediaTypeBuilder() {
      this.parameters = new Dictionary<string, string>();
      this.type = "application";
      this.subtype = "octet-stream";
    }

    /// <summary>Initializes a new instance of the MediaTypeBuilder
    /// class.</summary>
    /// <param name='mt'>A MediaType object.</param>
    /// <exception cref="ArgumentNullException">The parameter <paramref
    /// name='mt'/> is null.</exception>
    public MediaTypeBuilder(MediaType mt) {
      if (mt == null) {
        throw new ArgumentNullException("mt");
      }
      this.parameters = new Dictionary<string, string>(mt.Parameters);
      this.type = mt.TopLevelType;
      this.subtype = mt.SubType;
    }

    /// <summary>Initializes a new instance of the MediaTypeBuilder
    /// class.</summary>
    /// <param name='type'>A string object.</param>
    /// <param name='subtype'>Another string object.</param>
    public MediaTypeBuilder(string type, string subtype) {
      this.parameters = new Dictionary<string, string>();
      this.SetTopLevelType(type);
      this.SetSubType(subtype);
    }

    /// <summary>Gets a value indicating whether this is a text media
    /// type.</summary>
    /// <value>True if this is a text media type; otherwise, false.</value>
    public bool IsText {
      get {
        return this.TopLevelType.Equals("text");
      }
    }

    /// <summary>Gets a value indicating whether this is a multipart media
    /// type.</summary>
    /// <value>True if this is a multipart media type; otherwise,
    /// false.</value>
    public bool IsMultipart {
      get {
        return this.TopLevelType.Equals("multipart");
      }
    }

    /// <summary>Converts this builder to an immutable media type
    /// object.</summary>
    /// <returns>A MediaType object.</returns>
    public MediaType ToMediaType() {
      return new MediaType(this.type, this.subtype, this.parameters);
    }

    /// <summary>Sets this media type's top-level type.</summary>
    /// <param name='str'>A string object naming a top-level type, such as
    /// "text" or "audio".</param>
    /// <returns>This instance.</returns>
    /// <exception cref="ArgumentNullException">The parameter <paramref
    /// name='str'/> is null.</exception>
    /// <exception cref="ArgumentException">The parameter <paramref
    /// name='str'/> is syntactically invalid for a top-level
    /// type.</exception>
    public MediaTypeBuilder SetTopLevelType(string str) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (str.Length == 0) {
        throw new ArgumentException("str is empty.");
      }
   if (MediaType.skipMimeTypeSubtype(str, 0, str.Length, null) !=
        str.Length) {
        throw new ArgumentException("Not a well-formed top level type: " + str);
      }
      this.type = DataUtilities.ToLowerCaseAscii(str);
      return this;
    }

    /// <summary>Removes a parameter from this builder object. Does nothing
    /// if the parameter's name doesn't exist.</summary>
    /// <param name='name'>Name of the parameter to remove. The name is
    /// compared case-insensitively.</param>
    /// <returns>This instance.</returns>
    /// <exception cref="ArgumentNullException">The parameter <paramref
    /// name='name'/> is null.</exception>
    public MediaTypeBuilder RemoveParameter(string name) {
      if (name == null) {
        throw new ArgumentNullException("name");
      }
      this.parameters.Remove(DataUtilities.ToLowerCaseAscii(name));
      return this;
    }

    /// <summary>Sets a parameter's name and value for this media
    /// type.</summary>
    /// <param name='name'>Name of the parameter to set, such as "charset".
    /// The name is compared case-insensitively.</param>
    /// <param name='value'>A string object giving the parameter's
    /// value.</param>
    /// <returns>This instance.</returns>
    /// <exception cref="ArgumentNullException">The parameter <paramref
    /// name='value'/> or <paramref name='name'/> is null.</exception>
    /// <exception cref="ArgumentException">The parameter <paramref
    /// name='name'/> is empty or syntactically invalid.</exception>
    public MediaTypeBuilder SetParameter(string name, string value) {
      if (value == null) {
        throw new ArgumentNullException("value");
      }
      if (name == null) {
        throw new ArgumentNullException("name");
      }
      if (name.Length == 0) {
        throw new ArgumentException("name is empty.");
      }
if (MediaType.skipMimeTypeSubtype(name, 0, name.Length, null) !=
        name.Length) {
      throw new ArgumentException("Not a well-formed parameter name: " +
          name);
      }
      this.parameters[DataUtilities.ToLowerCaseAscii(name)] = value;
      return this;
    }

    /// <summary>Sets this media type's subtype, such as "plain" or "xml"
    /// .</summary>
    /// <param name='str'>A string object naming a media subtype.</param>
    /// <returns>This instance.</returns>
    /// <exception cref="ArgumentNullException">The parameter <paramref
    /// name='str'/> is null.</exception>
    /// <exception cref="ArgumentException">The parameter <paramref
    /// name='str'/> is empty or syntactically invalid.</exception>
    public MediaTypeBuilder SetSubType(string str) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (str.Length == 0) {
        throw new ArgumentException("str is empty.");
      }
   if (MediaType.skipMimeTypeSubtype(str, 0, str.Length, null) !=
        str.Length) {
        throw new ArgumentException("Not a well-formed subtype: " + str);
      }
      this.subtype = DataUtilities.ToLowerCaseAscii(str);
      return this;
    }

    /// <summary>Converts this object to a text string.</summary>
    /// <returns>A string representation of this object.</returns>
    public override string ToString() {
      return this.ToMediaType().ToString();
    }
  }
}
