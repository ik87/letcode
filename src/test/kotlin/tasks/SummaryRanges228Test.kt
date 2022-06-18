package tasks

import org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder
import org.junit.jupiter.api.Assertions


import org.junit.jupiter.api.Test

internal class SummaryRanges228Test {
    @Test
    fun test1() {
        val result = SummaryRanges228().summaryRanges(intArrayOf(0,1,2,4,5,7))
        val actual = listOf("0->2","4->5","7")
        Assertions.assertArrayEquals(result.toTypedArray(), actual.toTypedArray())
    }
    @Test
    fun test2() {
        val result = SummaryRanges228().summaryRanges(intArrayOf(0,2,3,4,6,8,9))
        val actual = listOf("0","2->4","6","8->9")
        Assertions.assertArrayEquals(result.toTypedArray(), actual.toTypedArray())
    }
}