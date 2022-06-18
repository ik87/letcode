package yandex.helper

import model.ListNode
import kotlin.random.Random

object LinkedListHelper {

    fun getLinkedListArray(list: List<Int>, times: Int, block: Int): Array<ListNode?> {
        return list.shuffled().let {
            val data = mutableListOf<ListNode>()
            var step = 0
            for (i in 1..times) {
                it.subList(step, step + block + 1).sorted().let { subList ->
                    data.add(generateListNode(subList))
                    step += block + 1
                }
            }
            data.toTypedArray()
        }
    }

    //сделать набор упорядоченных данных
    fun randomListData(size: Int, from: Int, to: Int): List<Int> {
        return generateSequence {
            Random.nextInt(from, to)
        }.take(size).toList()
    }


    fun generateListNode(shuffleList: List<Int>): ListNode {
        var node: ListNode? = null
        shuffleList
            .reversed()
            .forEach {
                node = ListNode(it, node)
            }
        return node!!
    }
}

