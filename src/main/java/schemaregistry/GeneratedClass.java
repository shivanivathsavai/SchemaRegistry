/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package schemaregistry;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GeneratedClass extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6568738259096933234L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeneratedClass\",\"namespace\":\"schemaregistry\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"colour\",\"type\":[\"string\",\"null\"]},{\"name\":\"model\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeneratedClass> ENCODER =
      new BinaryMessageEncoder<GeneratedClass>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeneratedClass> DECODER =
      new BinaryMessageDecoder<GeneratedClass>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GeneratedClass> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GeneratedClass> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GeneratedClass> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeneratedClass>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GeneratedClass to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GeneratedClass from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GeneratedClass instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GeneratedClass fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence name;
   private java.lang.CharSequence colour;
   private java.lang.CharSequence model;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeneratedClass() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param colour The new value for colour
   * @param model The new value for model
   */
  public GeneratedClass(java.lang.CharSequence name, java.lang.CharSequence colour, java.lang.CharSequence model) {
    this.name = name;
    this.colour = colour;
    this.model = model;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return colour;
    case 2: return model;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: colour = (java.lang.CharSequence)value$; break;
    case 2: model = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'colour' field.
   * @return The value of the 'colour' field.
   */
  public java.lang.CharSequence getColour() {
    return colour;
  }


  /**
   * Sets the value of the 'colour' field.
   * @param value the value to set.
   */
  public void setColour(java.lang.CharSequence value) {
    this.colour = value;
  }

  /**
   * Gets the value of the 'model' field.
   * @return The value of the 'model' field.
   */
  public java.lang.CharSequence getModel() {
    return model;
  }


  /**
   * Sets the value of the 'model' field.
   * @param value the value to set.
   */
  public void setModel(java.lang.CharSequence value) {
    this.model = value;
  }

  /**
   * Creates a new GeneratedClass RecordBuilder.
   * @return A new GeneratedClass RecordBuilder
   */
  public static schemaregistry.GeneratedClass.Builder newBuilder() {
    return new schemaregistry.GeneratedClass.Builder();
  }

  /**
   * Creates a new GeneratedClass RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeneratedClass RecordBuilder
   */
  public static schemaregistry.GeneratedClass.Builder newBuilder(schemaregistry.GeneratedClass.Builder other) {
    if (other == null) {
      return new schemaregistry.GeneratedClass.Builder();
    } else {
      return new schemaregistry.GeneratedClass.Builder(other);
    }
  }

  /**
   * Creates a new GeneratedClass RecordBuilder by copying an existing GeneratedClass instance.
   * @param other The existing instance to copy.
   * @return A new GeneratedClass RecordBuilder
   */
  public static schemaregistry.GeneratedClass.Builder newBuilder(schemaregistry.GeneratedClass other) {
    if (other == null) {
      return new schemaregistry.GeneratedClass.Builder();
    } else {
      return new schemaregistry.GeneratedClass.Builder(other);
    }
  }

  /**
   * RecordBuilder for GeneratedClass instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeneratedClass>
    implements org.apache.avro.data.RecordBuilder<GeneratedClass> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence colour;
    private java.lang.CharSequence model;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(schemaregistry.GeneratedClass.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.colour)) {
        this.colour = data().deepCopy(fields()[1].schema(), other.colour);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.model)) {
        this.model = data().deepCopy(fields()[2].schema(), other.model);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing GeneratedClass instance
     * @param other The existing instance to copy.
     */
    private Builder(schemaregistry.GeneratedClass other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.colour)) {
        this.colour = data().deepCopy(fields()[1].schema(), other.colour);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.model)) {
        this.model = data().deepCopy(fields()[2].schema(), other.model);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'colour' field.
      * @return The value.
      */
    public java.lang.CharSequence getColour() {
      return colour;
    }


    /**
      * Sets the value of the 'colour' field.
      * @param value The value of 'colour'.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder setColour(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.colour = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'colour' field has been set.
      * @return True if the 'colour' field has been set, false otherwise.
      */
    public boolean hasColour() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'colour' field.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder clearColour() {
      colour = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'model' field.
      * @return The value.
      */
    public java.lang.CharSequence getModel() {
      return model;
    }


    /**
      * Sets the value of the 'model' field.
      * @param value The value of 'model'.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder setModel(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.model = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'model' field has been set.
      * @return True if the 'model' field has been set, false otherwise.
      */
    public boolean hasModel() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'model' field.
      * @return This builder.
      */
    public schemaregistry.GeneratedClass.Builder clearModel() {
      model = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeneratedClass build() {
      try {
        GeneratedClass record = new GeneratedClass();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.colour = fieldSetFlags()[1] ? this.colour : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.model = fieldSetFlags()[2] ? this.model : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeneratedClass>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeneratedClass>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeneratedClass>
    READER$ = (org.apache.avro.io.DatumReader<GeneratedClass>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.colour == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.colour);
    }

    if (this.model == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.model);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.colour = null;
      } else {
        this.colour = in.readString(this.colour instanceof Utf8 ? (Utf8)this.colour : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.model = null;
      } else {
        this.model = in.readString(this.model instanceof Utf8 ? (Utf8)this.model : null);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.colour = null;
          } else {
            this.colour = in.readString(this.colour instanceof Utf8 ? (Utf8)this.colour : null);
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.model = null;
          } else {
            this.model = in.readString(this.model instanceof Utf8 ? (Utf8)this.model : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










