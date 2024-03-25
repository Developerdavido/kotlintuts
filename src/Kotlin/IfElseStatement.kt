package Kotlin

fun main() {
    /**
     * The if statement is an expression not actually a statement. this is because they return a value
     */
    val n1 = 31
    val n2 = 20

    if (n1 > n2 && n1 <= 30) {
        println(":)")
    } else if (n1 == 100){
        println(":|")
    } else {
       println(":(")
    }

    //for example to confirm that an if statement is an expression, we can use this
    val value = if (n1 > n2 && n2 == 10){
        ": )"
    }else {
        ":("
    }
    println(value)

    /**
     * We also have ternary operators. if we have an if and else that returns a simple value we can use the ternary operator
     * we can use  ?  and :
     * or we can use if and else on a single line
     */

    //example
    //var v = n1 > n2 ? ":)"  : ":("
    val v1 = if (n1 >= n2) ":)" else ":("
    val v2 =
        if (n1 <= n2) ":)"
        else if (n2 > 100) ":("
        else ":("

    println(v1)
    println(v2)

    /**
     * we can also convert an if to a When statement. this eventually makes the if statement become cleaner
     * for example
     */

    val egre = when {
        (n1 > n2 && n1 <= 30) -> "This is egregious"
        (n2 <= 30) -> "This is egregious"
        (n1 >  30) -> "This is egregious"
        else -> println()
    }
    println(egre)

    /**
     * there is also the scenario where we use when to check for ranges for example in trying to get the range of a value
     * this uses the in keyword.
     */

    val age  = 18

    when(age) {
        in 0..12 -> println("better range")
        !in 0..12 -> println("bad range")
        else -> println()
    }

}