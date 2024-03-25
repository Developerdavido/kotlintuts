package Kotlin

fun main() {
    /**
     * Let's look at arrays
     * When initializing an array, we use the method arrayOf which will take the array type.
     * However arrays are immutable and when declared, their size cannot be changed or modified which means you cannot add or subtract from the array
     * you can however check for the position of an element, get the size of the array and even return the value of an element at a particular position
     * in order to ensure that an array is of one type, we use <> whilst specifying the type in there.
     */

    val names = arrayOf<String>("John", "Maeve", "David")

    println(names.contentToString())
    println(names[0])
    println(names[1])
    println(names[2])
    println(names.size)

    if ("Simeon" in names) {
        println("found")
    }else {
        println("not found")
    }

    /**
     * using an arrayOf is not the only way by which we can create arrays we have
     * 1. arrayOfNulls
     * 2. booleanArrayOf
     */

    val arrayOfNulls = arrayOfNulls<String>(5)

    println(arrayOfNulls.contentToString())
    arrayOfNulls[4] = "hello"
    println(arrayOfNulls.contentToString())
    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString())

}