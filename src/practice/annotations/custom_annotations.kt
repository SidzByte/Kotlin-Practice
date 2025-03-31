package practice.annotations

// Define a custom annotation
annotation class Info(val author: String, val version: Int)

// Apply the annotation to a class
@Info(author = "John Doe", version = 1)
class MyClass {
    fun display() {
        println("This is a class with annotations")
    }
}

fun main() {
    val obj = MyClass()
    obj.display()
}
