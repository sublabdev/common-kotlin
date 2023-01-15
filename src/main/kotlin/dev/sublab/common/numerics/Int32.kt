package dev.sublab.common.numerics

/**
 * Converts [Int32] ([Int]) to [ByteArray]
 */
fun Int32.toByteArray() = byteRangeForNumeric(Int32::class)
    .map { this shr it }
    .map { it.toByte() }
    .toByteArray()

/**
 * Converts [ByteArray] to [Int]
 */
fun ByteArray.toInt() = foldIndexed(0) { i, result, byte ->
    result or (byte.toUByte().toInt() shl 8 * i)
}

/**
 * Converts [ByteArray] to [Int32] ([Int])
 */
@Suppress("unused")
fun ByteArray.toInt32() = toInt()