package controlFlow

/**
 * Write a Kotlin program to find the GCD (Greatest Common Divisor) of two numbers
 * */

fun gdc(left: Int, right: Int): Int {
    val remainder = left % right

    if ( remainder == 0) {
        return right
    }

    return gdc(right, remainder)
}
