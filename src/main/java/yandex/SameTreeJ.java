package yandex;

import yandex.model.TreeNodeJ;
import java.util.Deque;
import java.util.LinkedList;
//https://leetcode.com/problems/same-tree
public class SameTreeJ {
        public static boolean isSameTree(TreeNodeJ p, TreeNodeJ q) {
            if(p == null && q == null) {
                return true;
            } else if(p == null || q == null) {
                return false;
            }
            Deque<TreeNodeJ> dq1 = new LinkedList<>(){{
                offerLast(p);
            }};
            Deque<TreeNodeJ> dq2 = new LinkedList<>(){{
                offerLast(q);
            }};
            boolean same = true;
            while(!dq1.isEmpty() && !dq2.isEmpty()) {
                TreeNodeJ n1 = dq1.pollFirst();
                TreeNodeJ n2 = dq2.pollFirst();

                if(n1.val != n2.val) {
                    same = false;
                    break;
                }

                int nn1 = 2;
                int nn2 = 2;
                if(n1.left != null) dq1.offerLast(n1.left); else nn1--;
                if(n1.right != null) dq1.offerLast(n1.right); else nn2--;
                if(n2.left != null) dq2.offerLast(n2.left); else nn1--;
                if(n2.right != null) dq2.offerLast(n2.right); else nn2--;

                if(nn1 == 1 || nn2 == 1) {
                    same = false;
                    break;
                }

            }
            return same && dq1.isEmpty() && dq2.isEmpty();
    }
}
