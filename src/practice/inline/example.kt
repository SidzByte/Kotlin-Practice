package practice.inline

//fun normalFunction(action: () -> Unit) {
//    println("Before Lambda")
//    action()  // Calls lambda separately
//    println("After Lambda") }
//fun main() {
//    normalFunction { println("Inside Lambda") }
//}

//🚨 Issue: Creating a lambda adds an extra function call overhead.

inline fun inlineFunction(action: () -> Unit) {
    println("Before Lambda")
    action()  // No separate function call, code is copied here
    println("After Lambda")
}

fun main() {
    inlineFunction { println("Inside Lambda") }
}

//When to Use inline? = avoid object creation,  improve performance in hof, Useful in performance-critical code (e.g., loops, callbacks)

//When NOT to Use inline?
//❌ Large functions – It increases code size (inlining makes copies everywhere it's used).
//❌ Functions that are rarely used – Regular calls are fine in such cases.