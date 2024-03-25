package Kotlin

fun main() {
    /**
     * the keyword fun is used in declaring functions this then comes with the name with a semi colon to show the
     * return type if any. functions can also take arguments
     */
    //this regards the arguments as positional.
    greet("David", 12)
    //this gives a default value to the the age hence it is not required
    greet("Alex")
    //in order to get named arguments we can do like this
    greet(age = 18, name = "Jonah")

    functionAsArguments()

    var value = double(4)
    println(value)

    val (firstValue, secondValue) = doubleValues()
    val (fv, sv, tripleValues) = tripleValues()
}

//function as arguments
fun functionAsArguments() {
    /**
     * this is one way of calling the function, but this can only work if the function is the last argument in the function
     *
     */
    foo {
        println("The bar is in this function")
    }

    // we an also do
    foo(bar = {
        println("This is the second bar function")
    })
    //or even
    foo()
}

/**
 * in order to return a value from a function, we just add a colon after the name of the function and pass the type
 */

//fun double(n: Int) : Int {
//    return  n * 2
//}

//we also have single line functions which come about by removing the parenthesis from a function
fun double (n: Int) : Int = n * 4

/**
 * We can also pass a function in a function and here is how it is done
 */

fun foo(bar: ()-> Unit = {} ) {
    println("This is the foo function")
    bar()
}


//we can also have a default arguments
fun greet(name: String, age:Int = -1) {
    println("Hello  $name")
    if (age == -1) {
        println("The age has not been provided")
        /**
         * when we use the return keyword. immediately it is called the other conditions are no more checked
         */
        return
    }
    if (age >= 16) {
        println("$name is an adult")
    }else {
        println("$name is not an adult")
    }
}

/**
 * Here a function can return two values or three values this can be achieved by using the keyword Pair or Triple
 */

fun doubleValues() : Pair<String, Int> {
    return "David" to 25
}

fun doubleValues2() : Pair<String, Int> {
    return Pair("David", 25)
}

fun tripleValues() : Triple<String, Int, Char> {
    return Triple(
        first = "Friend",
        second = 12,
        third = 'S'
    )
}

