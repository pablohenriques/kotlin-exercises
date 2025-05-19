package function

/**
 * Write a Kotlin function `countVowels` that counts the number of vowels in a given string.
 * */

fun countVowels(phrase: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var numberVowels = 0

    for (letter in phrase) {
        if (letter in vowels) {
            numberVowels += 1
        }
    }

    return numberVowels
}