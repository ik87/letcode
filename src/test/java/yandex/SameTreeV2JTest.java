package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import yandex.model.TreeNodeJ;

class SameTreeV2JTest {
    @Test
    public void case1() {
        TreeNodeJ tn = new TreeNodeJ(1, null, new TreeNodeJ(3));
        TreeNodeJ tn2 = new TreeNodeJ(1, new TreeNodeJ(2), new TreeNodeJ(3));
        var result = SameTreeV2J.isSameTree(tn, tn2);
        Assertions.assertFalse(result);
    }
    @Test
    public void case2() {
        TreeNodeJ tn = new TreeNodeJ(1, null, new TreeNodeJ(3));
        TreeNodeJ tn2 = new TreeNodeJ(1, null, new TreeNodeJ(3));
        var result = SameTreeV2J.isSameTree(tn, tn2);
        Assertions.assertTrue(result);
    }
}