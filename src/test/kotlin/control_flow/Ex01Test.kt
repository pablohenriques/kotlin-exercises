package control_flow

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Ex01Test : ShouldSpec({
    should("should be positive") {
        checkNumber(1).shouldBe("positive")
    }

    should("should be negative") {
        checkNumber(-1) shouldBe "negative"
    }

    should("should be zero") {
        checkNumber(0) shouldBe "zero"
    }
})
