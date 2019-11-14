package math

import org.junit.Assert.assertEquals
import org.junit.Test

class BinaryToDecimalTest {
    @Test
    fun testBinaryToDecimal1() {
        val result = binaryToDecimal(10101001)
        assertEquals(result, 169)
    }
}