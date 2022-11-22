package dev.sublab.hex

import dev.sublab.support.Constants
import java.util.UUID
import kotlin.test.Test
import kotlin.test.assertContentEquals

class TestHex {
    private val testValues = (0 until Constants.testsCount).map { UUID.randomUUID().toString() }

    @Test
    internal fun test() {
        for (value in testValues) {
            val valueByteArray = value.toByteArray()

            val encoded = valueByteArray.hex.encode()
            val decoded = encoded.hex.decode()

            assertContentEquals(valueByteArray, decoded)
        }
    }
}