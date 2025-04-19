package control_flow

/* Write a Kotlin program to check if a given number is positive, negative or zero */

fun checkNumber(number: Int): String {
    val typeNumber = if (number >0) {
        "positive"
    } else if (number < 0) {
        "negative"
    } else {
        "zero"
    }
    return typeNumber
}