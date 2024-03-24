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

}