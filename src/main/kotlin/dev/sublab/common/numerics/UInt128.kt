package dev.sublab.common.numerics

import java.math.BigInteger

@Suppress("unused")
data class UInt128(val value: BigInteger) {
    companion object {
        const val SIZE_BYTES: Int = 16
    }

    constructor(stringValue: String) : this(BigInteger(stringValue))
    constructor(uint8Value: UInt8) : this(uint8Value.toUInt())
    constructor(uint16Value: UInt16) : this(uint16Value.toUInt())
    constructor(uint32Value: UInt32) : this(BigInteger.valueOf(uint32Value.toLong()))
    constructor(uint64Value: UInt64) : this(BigInteger.valueOf(uint64Value.toLong()))
}

@Suppress("unused")
fun ByteArray.toUInt128() = UInt128(BigInteger(1, reversedArray()))
fun UInt128.toByteArray() = value.toByteArray().reversedArray().copyOf(byteSize(UInt128::class))


@Suppress("unused")
fun UInt8.toUInt128() = UInt512(this)
@Suppress("unused")
fun UInt16.toUInt128() = UInt512(this)
@Suppress("unused")
fun UInt32.toUInt128() = UInt512(this)
@Suppress("unused")
fun UInt64.toUInt128() = UInt512(this)