package controlFlow

import io.kotest.core.spec.style.FunSpec
import kotlin.math.pow
import kotlin.test.assertEquals

class Ex05Test : FunSpec({

    test("should execute the function") {
        val result = createPascalsTriangle(4)
        for (index in 0 until result.size) {
            val sumNumbers = result[index].sum()
            val baseTwo = 2.0.pow(index).toInt()
            assertEquals(sumNumbers, baseTwo)
        }
    }
})
