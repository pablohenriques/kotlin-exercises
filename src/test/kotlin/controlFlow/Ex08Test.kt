package controlFlow

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex08Test: FunSpec({

    test("should return a list of multuplication") {
        val result = multiplicationTable(2)
        val expected = mutableListOf(0, 2, 4, 6, 8 , 10, 12, 14, 16, 18, 20)
        assertEquals(result, expected)
    }

})