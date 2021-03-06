/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package test.example;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Rdef01Record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Rdef01Record\",\"namespace\":\"test.example\",\"fields\":[{\"name\":\"comSelect\",\"type\":\"int\"},{\"name\":\"comDetail1Choice\",\"type\":[{\"type\":\"record\",\"name\":\"ComDetail1\",\"fields\":[{\"name\":\"comName\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"ComDetail2\",\"fields\":[{\"name\":\"comAmount\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":7,\"scale\":2}}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int comSelect;
  @Deprecated public java.lang.Object comDetail1Choice;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Rdef01Record() {}

  /**
   * All-args constructor.
   */
  public Rdef01Record(java.lang.Integer comSelect, java.lang.Object comDetail1Choice) {
    setComSelect(comSelect);
    setComDetail1Choice(comDetail1Choice);
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return comSelect;
    case 1: return comDetail1Choice;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: comSelect = (java.lang.Integer)value$; break;
    case 1: comDetail1Choice = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'comSelect' field.
   */
  public java.lang.Integer getComSelect() {
    return comSelect;
  }

  /**
   * Sets the value of the 'comSelect' field.
   * @param value the value to set.
   */
  public void setComSelect(java.lang.Integer value) {
    this.comSelect = value;
  }

  /**
   * Gets the value of the 'comDetail1Choice' field.
   */
  public java.lang.Object getComDetail1Choice() {
    return comDetail1Choice;
  }

  /**
   * Sets the value of the 'comDetail1Choice' field.
   * @param value the value to set.
   */
  public void setComDetail1Choice(java.lang.Object value) {
    this.comDetail1Choice = value;
  }

  /** Creates a new Rdef01Record RecordBuilder */
  public static test.example.Rdef01Record.Builder newBuilder() {
    return new test.example.Rdef01Record.Builder();
  }
  
  /** Creates a new Rdef01Record RecordBuilder by copying an existing Builder */
  public static test.example.Rdef01Record.Builder newBuilder(test.example.Rdef01Record.Builder other) {
    return new test.example.Rdef01Record.Builder(other);
  }
  
  /** Creates a new Rdef01Record RecordBuilder by copying an existing Rdef01Record instance */
  public static test.example.Rdef01Record.Builder newBuilder(test.example.Rdef01Record other) {
    return new test.example.Rdef01Record.Builder(other);
  }
  
  /**
   * RecordBuilder for Rdef01Record instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Rdef01Record>
    implements org.apache.avro.data.RecordBuilder<Rdef01Record> {

    private int comSelect;
    private java.lang.Object comDetail1Choice;

    /** Creates a new Builder */
    private Builder() {
      super(test.example.Rdef01Record.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(test.example.Rdef01Record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.comSelect)) {
        this.comSelect = data().deepCopy(fields()[0].schema(), other.comSelect);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comDetail1Choice)) {
        this.comDetail1Choice = data().deepCopy(fields()[1].schema(), other.comDetail1Choice);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Rdef01Record instance */
    private Builder(test.example.Rdef01Record other) {
            super(test.example.Rdef01Record.SCHEMA$);
      if (isValidValue(fields()[0], other.comSelect)) {
        this.comSelect = data().deepCopy(fields()[0].schema(), other.comSelect);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comDetail1Choice)) {
        this.comDetail1Choice = data().deepCopy(fields()[1].schema(), other.comDetail1Choice);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'comSelect' field */
    public java.lang.Integer getComSelect() {
      return comSelect;
    }
    
    /** Sets the value of the 'comSelect' field */
    public test.example.Rdef01Record.Builder setComSelect(int value) {
      validate(fields()[0], value);
      this.comSelect = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'comSelect' field has been set */
    public boolean hasComSelect() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'comSelect' field */
    public test.example.Rdef01Record.Builder clearComSelect() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'comDetail1Choice' field */
    public java.lang.Object getComDetail1Choice() {
      return comDetail1Choice;
    }
    
    /** Sets the value of the 'comDetail1Choice' field */
    public test.example.Rdef01Record.Builder setComDetail1Choice(java.lang.Object value) {
      validate(fields()[1], value);
      this.comDetail1Choice = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'comDetail1Choice' field has been set */
    public boolean hasComDetail1Choice() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'comDetail1Choice' field */
    public test.example.Rdef01Record.Builder clearComDetail1Choice() {
      comDetail1Choice = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Rdef01Record build() {
      try {
        Rdef01Record record = new Rdef01Record();
        record.comSelect = fieldSetFlags()[0] ? this.comSelect : (java.lang.Integer) defaultValue(fields()[0]);
        record.comDetail1Choice = fieldSetFlags()[1] ? this.comDetail1Choice : (java.lang.Object) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
