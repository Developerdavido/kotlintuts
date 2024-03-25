package Kotlin

fun main() {
    /**
     * This like most other programming languages when working with loops follows the same format
     * one of the most common ways of iterating through lists is the for loop. unlike dart, we do not have to declare the
     * variables with a type. kotlin inherently knows that you are looping over a specific type
     */

    val names = arrayOf("david", "mary", "joseph")
    val letters = charArrayOf('A', 'B', 'F', 'V')

    for (name in names) println(name)

    for(name in names) {
        val modifiedName = name.replaceFirstChar {
            it.uppercase()
        }
        println(modifiedName)
    }

    /**
     * Now there are times where we want to loop over the index rather than the values in doing that we can use the indices
     */

    for (index in letters.indices) {
        println(index)
        //to get the name
        println("$index - ${letters[index]}")
    }

    /**
     * to print the reverse of the indices, we can do it this way
     */


    for (index in letters.indices.reversed()) {
        println(index)
        //to get the name
        println("$index - ${letters[index]}")
    }


    /**
     * THERE IS ALSO THE LOOP OVER A RANGE. this involves using the operator ..
     * We can also print in reverse over a range. in this format we use the keyword downTo
     * There os also another keyword STEP. this modifies how the iterator will move to the next value
     */

    //range
    println("Range only")
    for (i in 1..12) println(i)

    //range and step
    println("Range and step 2")
    for (i in 1..12 step 2) println(i)

    //downTo
    println("Down to")
    for (i in 5 downTo 3) println(i)

    //downTo and step
    println("Down to and step 3")
    for (i in 5 downTo 3 step 3) println(i)


    /**
     * Due to the fact that strings are an array of characters, we can also loop through them
     */

    var brand = "David"
    for (l in brand) {
        println(l)
    }

    /**
     * There is another way of looping through types and this is by using the for each method.
     * it provides a lambda function that uses a placeholder "it" to hold the value of every iterated item in the list
     * although quite different from that of dart. it performs the same way
     */

    //using the names example
    println("For each example")
    names.forEach { println(it) }


    /**
     * While loop is another kind of loop that looks at the  performing a loop under a given condition
     * this loop can be performed for all arrays
     */
    //while loop
    println("While loop example")
    val codeBrand  = "dartvada"
    var index = 0

    while (index < codeBrand.length - 1) {
        println(codeBrand[index])
        ++index
    }

    /**
     * Do while loop iterates through an iterable and performs a function once the condition is satisfied. over here the function is
     * performed at least once
     */

    //Do-while loop
    println("Do while loop")
    do {
        println("Hi")
    }while (false)


}