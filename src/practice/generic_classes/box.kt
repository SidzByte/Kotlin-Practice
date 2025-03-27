package practice.generic_classes

//Basic Example of a Generic Class
// Generic Class
class Box<T>(val item: T) {    //we can use T or DataType or anything
    fun getItem(): T {
        return item
    }
}

fun main() {
    val intBox = Box(10)     // T is Int
    val stringBox = Box("Hi") // T is String

    println(intBox.getItem())    // Output: 10
    println(stringBox.getItem()) // Output: Hi
}
