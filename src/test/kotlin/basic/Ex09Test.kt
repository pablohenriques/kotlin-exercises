package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex09Test {

    @Test
    fun testTrueLeapYear() {
        val result = checkLeapYear(2004)
        val expected = true
        assertEquals(expected, result)
    }

    @Test
    fun testFalseLeapYear() {
        val result = checkLeapYear(1998)
        val expected = false
        assertEquals(expected, result)
    }
}
