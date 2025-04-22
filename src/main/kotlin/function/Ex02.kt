package function

/**
 * Write a Kotlin function that takes an array of integers and prints only even numbers.
 * */

fun onlyEvenNumbers(listNumber: IntRange): List<Int> {
    val evenNumberList = mutableListOf<Int>()
    for (number in listNumber) {
        if (number%2==0) {
            evenNumberList.add(number)
        }

    }
    return evenNumberList
}