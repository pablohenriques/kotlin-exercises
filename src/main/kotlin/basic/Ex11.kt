package basic

fun degreeCalculation(degrees: Double, option: String): Double {
    val result = when (option) {
        "celsius" -> ((degrees - 32) * 5 / 9)
        "fahrenheit" -> (degrees * 9 / 5 + 32)
        else -> 0.0
    }

    return result
}
