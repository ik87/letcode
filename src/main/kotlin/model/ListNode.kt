package model

import java.util.*

class ListNode (
    var `val`: Int = 0,
    var next: ListNode? = null
) {
    override fun toString(): String {
        val buildStr = StringJoiner(",", "[", "]")
        var head: ListNode? = this
        while (head != null) {
            buildStr.add(head.`val`.toString())
            head = head?.next
        }
        return buildStr.toString()
    }

    fun toList(): List<Int> {
       val list = mutableListOf<Int>()
        var node: ListNode? = this
        while (node != null) {
            list.add(node?.`val`)
            node = node.next
        }
        return list
    }
}

