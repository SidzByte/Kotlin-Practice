package practice.higherOrderFunction

fun main () {
    val numbers = listOf(1, 2, 3, 4, 5)

// Applying a lambda function to double each number
    val doubled = numbers.map { it * 2 }

    println(doubled)  // Output: [2, 4, 6, 8, 10]
}

//Use Lambdas with Higher-Order Functions?
//✅ More Readable & Concise – No need to define separate functions.
//✅ Reusable Code – Write functions that accept different operations.
//✅ Useful for Functional Programming – Works well with list operations (map(), filter(), reduce()).