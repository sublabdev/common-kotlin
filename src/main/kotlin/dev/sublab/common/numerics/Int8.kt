package dev.sublab.common.numerics

/**
 * Converts an [Int8] ([Byte]) to [ByteArray]
 */
fun Int8.toByteArray() = byteArrayOf(this)

/**
 * Converts [ByteArray] to [Byte]
 */
fun ByteArray.toByte() = first()

/**
 * Converts [ByteArray] to [Int8] ([Byte])
 */
fun ByteArray.toInt8() = toByte()
