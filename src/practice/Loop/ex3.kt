package practice.Loop

fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    // Write your code here
    for (x in words) {
        if (x.startsWith("l")) // use of "" important
            println(x)
    }
}

//You have a list of words. Use for and if to print only the words that start with the letter l.
//Hint
//Use the .startsWith() function for String type.