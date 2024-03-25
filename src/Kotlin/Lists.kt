package Kotlin

fun main() {
    /**
     * List are just like arrays and are actually built on arrays. list are of two types and these are
     * mutable lists  - mutable lists allow for the list to have its contents modified and contains methods such as add, remove e.t.c
     * immutable lists - these are lists that are read only
     */

    //immutable lists
    val name = listOf<String>("Jane", "Mensah", "Agyemang", "Baidoo")

    println(name.toString())
    println(name[0])
    println(name[1])
    println(name.size)
    println(name.contains("Opoku"))
    println(name.first())
    println(name.last())

    //mutable list
    val mutableNames = mutableListOf<String>("Jane", "Mensah", "Agyemang", "Baidoo")
    mutableNames.add("Sokka")
    mutableNames.removeAt(2)
    println(mutableNames.any { it == "Mensah" })
    println("Mutable names $mutableNames")
}