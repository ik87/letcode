package yandex.model;

public class ListNodeJ {
   public int val;
   public ListNodeJ next;
   public ListNodeJ() {}
   public ListNodeJ(int val) { this.val = val; }
   public ListNodeJ(int val, ListNodeJ next) { this.val = val; this.next = next; }
}
