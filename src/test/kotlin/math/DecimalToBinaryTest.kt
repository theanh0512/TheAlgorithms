package math

import org.junit.Assert.assertEquals
import org.junit.Test

class DecimalToBinaryTest {
    @Test
    fun decimalToBinaryTest1() {
        val result = decimalToBinary(7)
        assertEquals(result, 111)
    }
}