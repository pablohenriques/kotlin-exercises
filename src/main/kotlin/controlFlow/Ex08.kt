package controlFlow

/**
 * Write a Kotlin program to generate the multiplication table of a given number.
 * */

fun multiplicationTable(number: Int): List<Int> {
    val resultList = mutableListOf<Int>()
    for (index in 0..10) {
        val result = index * number
        resultList.add(result)
//        println("$index x $number = $result")
    }
    return resultList
}