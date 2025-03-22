package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex01Test {

    @Test
    fun testHelloWorld() {
        val result = helloWorld()
        val expected = "Hello World!"
        assertEquals(expected, result)
    }
}
