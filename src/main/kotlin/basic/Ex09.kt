package basic

/* Write a Kotlin program to check if a given year is a leap year */

fun checkLeapYear(year: Int): Boolean {

    val division4 = year % 4
    val division100 = year%100
    val division400 = year%400
    var leapYear = false

    if (division4 == 0) {
        if (division100 != 0) {
            leapYear = true
        } else if (division400==0) {
            leapYear = true
        }
    }
    else {
        leapYear = false
    }

    return leapYear
}
 