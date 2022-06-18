package tasks

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class StringCompression443Test {
    @Test
    fun test1() {
        val result = StringCompression443().compress(charArrayOf('a','a','b','b','c','c','c'))
        Assertions.assertSame(result, 6)
    }
    @Test
    fun test2() {
        val result = StringCompression443().compress(charArrayOf('a'))
        Assertions.assertSame(result, 1)
    }
    @Test
    fun test3() {
        val chars = charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b')
        val result = StringCompression443().compress(chars)
        Assertions.assertArrayEquals(charArrayOf('a','b','1','2'), chars)
        Assertions.assertSame(result, 4)
    }
}