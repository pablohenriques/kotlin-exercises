package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex11Test {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = degreeCalculation(10.0, "fahrenheit")
        val expected = 50.0
        assertEquals(expected, result)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = degreeCalculation(212.0, "celsius")
        val expected = 100.0
        assertEquals(expected, result)
    }

}
