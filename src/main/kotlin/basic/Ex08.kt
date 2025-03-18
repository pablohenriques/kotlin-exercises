package basic

/* Write a Kotlin program to find the factorial of a given number. */

fun factorial(number: Int): Int {
    var result = 1
    for (n in number downTo 1 step 1) {
        result *= n
    }
    return result
}

