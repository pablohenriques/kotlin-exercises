package controlFlow

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Ex02Test : ShouldSpec({

    should("number is divisible by 7") {
        checkDivisionBy7(14).shouldBe(true)
    }

    should("number is not divisible by 7") {
        checkDivisionBy7(17).shouldBe(false)
    }
})
