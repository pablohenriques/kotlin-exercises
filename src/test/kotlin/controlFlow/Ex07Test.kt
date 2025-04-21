package controlFlow

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex07Test : FunSpec({

    test("should a int number") {
        val result = sumOfRange(1,5)
        val expected = 15
        assertEquals(expected, result)
    }

})