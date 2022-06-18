package yandex

import model.ListNode
//https://leetcode.com/problems/linked-list-cycle/
object LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var rabbet = head
        var turtle = head
        var isCycle = false
        var steps = 1
        while (turtle != null && rabbet != null ) {
            for (i in 0..steps) {
                rabbet = rabbet?.next
                if (rabbet == null) {
                    break
                }
                if (turtle?.`val` == rabbet.`val`) {
                    isCycle = true
                    break
                }
            }
            turtle = turtle.next
            steps++
        }
        return isCycle
    }

}