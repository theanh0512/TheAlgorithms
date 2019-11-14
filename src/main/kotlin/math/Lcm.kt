package math

/**
 * LCM (Least Common Multiple) of two numbers is the smallest number which can be divided by both numbers.
 * For example LCM of 15 and 20 is 60 and LCM of 5 and 7 is 35.
 * */

/**
 * An efficient solution is based on below formula for LCM of two numbers ‘a’ and ‘b’.
 *  a x b = LCM(a, b) * GCD (a, b)
 *  LCM(a, b) = (a x b) / GCD(a, b)
 *  O(log(max(a,b))
 * */
fun findLcm(a: Int, b: Int) :Int {
    return (a * b) / findGcd(a, b)
}