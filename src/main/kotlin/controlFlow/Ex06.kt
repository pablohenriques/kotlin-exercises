package controlFlow

// Write a Kotlin program to print the Fibonacci series up to a given number

fun fibonacciSeries(numberElements: Int): MutableList<Int> {
    val listElements = mutableListOf<Int>()
    var prev = 0
    var seq = 1

    listElements.add(prev)
    listElements.add(seq)

    repeat(numberElements - 1) {
        val next = prev + seq
        listElements.add(next)
        prev = seq
        seq = next
    }
    return listElements
}
