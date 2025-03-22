package basic

/* Write a Kotlin program to find the maximum and minimum of three numbers  */

fun maxAndMinNumber(vararg numbers: Int): Map<String, Int> {
    val maxNumber = numbers.max()
    val minNumber = numbers.min()
    return mapOf("max" to maxNumber, "min" to minNumber)
}
