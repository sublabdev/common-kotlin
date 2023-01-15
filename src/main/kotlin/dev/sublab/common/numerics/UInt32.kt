package dev.sublab.common.numerics

/**
 * Converts [UInt32] ([UInt]) to [ByteArray]
 */
fun UInt32.toByteArray() = byteRangeForNumeric(UInt32::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts [ByteArray] to [UInt]
 */
fun ByteArray.toUInt() = foldIndexed(0U) { i, result, byte ->
    result or (byte.toUByte().toUInt() shl 8 * i)
}

/**
 * Converts [ByteArray] to [UInt32] ([UInt])
 */
@Suppress("unused")
fun ByteArray.toUInt32() = toUInt()