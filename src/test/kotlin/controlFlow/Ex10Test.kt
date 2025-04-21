package controlFlow

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex10Test: FunSpec({
    test("should return an interger number 12") {
        val result = gdc(84, 60)
        val expected = 12
        assertEquals(expected, result)
    }

    test("should return an interger number 6") {
        val result = gdc(18, 12)
        val expected = 6
        assertEquals(expected, result)
    }

    test("should return an interger number 1") {
        val result = gdc(11, 7)
        val expected = 1
        assertEquals(expected, result)
    }

    test("should return an interger number 5") {
        val result = gdc(40, 25)
        val expected = 5
        assertEquals(expected, result)
    }
})
