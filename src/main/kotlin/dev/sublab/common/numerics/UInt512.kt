package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class UInt512(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 64
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
}

@Suppress("unused")
fun ByteArray.toUInt512() = UInt512(BigInteger(1, reversedArray()))
fun UInt512.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt512::class))