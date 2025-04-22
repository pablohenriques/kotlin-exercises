package function

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex02Test : FunSpec({
    test("should return a list of even numbers") {
        val list = 0..10
        val actual = onlyEvenNumbers(list)
        val expected = 0.until(11).step(2).toList()
        assertEquals(expected, actual)
    }
})