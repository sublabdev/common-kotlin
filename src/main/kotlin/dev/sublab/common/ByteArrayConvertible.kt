package dev.sublab.common

/**
 * An interface for converting object to ByteArray
 */
interface ByteArrayConvertible {
    /**
     * Converts object to ByteArray
     */
    fun toByteArray(): ByteArray
}

/**
 * Converts String to ByteArray
 */
@Suppress("unused")
fun String.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible.toByteArray()
}

@Suppress("unused")
fun ByteArray.asByteArrayConvertible() = object : ByteArrayConvertible {
    override fun toByteArray() = this@asByteArrayConvertible
}

abstract class FromByteArray(byteArray: ByteArray): ByteArrayConvertible