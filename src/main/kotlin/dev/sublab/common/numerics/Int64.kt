package dev.sublab.common.numerics

/**
 * Converts Int64 (Long) to ByteArray
 */
fun Int64.toByteArray() = byteRangeForNumeric(Int64::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts ByteArray to Long
 */
fun ByteArray.toLong() = foldIndexed(0L) { i, result, byte ->
    result or (byte.toUByte().toLong() shl 8 * i)
}

/**
 * Converts ByteArray to Int64 (Long)
 */
@Suppress("unused")
fun ByteArray.toInt64() = toLong()