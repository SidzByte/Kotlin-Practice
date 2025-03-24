package practice.Loop

//You have a program that counts pizza slices until there’s a whole pizza with 8 slices.
// Refactor this program in two ways:

//Use a while loop.

//fun main() {
//    var pizzaSlices = 0
//
//    while(pizzaSlices < 7){
//        println("There's only $pizzaSlices slice/s of pizza :(")
//        pizzaSlices++
//    }
//
//    pizzaSlices++
//    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
//}

//Use a do-while loop.
fun main() {
    var pizzaSlices = 1

    do{
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }

    while(pizzaSlices<8)    //while ke sath {} not required
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

}