package practice.extension_fun

class Car(val name: String, val speed: Int)  // No {} because it's a simple class

// Extension function for Car class
fun Car.details(): String {
    return "Car Name: $name, Speed: $speed km/h"
}

fun main() {
    val myCar = Car("Tesla", 200)
    println(myCar.details()) // Output: Car Name: Tesla, Speed: 200 km/h
}
