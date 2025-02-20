package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayJTest {
    @Test
    public void case1() {
        var result = FindMinimumInRotatedSortedArrayJ.findMin(new int[]{4,5,6,7,0,1,2});
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case2() {
        var result = FindMinimumInRotatedSortedArrayJ.findMin(new int[]{8,9,10,11,12,14,18,1,2,3,4,5,6,7});
        Assertions.assertEquals(1, result);
    }

    @Test
    public void case3() {
        var result = FindMinimumInRotatedSortedArrayJ.findMin(new int[]{1});
        Assertions.assertEquals(1, result);
    }
}