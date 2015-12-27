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
    /// <include file='docs.xml'
    /// path='docs/doc[@name="T:PeterO.Mail.DispositionBuilder"]'/>
  public class DispositionBuilder {
    private string type;
    private readonly IDictionary<string, string> parameters;

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.DispositionBuilder.DispositionType"]'/>
    public string DispositionType {
      get {
        return this.type;
      }

      set {
        this.SetDispositionType(value);
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.#ctor"]'/>
    public DispositionBuilder() {
      this.parameters = new Dictionary<string, string>();
      this.type = "attachment";
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.#ctor(PeterO.Mail.ContentDisposition)"]'/>
    public DispositionBuilder(ContentDisposition mt) {
      if (mt == null) {
        throw new ArgumentNullException("mt");
      }
      this.parameters = new Dictionary<string, string>(mt.Parameters);
      this.type = mt.DispositionType;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.#ctor(System.String)"]'/>
    public DispositionBuilder(string type) {
      if (type == null) {
  throw new ArgumentNullException("type");
}
if (type.Length == 0) {
  throw new ArgumentException("type" + " is empty.");
}
      this.parameters = new Dictionary<string, string>();
      this.SetDispositionType(type);
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.DispositionBuilder.IsText"]'/>
[Obsolete("Irrelevant for content dispositions; will be removed in the future."
)]
    public bool IsText {
      get {
        return this.DispositionType.Equals("text");
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="P:PeterO.Mail.DispositionBuilder.IsMultipart"]'/>
[Obsolete("Irrelevant for content dispositions; will be removed in the future."
)]
    public bool IsMultipart {
      get {
        return this.DispositionType.Equals("multipart");
      }
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.ToDisposition"]'/>
    public ContentDisposition ToDisposition() {
      return new ContentDisposition(this.type, this.parameters);
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.SetDispositionType(System.String)"]'/>
    public DispositionBuilder SetDispositionType(string str) {
      if (str == null) {
        throw new ArgumentNullException("str");
      }
      if (str.Length == 0) {
        throw new ArgumentException("str is empty.");
      }
   if (MediaType.skipMimeTypeSubtype(str, 0, str.Length, null) !=
        str.Length) {
        throw new ArgumentException("Not a well-formed type: " + str);
      }
      this.type = DataUtilities.ToLowerCaseAscii(str);
      return this;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.RemoveParameter(System.String)"]'/>
    public DispositionBuilder RemoveParameter(string name) {
      if (name == null) {
        throw new ArgumentNullException("name");
      }
      this.parameters.Remove(DataUtilities.ToLowerCaseAscii(name));
      return this;
    }

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.SetParameter(System.String,System.String)"]'/>
    public DispositionBuilder SetParameter(string name, string value) {
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

    /// <include file='docs.xml'
    /// path='docs/doc[@name="M:PeterO.Mail.DispositionBuilder.ToString"]'/>
    public override string ToString() {
      return this.ToDisposition().ToString();
    }
  }
}