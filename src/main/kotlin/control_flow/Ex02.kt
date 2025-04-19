package control_flow

/* Write a Kotlin program to check if a given number is divisible by 7 */

fun checkDivisionBy7(number: Int): Boolean {
    val division = number % 7
    return division == 0
}
