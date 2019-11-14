package math

import org.junit.Assert.assertEquals
import org.junit.Test

class GcdTest {
    @Test
    fun testFindGcd1() {
        val result = findGcd(98, 56)
        assertEquals(result, 14)
    }

    @Test
    fun testFindGcdLarge1() {
        val result = findGcdLarge(1221, "19837658191095787329")
        assertEquals(result, 3)
    }

    @Test
    fun testFindGcd2() {
        val result = findGcd(474, 1221)
        assertEquals(result, 3)
    }
}