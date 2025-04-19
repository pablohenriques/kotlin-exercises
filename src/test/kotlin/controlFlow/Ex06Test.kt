package controlFlow

import io.kotest.core.spec.style.FunSpec
import utils.recursiveFibonacciAI
import kotlin.test.assertEquals

class Ex06Test : FunSpec({

    test("should return a fibonacci sequence") {
        val elements = 3
        val elementsFibonacci = 0..elements
        val listFibonacci = mutableListOf<Int>()

        elementsFibonacci.forEach { it ->
            listFibonacci.add(recursiveFibonacciAI(it))
        }

        val result = fibonacciSeries(elements)

        assertEquals(result, listFibonacci)
    }
})
