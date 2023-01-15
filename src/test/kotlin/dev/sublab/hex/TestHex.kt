/**
 *
 * Copyright 2023 SUBSTRATE LABORATORY LLC <info@sublab.dev>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

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