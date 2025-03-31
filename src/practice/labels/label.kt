package practice.labels

//A labeled break in Kotlin allows you to exit from a specific loop or block, not just the innermost one
//Normally, break only exits the closest loop:
//

//for (i in 1..3) {
//    for (j in 1..3) {
//        println("i=$i, j=$j")
//        break  // Breaks only the inner loop
//    }
//}

fun main() {
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            println("i=$i, j=$j")
            if (j == 2) break@outer  // Exits the outer loop!
        }
    }
    println("Loop exited successfully!")
}