// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/descriptor.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializeenumDescriptorProto")
public inline fun enumDescriptorProto(block: com.google.protobuf.EnumDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.EnumDescriptorProto =
  com.google.protobuf.EnumDescriptorProtoKt.Dsl._create(com.google.protobuf.DescriptorProtos.EnumDescriptorProto.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.EnumDescriptorProto`
 */
public object EnumDescriptorProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.DescriptorProtos.EnumDescriptorProto = _builder.build()

    /**
     * `optional string name = 1 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `optional string name = 1 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * `optional string name = 1 [json_name = "name"];`
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValueProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     */
     public val value: com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.valueList
      )
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     * @param value The value to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValue")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.add(value: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto) {
      _builder.addValue(value)
    }
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     * @param value The value to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValue")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.plusAssign(value: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto) {
      add(value)
    }
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     * @param values The value to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValue")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto>) {
      _builder.addAllValue(values)
    }
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     * @param values The value to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValue")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto>) {
      addAll(values)
    }
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     * @param index The index to set the value at.
     * @param value The value to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValue")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.set(index: kotlin.Int, value: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto) {
      _builder.setValue(index, value)
    }
    /**
     * `repeated .google.protobuf.EnumValueDescriptorProto value = 2 [json_name = "value"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValue")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto, ValueProxy>.clear() {
      _builder.clearValue()
    }

    /**
     * `optional .google.protobuf.EnumOptions options = 3 [json_name = "options"];`
     */
    public var options: com.google.protobuf.DescriptorProtos.EnumOptions
      @JvmName("getOptions")
      get() = _builder.options
      @JvmName("setOptions")
      set(value) {
        _builder.options = value
      }
    /**
     * `optional .google.protobuf.EnumOptions options = 3 [json_name = "options"];`
     */
    public fun clearOptions() {
      _builder.clearOptions()
    }
    /**
     * `optional .google.protobuf.EnumOptions options = 3 [json_name = "options"];`
     * @return Whether the options field is set.
     */
    public fun hasOptions(): kotlin.Boolean {
      return _builder.hasOptions()
    }
    public val EnumDescriptorProtoKt.Dsl.optionsOrNull: com.google.protobuf.DescriptorProtos.EnumOptions?
      get() = _builder.optionsOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ReservedRangeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     */
     public val reservedRange: com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.reservedRangeList
      )
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     * @param value The reservedRange to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addReservedRange")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.add(value: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange) {
      _builder.addReservedRange(value)
    }
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     * @param value The reservedRange to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignReservedRange")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.plusAssign(value: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange) {
      add(value)
    }
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     * @param values The reservedRange to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllReservedRange")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange>) {
      _builder.addAllReservedRange(values)
    }
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     * @param values The reservedRange to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllReservedRange")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange>) {
      addAll(values)
    }
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     * @param index The index to set the value at.
     * @param value The reservedRange to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setReservedRange")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.set(index: kotlin.Int, value: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange) {
      _builder.setReservedRange(index, value)
    }
    /**
     * `repeated .google.protobuf.EnumDescriptorProto.EnumReservedRange reserved_range = 4 [json_name = "reservedRange"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearReservedRange")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange, ReservedRangeProxy>.clear() {
      _builder.clearReservedRange()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ReservedNameProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @return A list containing the reservedName.
     */
    public val reservedName: com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.reservedNameList
      )
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @param value The reservedName to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addReservedName")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.add(value: kotlin.String) {
      _builder.addReservedName(value)
    }
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @param value The reservedName to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignReservedName")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @param values The reservedName to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllReservedName")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllReservedName(values)
    }
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @param values The reservedName to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllReservedName")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     * @param index The index to set the value at.
     * @param value The reservedName to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setReservedName")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setReservedName(index, value)
    }/**
     * `repeated string reserved_name = 5 [json_name = "reservedName"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearReservedName")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ReservedNameProxy>.clear() {
      _builder.clearReservedName()
    }}
  @kotlin.jvm.JvmName("-initializeenumReservedRange")
  public inline fun enumReservedRange(block: com.google.protobuf.EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange =
    com.google.protobuf.EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl._create(com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `google.protobuf.EnumDescriptorProto.EnumReservedRange`
   */
  public object EnumReservedRangeKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange = _builder.build()

      /**
       * <code>optional int32 start = 1 [json_name = "start"];</code>
       */
      public var start: kotlin.Int
        @JvmName("getStart")
        get() = _builder.start
        @JvmName("setStart")
        set(value) {
          _builder.start = value
        }
      /**
       * `optional int32 start = 1 [json_name = "start"];`
       */
      public fun clearStart() {
        _builder.clearStart()
      }
      /**
       * `optional int32 start = 1 [json_name = "start"];`
       * @return Whether the start field is set.
       */
      public fun hasStart(): kotlin.Boolean {
        return _builder.hasStart()
      }

      /**
       * <code>optional int32 end = 2 [json_name = "end"];</code>
       */
      public var end: kotlin.Int
        @JvmName("getEnd")
        get() = _builder.end
        @JvmName("setEnd")
        set(value) {
          _builder.end = value
        }
      /**
       * `optional int32 end = 2 [json_name = "end"];`
       */
      public fun clearEnd() {
        _builder.clearEnd()
      }
      /**
       * `optional int32 end = 2 [json_name = "end"];`
       * @return Whether the end field is set.
       */
      public fun hasEnd(): kotlin.Boolean {
        return _builder.hasEnd()
      }
    }
  }
}
public inline fun com.google.protobuf.DescriptorProtos.EnumDescriptorProto.copy(block: `com.google.protobuf`.EnumDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.EnumDescriptorProto =
  `com.google.protobuf`.EnumDescriptorProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public inline fun com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.copy(block: `com.google.protobuf`.EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange =
  `com.google.protobuf`.EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder.optionsOrNull: com.google.protobuf.DescriptorProtos.EnumOptions?
  get() = if (hasOptions()) getOptions() else null

