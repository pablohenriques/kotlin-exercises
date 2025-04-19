package controlFlow

// Write a Kotlin program to print the Pascal's triangle of a given number of rows

private fun factorial(number: Int): Int {
    var result = 1
    for (n in number downTo 1 step 1) {
        result *= n
    }
    return result
}

private fun binominalCoefficientFormula(n: Int, k: Int): Int {
    return factorial(n) / (factorial(k) * factorial(n - k))
}

fun createPascalsTriangle(rows: Int): MutableList<MutableList<Int>> {
//    require(rows > 0) { "Number must be greater than 0" }
    val result: MutableList<MutableList<Int>> = mutableListOf()
    val lines = 0..rows

    for (nLine in lines) {
        val tempList: MutableList<Int> = mutableListOf<Int>()
        val positions = 0..nLine

        for (kPosition in positions) {
            val calculation = binominalCoefficientFormula(nLine, kPosition)
            tempList.add(calculation)
            print("\t$calculation\t")
        }
        result.add(tempList)
        println()
    }
    return result
}
