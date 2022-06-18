package tasks

import model.ListNode

class ReverseLinkedList206 {
    fun reverseList(head: ListNode?): ListNode? {
        head ?: return null
        var tail = ListNode()
        var head = head
        while (head != null) {
           tail.`val` = head.`val`
           head = head.next ?: break
           val next = tail
           tail = ListNode()
           tail.next = next
        }
        return tail
    }
}
