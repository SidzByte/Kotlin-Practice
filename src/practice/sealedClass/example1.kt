package practice.sealedClass

sealed class Animal {
    class Dog : Animal()
    class Cat : Animal()
}

fun describeAnimal(animal: Animal): String {
    return when (animal) {
        is Animal.Dog -> "It's a Dog"
        is Animal.Cat -> "It's a Cat"
    }
}

fun main() {
    val myPet = Animal.Dog()
    println(describeAnimal(myPet))  // Output: It's a Dog
}
