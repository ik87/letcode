package yandex;
import yandex.model.ListNodeJ;

public class LinkedListCycleJ {
    public static boolean hasCycle(ListNodeJ head) {
        ListNodeJ t = head;
        ListNodeJ r = head;
        while(t != null && r != null && head.next != null) {
            t = t.next;
            r = t.next.next;
            if(t == r) {
                return true;
            }
        }
        return false;
    }
}
