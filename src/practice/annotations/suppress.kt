package practice.annotations

@Suppress("UNCHECKED_CAST")
fun getList(): List<String> {
    return listOf("Hello") as List<String> // Normally gives a warning, here not getting maybe due to  IDE
}

fun main() {
    println(getList())
}
//@Suppress("UNCHECKED_CAST") stops the unsafe cast warning.

//Useful when we are sure the cast is safe.

//@Suppress("UNCHECKED_CAST") // Suppresses the unchecked cast warning
//fun getList(): List<Any> {
//    return listOf("Hello", 123) // Mixed types
//}
//
//fun main() {
//    val list = getList() as List<String> // Normally gives an unchecked cast warning
//    println(list)
//}