package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import yandex.model.TreeNodeJ;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeJTest {

    @Test
    public void case1() {
        TreeNodeJ tn = new TreeNodeJ(1, null, new TreeNodeJ(3));
        TreeNodeJ tn2 = new TreeNodeJ(1, new TreeNodeJ(2), new TreeNodeJ(3));
        var result = SameTreeJ.isSameTree(tn, tn2);
        Assertions.assertFalse(result);
    }

}