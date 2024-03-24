package Kotlin

fun main() {
    // this looks at the increment operators ++ and --
    var number = 10
    println(++number) //11
    println(number++) //11
    println(++number) //13

    /**
     * so when the ++ is placed before the variable, it increase the variable and returns it
     * when the ++ is placed after the variable, it returns variable and the adds to it hence the new value is only shown
     * when the number is printed again
     * the same applies when using the decrement operator
     */
}