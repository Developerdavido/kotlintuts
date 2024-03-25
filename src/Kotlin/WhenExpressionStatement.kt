package Kotlin

fun main() {
    /**
     * Different from most programming languages, kotlin do not have a switch case statement. Here, there is the use of when expression which
     * can go through different branches to return a value
     */

    //for example
    var gender = "F"

    when(gender) {
        "M" -> println("Male")
        "F" -> println("Female")
    }

    /**
     * The when can also be placed in a variable which can then be accessed later
     */

    var input  = ""

    val gen = when(input) {
        "M" -> "Male"
        "F" -> "Female"
        else -> {
            "Unknown Gender"
        }
    }
    println(gen)
}