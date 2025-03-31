package practice.higherOrderFunction

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)  // Calls the lambda
}

fun main() {
    val sum = operateOnNumbers(4, 5) { x, y -> x + y }
    println(sum)  // Output: 9

    val multiply = operateOnNumbers(4, 5) { x, y -> x * y }
    println(multiply)  // Output: 20
}
