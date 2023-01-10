package dev.sublab.common.numerics

/**
 * Converts UInt64 (ULong) to ByteArray
 */
fun UInt64.toByteArray() = byteRangeForNumeric(UInt64::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts ByteArray to ULong
 */
fun ByteArray.toULong() = foldIndexed(0UL) { i, result, byte ->
    result or (byte.toUByte().toULong() shl 8 * i)
}

/**
 * Converts ByteArray to UInt64 (ULong)
 */
@Suppress("unused")
fun ByteArray.toUInt64() = toULong()