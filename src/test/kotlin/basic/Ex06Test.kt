package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex06Test {

    @Test
    fun testEvenNumber() {
        val result = checkNumbers(2)
        val expected = "even number"
        assertEquals(expected, result)
    }

    @Test
    fun testOddNumber() {
        val result = checkNumbers(1)
        val expected = "odd number"
        assertEquals(expected, result)
    }
}
