package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayV2JTest {
    @Test
    public void case1() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{4,5,6,7,0,1,2}, 0);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void case2() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{8,9,10,11,12,14,18,1,2,3,4,5,6,7}, 6);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void case3() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1,3}, 1);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case4() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{3,1}, 3);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case5() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1}, 1);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case6() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1}, 0);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void case7() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1}, 0);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void case8() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1,3}, 2);
        Assertions.assertEquals(-1, result);
    }


    @Test
    public void case9() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{5,1,3}, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case10() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{1,3}, 3);
        Assertions.assertEquals(1, result);
    }


    @Test
    public void case11() {
        var result = SearchInRotatedSortedArrayV2J.search(new int[]{4,5,6,7,8,1,2,3}, 8);
        Assertions.assertEquals(4, result);
    }

}