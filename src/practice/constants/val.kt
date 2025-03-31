package practice.constants


const val PI2 = 3.14159

fun getDiscount(): Int {
    return 10  // Function returning a value

}

fun main() {
    println("Type Username:")
    val discount = getDiscount()   //function, unserinput
    val userName = readLine()

    println(PI2)

    println("Hello, $userName! You get a $discount% discount.")
}
