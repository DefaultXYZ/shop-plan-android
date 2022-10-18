package xyz.shop.plan

import org.junit.Assert
import org.junit.Test

class SimpleTest {

    @Test
    fun `Should add two numbers`() {
        val a = 2
        val b = 3
        val actual = a + b
        val expected = 5
        Assert.assertEquals(expected, actual)
    }
}
