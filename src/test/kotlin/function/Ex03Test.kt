package function

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex03Test : FunSpec({
    test("should return an integer number") {
        val actual = countVowels("Hello World!")
        val expected = 3
        assertEquals(expected, actual)
    }
})