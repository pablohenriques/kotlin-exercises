package control_flow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Ex04Test:FunSpec({
    test("Should return a list of numbers 1 to 10") {
        val result = firstTen()
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        result shouldBe expected
    }
})