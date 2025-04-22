package function

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class Ex01Test : FunSpec({
    test("should return a string") {
        val actual = message("mock")
        val expected = "Hello Human mock! I'm AI!"
        assertEquals(expected, actual)
    }
})

