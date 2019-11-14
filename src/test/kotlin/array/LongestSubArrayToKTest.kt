package array

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestSubArrayToKTest {
    @Test
    fun atMostKTest() {
        val arr = intArrayOf(1, 2, 1, 0, 1, 1, 0)
        val result = sumAtMostK(arr, 4)
        assertEquals(result, 5)
    }
}