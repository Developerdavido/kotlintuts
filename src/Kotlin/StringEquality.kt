package Kotlin

fun main() {
    val name1 = "Saleh"

    val name2 = "Jamila"

    val name3 = String("Saleh".toCharArray()) //avoid creating string this way

    /**
     * there are two ways that we can carry out comparisons between strings in kotlin i.e
     * so one method compares the values literally and this any change is the cases of any of the integer will return a false value this includes
     * the == operator and .equals() method
     * The second method checks their location in memory and compares if they are in the same location. this is the === operator
     */

    //first method

    println("== ${name1 == name3}")
    println("=== ${name1 === name3}")
    println(".equals ${name1.equals(name3)}")

}