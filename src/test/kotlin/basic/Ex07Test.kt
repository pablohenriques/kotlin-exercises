package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex07Test {

    @Test
    fun testMaxAndMinNumber() {
        val result = maxAndMinNumber(1, 2, 3)
        val expectedMaxNumber = result["max"]
        val expectedMinNumber = result["min"]
        assertEquals(expectedMaxNumber, 3)
        assertEquals(expectedMinNumber, 1)
    }

}
