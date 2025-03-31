package practice.annotations

//// Define a custom annotation
//annotation class Info(val author: String, val version: Int)
//
//// Apply the annotation to a class
//@Info(author = "John Doe", version = 1) //@Info stores metadata about MyClass.
////It does not affect execution, but tools can read it.
//class MyClass {
//    fun display() {
//        println("This is a class with annotations")
//    }
//}
//
//fun main() {
//    val obj = MyClass()
//    obj.display()
//}

//@Deprecated("Use newFunction() instead", ReplaceWith("newFunction()"))
//fun oldFunction() {
//    println("This is old")
//}
//
//fun newFunction() {
//    println("This is new")
//}
//
//fun main() {
//    oldFunction() // Shows a warning in IDE
//    newFunction()
//}
