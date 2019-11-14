package math

import org.junit.Assert
import org.junit.Test

class LcmTest {
    @Test
    fun testFindLcm1() {
        val result = findLcm(15, 20)
        Assert.assertEquals(result, 60)
    }
}