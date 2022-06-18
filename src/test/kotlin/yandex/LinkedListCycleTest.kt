package yandex

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import yandex.helper.LinkedListHelper

internal class LinkedListCycleTest {
    @Test
    fun `case 1`() {
        val raw = listOf(3, 2, 0, -4)
        val data = LinkedListHelper.generateListNode(raw)
        data.next?.next?.next?.next = data.next //connect tail to second node
        Assertions.assertTrue(LinkedListCycle.hasCycle(data))
    }

    @Test
    fun `case 1n`() {
        val raw = listOf(3, 2, 0, -4)
        val data = LinkedListHelper.generateListNode(raw)
        Assertions.assertFalse(LinkedListCycle.hasCycle(data))
    }

    @Test
    fun `case 2`() {
        val raw = listOf(1, 2)
        val data = LinkedListHelper.generateListNode(raw)
        data.next?.next = data //connect tail to second node
        Assertions.assertTrue(LinkedListCycle.hasCycle(data))
    }

    @Test
    fun `case 2n`() {
        val raw = listOf(1, 2)
        val data = LinkedListHelper.generateListNode(raw)
        Assertions.assertFalse(LinkedListCycle.hasCycle(data))
    }

    @Test
    fun `case 3`() {
        val raw = listOf(1)
        val data = LinkedListHelper.generateListNode(raw)
        Assertions.assertFalse(LinkedListCycle.hasCycle(data))
    }
}