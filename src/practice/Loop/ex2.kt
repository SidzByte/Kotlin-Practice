package practice.Loop

fun main() {
    // Write your code here
    for(number in 1..100){
        val result = when{
            number%3==0 && number%5==0 -> "fizzbuzz"
            number%3==0 -> "fizz"
            number%5==0 -> "buzz"
//          number%3==0 && number%5==0 -> "fizzbuzz"  //if using this line here fizzbuzz output is not satisfying
            else -> number
        }
        println(result)
    }

}

//Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
// replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
// Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".

//Hint 1
//Use a for loop to count numbers and a when expression to decide what to print at each step.

//Hint 2
//Use the modulo operator (%) to return the remainder of a number being divided.
// Use the equality operator (==) to check if the remainder equals zero.