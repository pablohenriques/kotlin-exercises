package basic

/* Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers. */

fun operation(firstNumber: Int, secondNumber: Int, type: String): Int {
    val result = when (type) {
        "sum" -> firstNumber + secondNumber
        "sub" -> firstNumber - secondNumber
        "mul" -> firstNumber * secondNumber
        "div" -> firstNumber / secondNumber
        else -> 0
    }
    return result
}