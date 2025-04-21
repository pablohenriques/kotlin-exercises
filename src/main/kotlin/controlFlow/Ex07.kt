package controlFlow

/**
    Write a Kotlin program to calculate the sum of all numbers between two given numbers
 */

fun sumOfRange(initial: Int, end: Int):Int {
    val numbers = initial..end
    return numbers.sum()
}