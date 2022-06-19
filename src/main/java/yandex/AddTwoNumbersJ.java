package yandex;
import yandex.model.ListNodeJ;

public class AddTwoNumbersJ {
    public ListNodeJ addTwoNumbers(ListNodeJ t1, ListNodeJ t2) {
        int i = 0;
        ListNodeJ head = new ListNodeJ();
        ListNodeJ tail = head;
        while(t1 != null && t2 != null && i != 0) {
            int val1 = t1 != null ? t1.val : 0;
            int val2 = t2 != null ? t2.val : 0;
            int val = (val1 + val2 + i) % 10;
            i = (val1 + val2 + i) / 10;
            tail.next = new ListNodeJ(val);
            tail = tail.next;
            t1 = t1 != null ? t1.next : null;
            t2 = t2 != null ? t2.next : null;
        }
        return head.next;
    }
}
