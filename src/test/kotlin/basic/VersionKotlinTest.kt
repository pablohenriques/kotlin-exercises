package basic

import kotlin.test.Test
import kotlin.test.assertEquals

class VersionKotlinTest {

    @Test
    fun testGetVersionKotlin() {
        val result = getVersionKotlin()
        val expected = "2.1.0"
        assertEquals(result::class, String::class)
        assertEquals(result, expected)
    }
}