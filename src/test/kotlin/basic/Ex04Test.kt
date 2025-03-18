package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex04Test {

    @Test
    fun testGetAndShowMessage() {
        val result = getAndShowMessage("Mock")
        val expected = "Hello Mock"
        assertEquals(expected, result)
    }
}