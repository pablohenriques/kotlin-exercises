package controlFlow

/* Write a Kotlin program to check if a given character is a vowel or a consonant */

fun checkCharacter(character: String): Boolean {
    val listOfVowels = listOf("a", "e", "i", "o", "u")
    return listOfVowels.contains(character)
}
