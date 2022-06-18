package yandex

import model.ListNode
//https://leetcode.com/problems/merge-k-sorted-lists/
object MergeKSortedLists {

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()) {
            return null
        }
        val result = lists.copyOf()
        return doSort(result)
    }

    private fun mergeListNode(left: ListNode?, right: ListNode?): ListNode? {
        var leftV = left
        var rightV = right
        var tail: ListNode? = ListNode()
        var head: ListNode? = tail
        while (leftV != null && rightV != null) {
            if (leftV.`val` < rightV.`val`) {
                tail?.next = ListNode(leftV.`val`)
                tail = tail?.next
                leftV = leftV.next
            } else {
                tail?.next = ListNode(rightV.`val`)
                tail = tail?.next
                rightV = rightV.next
            }
        }
        //   while (leftV != null) {
        //       tail?.next = ListNode( `val` = leftV.`val`)
        //       tail = tail?.next
        //       leftV = leftV.next
        //   }
        //   while (rightV != null) {
        //       tail?.next = ListNode( `val` = rightV.`val`)
        //       tail = tail?.next
        //       rightV = rightV.next
        //   }
        if (leftV != null) {
            tail?.next = leftV
        }
        if (rightV != null) {
            tail?.next = rightV
        }
        head = head?.next
        return head
    }

    private fun doSort(lists: Array<ListNode?>): ListNode? {
        val len = lists.size
        if (len == 1) {
            return lists.first()
        }
        val iLeft = len / 2
        val left = lists.copyOf(iLeft)
        val right = lists.copyOfRange(iLeft, len)

        val leftListNode = doSort(left)
        val rightListNode = doSort(right)

        return mergeListNode(leftListNode, rightListNode)
    }
}