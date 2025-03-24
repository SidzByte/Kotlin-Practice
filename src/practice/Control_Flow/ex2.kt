package practice.Control_Flow

fun main() {
    val button = "A"

    println(
        // Write your code here
        when (button){
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

//Using a when expression, update the following program so that it prints the
// corresponding actions when you input the names of game console buttons.
//Button - A, B, X, Y, Other
//Action - Yes, No, Menu, Nothing, There is no such button