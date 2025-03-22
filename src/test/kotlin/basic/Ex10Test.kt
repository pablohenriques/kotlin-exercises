package basic

import kotlin.math.round
import kotlin.test.Test
import kotlin.test.assertEquals

class Ex10Test {

    @Test
    fun testGetPerimeter() {
        val result = round(getPerimeter(10)) /* approximate result: 62.83 */
        val expected = 63.0
        assertEquals(expected, result)
    }
}
