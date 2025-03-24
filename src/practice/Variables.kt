package practice

//String templates ($) is also used

fun main(){
    val name = "Ishan Dixit"
    var age = 21
    println("My friend name is $name & his age is $age")

    age = 60
    //name = Akash      error due to name changed
    println("My friend $name is no young he is now aged, as his age is $age")
}
