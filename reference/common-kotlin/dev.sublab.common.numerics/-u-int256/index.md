//[common-kotlin](../../../index.md)/[dev.sublab.common.numerics](../index.md)/[UInt256](index.md)

# UInt256

[jvm]\
public final class [UInt256](index.md)

[UInt256](index.md) wrapper over [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)

## Constructors

| | |
|---|---|
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)stringValue) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([UByte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-byte/index.html)uint8Value) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html)uint16Value) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)uint32Value) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([ULong](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-long/index.html)uint64Value) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([UInt128](../-u-int128/index.md)uint128Value) |
| [UInt256](-u-int256.md) | [jvm]<br>public [UInt256](index.md)[UInt256](-u-int256.md)([BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)value) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>public class [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getValue](get-value.md) | [jvm]<br>public final [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)[getValue](get-value.md)()<br>[BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) value to be wrapped |

## Properties

| Name | Summary |
|---|---|
| [value](index.md#-1602267056%2FProperties%2F-1216412040) | [jvm]<br>private final [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)[value](index.md#-1602267056%2FProperties%2F-1216412040)<br>[BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) value to be wrapped |

## Extensions

| Name | Summary |
|---|---|
| [toByteArray](index.md#363292404%2FExtensions%2F-1216412040) | [jvm]<br>public final [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)[toByteArray](index.md#363292404%2FExtensions%2F-1216412040)()<br>Converts [UInt256](index.md) to [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [toUInt512](index.md#1767629225%2FExtensions%2F-1216412040) | [jvm]<br>public final [UInt512](../-u-int512/index.md)[toUInt512](index.md#1767629225%2FExtensions%2F-1216412040)()<br>Converts [UInt256](index.md) to [UInt512](../-u-int512/index.md) |