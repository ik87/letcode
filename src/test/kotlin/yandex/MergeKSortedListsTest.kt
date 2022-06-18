package yandex

import model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import yandex.helper.LinkedListHelper.generateListNode
import yandex.helper.LinkedListHelper.getLinkedListArray
import yandex.helper.LinkedListHelper.randomListData

internal class MergeKSortedListsTest {

    @Test
    fun `case 1`() {
        val times = 3
        val block = 3
        val size = times * block + times
        val list = randomListData(size, 1, 100)
        val data = getLinkedListArray(list, times, block)
        val result = MergeKSortedLists.mergeKLists(data)
        Assertions.assertEquals(list.sorted(), result?.toList())
    }

    @Test
    fun `case 2`() {
        val list = listOf(
            listOf(1, 4, 5),
            listOf(1, 3, 4),
            listOf(2, 6)
        )
        val data: Array<ListNode?> =
            arrayListOf(
                generateListNode(list[0]),
                generateListNode(list[1]),
                generateListNode(list[2])
            ).toTypedArray()
        print("list:\n")
        list.forEach(::print)
        val result = MergeKSortedLists.mergeKLists(data)
        print("\nresult:\n" + data.contentToString())
        Assertions.assertEquals(list.flatten().sorted(), result?.toList())
    }

    @Test
    fun whenFirstCase() {
        val times = 4
        val block = 5
        val size = times * block + times
        val list = randomListData(size, 1, 100)
        val data = getLinkedListArray(list, times, block)
        val result = MergeKSortedLists.mergeKLists(data)
        Assertions.assertEquals(list.sorted(), result?.toList())
    }

}