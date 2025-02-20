package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayIIJTest {
    @Test
    public void case1() {
        var result = SearchInRotatedSortedArrayIIJ.search(new int[]{1,0,1,1,1}, 0);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void case2() {
        var result = SearchInRotatedSortedArrayIIJ.search(new int[]{1}, 0);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void case3() {
        var result = SearchInRotatedSortedArrayIIJ.search(new int[]{1}, 1);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void case4() {
        var result = SearchInRotatedSortedArrayIIJ.search(new int[]{2,2,2,3,2,2,2}, 3);
        Assertions.assertEquals(true, result);
    }

}