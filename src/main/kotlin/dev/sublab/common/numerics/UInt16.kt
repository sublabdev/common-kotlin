package dev.sublab.common.numerics

/**
 * Converts UInt16 (UShort) to ByteArray
 */
fun UInt16.toByteArray() = byteRangeForNumeric(UInt16::class)
    .map { toUInt() shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts ByteArray to UShort
 */
fun ByteArray.toUShort() = foldIndexed(0U) { i, result, byte ->
    result or (byte.toUByte().toUInt() shl 8 * i)
}.toUShort()

/**
 * Converts ByteArray to UInt16 (UShort)
 */
@Suppress("unused")
fun ByteArray.toUInt16() = toUShort()