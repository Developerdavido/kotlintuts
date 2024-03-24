package Kotlin

fun main() {
    /*
    kotlin just like dart does not allow null values. However just like dart in order to create a variable that can be a
    null, we have to declare a nullable type to the variable that we are declaring.
    below is an example:
    * */

    var name: String? = "David Simeon"
    //name = null
    println(name?.uppercase())

    /*
    * if the question mark is not added to the type, we will end up not be able to assign a null value to the variable*/

    var age: Int = 12

    //age = null //this will return an error


}