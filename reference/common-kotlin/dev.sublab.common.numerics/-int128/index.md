//[common-kotlin](../../../index.md)/[dev.sublab.common.numerics](../index.md)/[Int128](index.md)

# Int128

[jvm]\
public final class [Int128](index.md)

[Int128](index.md) wrapper over [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)

## Constructors

| | |
|---|---|
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)stringValue) |
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([Byte](https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html)int8Value) |
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([Short](https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html)int16Value) |
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)int32Value) |
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html)int64Value) |
| [Int128](-int128.md) | [jvm]<br>public [Int128](index.md)[Int128](-int128.md)([BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)value) |

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
| [value](index.md#-609129531%2FProperties%2F-1216412040) | [jvm]<br>private final [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)[value](index.md#-609129531%2FProperties%2F-1216412040)<br>[BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) value to be wrapped |

## Extensions

| Name | Summary |
|---|---|
| [toByteArray](index.md#-1430143415%2FExtensions%2F-1216412040) | [jvm]<br>public final [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)[toByteArray](index.md#-1430143415%2FExtensions%2F-1216412040)()<br>Converts [Int128](index.md) to [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [toInt256](index.md#-1166010924%2FExtensions%2F-1216412040) | [jvm]<br>public final [Int256](../-int256/index.md)[toInt256](index.md#-1166010924%2FExtensions%2F-1216412040)()<br>Converts [Int128](index.md) to [Int256](../-int256/index.md) |
| [toInt512](index.md#-1896180009%2FExtensions%2F-1216412040) | [jvm]<br>public final [Int512](../-int512/index.md)[toInt512](index.md#-1896180009%2FExtensions%2F-1216412040)()<br>Converts [Int128](index.md) to [Int512](../-int512/index.md) |
