package practice.hw
 //enum (enumeration) is a special class in Kotlin used to define a fixed set of constant values.

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main() {
    val today = Day.SUNDAY
    val today1 = Day.MONDAY
    println(today)  // Output: SUNDAY
    println(today1)
}

