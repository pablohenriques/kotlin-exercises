package control_flow

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Ex03Test: DescribeSpec({
    describe("checking type of character") {

        it("it is a vowel") {
            checkCharacter("a").shouldBe(true)
        }

        it("it is consonant") {
            checkCharacter("b").shouldBe(false)
        }
    }
})