package practice.generic_fun

fun printInt(data: Int) {
    println("Data: $data")
}

fun printString(data: String) {
    println("Data: $data")
}

fun main() {
    printInt(10)        // ✅ Works
    printString("Hello") // ✅ Works
}
