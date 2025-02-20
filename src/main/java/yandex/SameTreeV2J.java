package yandex;

import yandex.model.TreeNodeJ;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SameTreeV2J {
    public static boolean isSameTree(TreeNodeJ p, TreeNodeJ q) {
        Queue<TreeNodeJ> pq = new LinkedList<>();
        pq.offer(p);
        Queue<TreeNodeJ> qq = new LinkedList<>();
        qq.offer(q);
        while(!pq.isEmpty() && !qq.isEmpty()) {
            if(pq.peek() != null && pq.offer(pq.peek().left)){}
            if(pq.peek() != null && pq.offer(pq.peek().right)){}
            if(qq.peek() != null && qq.offer(qq.peek().left)){}
            if(qq.peek() != null && qq.offer(qq.peek().right)){}
            var a = qq.peek() == null ? null : qq.peek().val;
            var b  = pq.peek() == null ? null : pq.peek().val;
            if(!Objects.equals(a, b)) {
                return false;
            }
            qq.remove();
            pq.remove();
        }
        return pq.isEmpty() == qq.isEmpty();
    }
}
