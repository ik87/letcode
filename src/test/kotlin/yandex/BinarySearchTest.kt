package yandex

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class BinarySearchTest {
    @Test
    fun `case 1`() {
        val data = intArrayOf(1, 2, 4, 5, 6, 7)
        val result = BinarySearch.search(data, 4)
        Assertions.assertEquals(result, 2)
    }

    @Test
    fun `case 2`() {
        val data = intArrayOf(1, 2, 4, 5, 6, 7)
        val result = BinarySearch.search(data, 1)
        Assertions.assertEquals(result, 0)
    }

    @Test
    fun `case 3`() {
        val data = intArrayOf(1, 2, 4, 5, 6, 7)
        val result = BinarySearch.search(data, 7)
        Assertions.assertEquals(result, 5)
    }

    @Test
    fun `case 4`() {
        val data = intArrayOf(1, 2, 4, 5, 6, 7)
        val result = BinarySearch.search(data, 10)
        Assertions.assertEquals(result, -1)
    }
}