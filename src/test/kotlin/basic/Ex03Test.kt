package basic

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class Ex03Test {

    @Test
    fun testCurrentDate() {
        val result = currentDate()
        val expected = LocalDate.now()
        assertEquals(expected, result)
    }
}