package basic

/* Write a Kotlin program to check if a given number is even or odd. */

fun checkNumbers(number: Int): String {
    val division = number%2

    val result = if (division == 0) {
        "even number"
    } else {
        "odd number"
    }

    return result
}