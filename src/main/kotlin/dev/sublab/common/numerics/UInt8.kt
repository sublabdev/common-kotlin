package dev.sublab.common.numerics

/**
 * Converts a UInt8 (UByte) to ByteArray
 */
fun UInt8.toByteArray() = byteArrayOf(toByte())

/**
 * Converts ByteArray to UByte
 */
fun ByteArray.toUByte() = first().toUByte()

/**
 * Converts ByteArray to UInt8 (UByte)
 */
fun ByteArray.toUInt8() = toUByte()
