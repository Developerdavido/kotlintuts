package Kotlin

fun main() {
    /**
     * When we use break and continue, continue allows the loop to continue iterating but skipping any follow up code
     * whilst break kills the loop whilst moving out to the and continuing the code block.
     * break and continue do not work in a forEach method and is not allowed
     */

    val nums = intArrayOf(1,2,3,4,5,6,7,8,9)

    for(num in nums) {
        if (num % 2 == 0) continue
        if (num > 5) break
        println(num)
    }
}