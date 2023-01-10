package dev.sublab.common.numerics

/**
 * Converts Int16 (Short) to ByteArray
 */
fun Int16.toByteArray() = byteRangeForNumeric(Int16::class)
    .map { toInt() shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts ByteArray to Short
 */
fun ByteArray.toShort() = foldIndexed(0) { i, result, byte ->
    result or (byte.toUByte().toInt() shl 8 * i)
}.toShort()

/**
 * Converts ByteArray to Int16 (Short)
 */
@Suppress("unused")
fun ByteArray.toInt16() = toShort()