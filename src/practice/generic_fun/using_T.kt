package practice.generic_fun

fun <T> printData(data: T) { // T is a generic type
    println("Data: $data")
}

fun main() {
    printData(10)       // ✅ Int
    printData("Hello")  // ✅ String
    printData(3.14)     // ✅ Double
}
