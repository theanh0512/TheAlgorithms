package array

import kotlin.math.max

fun sumAtMostK(array: IntArray, k: Int): Int {
    var sum = 0
    var count = 0
    var maxCount = 0
    val arrayLength = array.size

    for (i in array.indices) {
        if (sum + array[i] <= k) {
            sum += array[i]
            count++
        } else if (sum != 0) {
            sum = sum - array[i - count] + array[i]
        }
        maxCount = max(count, maxCount)
    }
    return maxCount
}