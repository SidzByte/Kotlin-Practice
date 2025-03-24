package practice.Control_Flow

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    println(if (firstResult == secondResult) "You win :)" else "You lose :(")

}

//Create a simple game where you win if throwing two dice results in the same number.
// Use if to print You win :) if the dice match or You lose :( otherwise.
//In this exercise, you import a package so that you can use the Random.nextInt() function
// to give you a random Int. For more information about importing packages, see Packages and imports.