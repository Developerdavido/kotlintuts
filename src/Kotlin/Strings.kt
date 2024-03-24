package Kotlin

fun main() {
    //strings have all the properties that exists for all the other programming languages
    val email = """
        Hello %s
         how 
        are you
    """.trimIndent()

    println(email.format("Dave"))
}