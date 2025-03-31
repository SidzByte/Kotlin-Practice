package practice.lambdas

//A lambda expression is an anonymous function (a function without a name) that you can store in a variable or pass as an argument to other functions.
//Basic Lambda Syntax
//fun main () {
//    val add = { a: Int, b: Int -> a + b }
//    println(add(5, 3))  // Output: 8
//}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)  // Call lambda inside function
}

fun main() {
    val sum = calculate(4, 5) { x, y -> x + y }
    println(sum)  // Output: 9
}
