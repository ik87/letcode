package yandex.model;

public class TreeNodeJ {
      public int val;
      public TreeNodeJ left;
      public TreeNodeJ right;
      public TreeNodeJ() {}
      public TreeNodeJ(int val) { this.val = val; }
      public TreeNodeJ(int val, TreeNodeJ left, TreeNodeJ right) {
          this.val = val;
          this.left = left;
          this.right = right;
 }
}
