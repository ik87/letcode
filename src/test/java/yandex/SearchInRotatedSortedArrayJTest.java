package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayJTest {
    @Test
    public void case1() {
        var result = SearchInRotatedSortedArrayJ.search(new int[]{4,5,6,7,0,1,2}, 0);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void case2() {
        var result = SearchInRotatedSortedArrayJ.search(new int[]{8,9,10,11,12,14,18,1,2,3,4,5,6,7}, 6);
        Assertions.assertEquals(12, result);
    }

}