package Kotlin

fun main() {
    /**
     * we have some logical operators that are common with dart and these are  and(&&) and or(||)
     * with and(&&),also known as conjunction, both sides need to return true before the returned value is true.
     * with or(||), also known as disjunction, only one part need top be true for the returned boolean to be true
     * We also have the negation sign (!) which is placed just in front of a boolean values to flip the original value
     * Parentheses () can also be used to combine expressions
     */

    //example
    val isAdult = false;
    val isMale = true;
    val isFemale = false
    val isDriver = true

    println(isAdult && isFemale && isDriver)
    println(isFemale || isAdult)
    println(!isAdult)
    println(!isDriver)
}