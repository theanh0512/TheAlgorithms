package math

fun decimalToBinary(decimalNumber: Int): Int {
    val binaryArray = IntArray(32)
    var count = 0
    var temp = decimalNumber
    var result = 0
    while (temp != 0) {
        binaryArray[count] = decimalNumber % 2
        temp /= 2
        count++
    }
    while (count >= 0) {
        result = result * 10 + binaryArray[count]
        count--
    }
    return result
}