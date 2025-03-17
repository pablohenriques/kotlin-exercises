package basic

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class CurrentDateTest {

    @Test
    fun testCurrentDate() {
        val result = currentDate()
        val expected = LocalDate.now()
        assertEquals(expected, result)
    }
}