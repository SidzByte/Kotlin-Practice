package practice.generic_fun

fun <T, U> printPair(first: T, second: U) {
    println("First: $first, Second: $second")
}

fun main() {
    printPair(10, "Kotlin")  // First: 10, Second: Kotlin
    printPair(3.14, true)    // First: 3.14, Second: true
}
