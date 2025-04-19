package controlFlow

// Write a Kotlin program to print the first 10 natural numbers

fun firstTen(): MutableList<Int> {
    val list: MutableList<Int> = mutableListOf()
    for (number in 1..10 step 1) {
        list.add(number)
    }
    return list
}
