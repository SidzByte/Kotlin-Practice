package practice.labels
//A labeled break in Kotlin allows you to exit from a specific loop or block, not just the innermost one
fun main() {
    listOf(1, 2, 3, 4, 5).forEach loop@{
        if (it == 3) return@loop  // Skips only this iteration
        println(it)
    }

    println("forEach exited successfully!")
}