package practice.generic_fun

fun <T : Number> square(value: T): Double {
    return value.toDouble() * value.toDouble()
}

fun main() {
    println(square(5))     // ✅ Works (Int)
    println(square(3.5))   // ✅ Works (Double)
    // println(square("Hello")) ❌ Error: String is not a Number
}
