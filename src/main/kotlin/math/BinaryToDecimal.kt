package math

/**
 * If the binary number is 111.
 * dec_value = 1*(2^2) + 1*(2^1) + 1*(2^0) = 7
 * */
fun binaryToDecimal(binaryNumber: Int): Int {
    var decimalNumber = 0
    var base = 1
    var temp = binaryNumber
    while (temp > 0) {
        val lastDigit = temp % 10
        decimalNumber += lastDigit * base

        base *= 2
        temp /= 10
    }
    return decimalNumber
}