package practice.extension_fun

// Extension function for String
fun String.reverseUppercase(): String {
    return this.reversed().uppercase()
}

fun main() {
    val text = "hello"
    println(text.reverseUppercase()) // Output: OLLEH
}
