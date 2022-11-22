package dev.sublab.hex

class StringHex(private val string: String) {
    fun decode(): ByteArray {
        var value = string
        if (value.startsWith("0x")) value = value.substring(2)

        check(value.length % 2 == 0) { "Must have an even length" }

        return value.chunked(2)
            .map { it.toInt(16).toByte() }
            .toByteArray()
    }
}

val String.hex
    get() = StringHex(this)