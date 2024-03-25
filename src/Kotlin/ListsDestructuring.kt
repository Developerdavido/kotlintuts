package Kotlin

fun main() {
    /**
     * Lists destructuring is a way of assigning the values of a list with known type and length to variables
     * this can work with any collection
     */

    //for example
    val names = listOf<String>("David", "Simeon", "Omoge", "Jeje")

    val (one, two, _, four) = names

    println(one)
    println(two)
    println(four)
}