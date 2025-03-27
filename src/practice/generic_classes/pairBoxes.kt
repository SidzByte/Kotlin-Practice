package practice.generic_classes

// Generic class with two datatypes
class PairBox<T, U>(val first: T, val second: U)  //we can use T,U or DataType or anything
                                                  //can restrict it using Number as an upper bound = <T: Number>

fun main() {
    val pair1 = PairBox("Age", 25)  // String and Int
    val pair2 = PairBox(10, 10.5)   // Int and Double

    println("${pair1.first} = ${pair1.second}") // Output: Age = 25
    println("${pair2.first} + ${pair2.second}") // Output: 10 + 10.5
}
