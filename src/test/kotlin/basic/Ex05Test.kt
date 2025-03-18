package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex05Test {

    @Test
    fun testOperationSum() {
        val result = operation(1, 2, "sum")
        val expected = 3
        assertEquals(expected, result)
    }

    @Test
    fun testOperationSubtraction() {
        val result = operation(5, 3, "sub")
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testOperationMultiplication() {
        val result = operation(3, 3, "mul")
        val expected = 9
        assertEquals(expected, result)
    }

    @Test
    fun testOperationDivision() {
        val result = operation(10, 5, "div")
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testOperationZero() {
        val result = operation(1, 1, "other")
        val expected = 0
        assertEquals(expected, result)
    }

}
