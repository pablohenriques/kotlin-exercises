package controlFlow

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex09Test: FunSpec ({

    test("should return a map string int") {
        val result = findEvenOddNumbers(5)
        val expected = mapOf("odd" to 3, "even" to 3)
        assertEquals(expected, result)
    }
})