package practice.lambdas


//A lambda can be stored in a variable(val multiply), but Kotlin allows us to specify its function type explicitly((Int, Int) -> Int) for clarity and safet
//actual lambda function= { a, b -> a * b }

fun main() {
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println(multiply(4, 2))  // Output: 8
}