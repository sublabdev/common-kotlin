package dev.sublab.hex

class ByteArrayHex(private val byteArray: ByteArray) {
    /**
     * Encodes [ByteArray] into hex [String]
     * @param includePrefix [Bool] value indicating whether the prefix should be included in the returned hex String
     * @return A hex-encoded [String] either with a prefix or without
     */
    fun encode(includePrefix: Boolean = false): String {
        val encoded = byteArray.joinToString(separator = "") { "%02x".format(it) }
        val prefix = if (includePrefix) "0x" else ""
        return prefix+encoded
    }
}

/**
 * [ByteArray] to hex-encoded [String] converter
 */
val ByteArray.hex
    get() = ByteArrayHex(this)