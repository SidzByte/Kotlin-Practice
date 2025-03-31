package practice.higherOrderFunction

fun main () {
    val numbers = listOf(1, 2, 3, 4, 5)

// Filtering even numbers
    val evens = numbers.filter { it % 2 == 0 }

    println(evens)  // Output: [2, 4]
}