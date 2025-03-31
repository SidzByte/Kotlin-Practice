package practice.annotations

@Deprecated("Use newFunction() instead", ReplaceWith("newFunction()"))
fun oldFunction() {
    println("This is old")
}

fun newFunction() {
    println("This is new")
}

fun main() {
    oldFunction() // Shows a warning in IDE
    newFunction()
}

//@Deprecated warns that oldFunction() should not be used.

//IDE suggests using newFunction() instead.