package controlFlow

/**
 * Write a Kotlin program to count the number of even and odd elements in an array
 * */

fun findEvenOddNumbers(numberElements: Int): Map<String, Int> {
    val elements = 0..numberElements
    var evenNumber = 0
    var oddNumber = 0

    for (element in elements) {
        val checkNumber = element % 2 == 0
        if (checkNumber) {
            evenNumber += 1
        } else {
            oddNumber += 1
        }
    }
    return mapOf("even" to evenNumber, "odd" to oddNumber)
}