package utils

fun recursiveFibonacciAI(n: Int): Int {
    if (n == 0) {
        return 0
    }

    if (n == 1) {
        return 1
    }

    return recursiveFibonacciAI(n - 1) + recursiveFibonacciAI(n - 2)
}
