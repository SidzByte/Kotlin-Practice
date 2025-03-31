package practice.labels
//A labeled break in Kotlin allows you to exit from a specific loop or block, not just the innermost one
fun main() {
    loop@ while (true) {
        for (num in 1..5) {
            println("num = $num")
            if (num == 3) break@loop  // Exits while-loop
        }
    }

    println("while loop exited successfully!")
}