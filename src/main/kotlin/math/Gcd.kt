package math

/**
 * GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers
 * is the largest number that divides both of them.
 * For example GCD of 20 and 28 is 4 and GCD of 98 and 56 is 14
 * */

/**
 *  The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number.
 *  O(log(max(a,b))
 *  */
fun findGcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return findGcd(b, a % b)
}

/**
 * Find gcd of very large number with a normal number
 * very large  number will be string
 * Idea: we can calculate a modulus of a large number to a normal number and find gcd of the 2 number
 * modulus number of a will be less than or equal a
 * find modulus of a large number to a normal number will use the property
 * xy (mod a) ≡ ((x (mod a) * y) (mod a))
 * */
fun reduceNumber(a: Int, b: String): Int {
    var result = 0
    for (i in b.indices) {
        result = (result * 10 + (b[i] - '0')) % a
    }
    return result
}

fun findGcdLarge(a: Int, b: String): Int {
    val reduceNumber = reduceNumber(a, b)
    return findGcd(reduceNumber, a)
}