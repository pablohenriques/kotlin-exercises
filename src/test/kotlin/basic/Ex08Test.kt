package basic

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Ex08Test {

    @Test
    fun testFactorialAsync() = runTest {
        val result = factorial(5)
        val expected = 120
        assertEquals(expected, result)
    }
}
