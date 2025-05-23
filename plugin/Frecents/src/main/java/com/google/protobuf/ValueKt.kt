// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/struct.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializevalue")
public inline fun value(block: com.google.protobuf.ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Value =
  com.google.protobuf.ValueKt.Dsl._create(com.google.protobuf.Value.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.Value`
 */
public object ValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.Value.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.Value.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.Value = _builder.build()

    /**
     * `.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];`
     */
    public var nullValue: com.google.protobuf.NullValue
      @JvmName("getNullValue")
      get() = _builder.nullValue
      @JvmName("setNullValue")
      set(value) {
        _builder.nullValue = value
      }
    public var nullValueValue: kotlin.Int
      @JvmName("getNullValueValue")
      get() = _builder.nullValueValue
      @JvmName("setNullValueValue")
      set(value) {
        _builder.nullValueValue = value
      }
    /**
     * `.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];`
     */
    public fun clearNullValue() {
      _builder.clearNullValue()
    }
    /**
     * `.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];`
     * @return Whether the nullValue field is set.
     */
    public fun hasNullValue(): kotlin.Boolean {
      return _builder.hasNullValue()
    }

    /**
     * <code>double number_value = 2 [json_name = "numberValue"];</code>
     */
    public var numberValue: kotlin.Double
      @JvmName("getNumberValue")
      get() = _builder.numberValue
      @JvmName("setNumberValue")
      set(value) {
        _builder.numberValue = value
      }
    /**
     * `double number_value = 2 [json_name = "numberValue"];`
     */
    public fun clearNumberValue() {
      _builder.clearNumberValue()
    }
    /**
     * `double number_value = 2 [json_name = "numberValue"];`
     * @return Whether the numberValue field is set.
     */
    public fun hasNumberValue(): kotlin.Boolean {
      return _builder.hasNumberValue()
    }

    /**
     * `string string_value = 3 [json_name = "stringValue"];`
     */
    public var stringValue: kotlin.String
      @JvmName("getStringValue")
      get() = _builder.stringValue
      @JvmName("setStringValue")
      set(value) {
        _builder.stringValue = value
      }
    /**
     * `string string_value = 3 [json_name = "stringValue"];`
     */
    public fun clearStringValue() {
      _builder.clearStringValue()
    }
    /**
     * `string string_value = 3 [json_name = "stringValue"];`
     * @return Whether the stringValue field is set.
     */
    public fun hasStringValue(): kotlin.Boolean {
      return _builder.hasStringValue()
    }

    /**
     * <code>bool bool_value = 4 [json_name = "boolValue"];</code>
     */
    public var boolValue: kotlin.Boolean
      @JvmName("getBoolValue")
      get() = _builder.boolValue
      @JvmName("setBoolValue")
      set(value) {
        _builder.boolValue = value
      }
    /**
     * `bool bool_value = 4 [json_name = "boolValue"];`
     */
    public fun clearBoolValue() {
      _builder.clearBoolValue()
    }
    /**
     * `bool bool_value = 4 [json_name = "boolValue"];`
     * @return Whether the boolValue field is set.
     */
    public fun hasBoolValue(): kotlin.Boolean {
      return _builder.hasBoolValue()
    }

    /**
     * `.google.protobuf.Struct struct_value = 5 [json_name = "structValue"];`
     */
    public var structValue: com.google.protobuf.Struct
      @JvmName("getStructValue")
      get() = _builder.structValue
      @JvmName("setStructValue")
      set(value) {
        _builder.structValue = value
      }
    /**
     * `.google.protobuf.Struct struct_value = 5 [json_name = "structValue"];`
     */
    public fun clearStructValue() {
      _builder.clearStructValue()
    }
    /**
     * `.google.protobuf.Struct struct_value = 5 [json_name = "structValue"];`
     * @return Whether the structValue field is set.
     */
    public fun hasStructValue(): kotlin.Boolean {
      return _builder.hasStructValue()
    }

    /**
     * `.google.protobuf.ListValue list_value = 6 [json_name = "listValue"];`
     */
    public var listValue: com.google.protobuf.ListValue
      @JvmName("getListValue")
      get() = _builder.listValue
      @JvmName("setListValue")
      set(value) {
        _builder.listValue = value
      }
    /**
     * `.google.protobuf.ListValue list_value = 6 [json_name = "listValue"];`
     */
    public fun clearListValue() {
      _builder.clearListValue()
    }
    /**
     * `.google.protobuf.ListValue list_value = 6 [json_name = "listValue"];`
     * @return Whether the listValue field is set.
     */
    public fun hasListValue(): kotlin.Boolean {
      return _builder.hasListValue()
    }
    public val kindCase: com.google.protobuf.Value.KindCase
      @JvmName("getKindCase")
      get() = _builder.kindCase

    public fun clearKind() {
      _builder.clearKind()
    }
  }
}
public inline fun com.google.protobuf.Value.copy(block: `com.google.protobuf`.ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Value =
  `com.google.protobuf`.ValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.google.protobuf.ValueOrBuilder.structValueOrNull: com.google.protobuf.Struct?
  get() = if (hasStructValue()) getStructValue() else null

public val com.google.protobuf.ValueOrBuilder.listValueOrNull: com.google.protobuf.ListValue?
  get() = if (hasListValue()) getListValue() else null

