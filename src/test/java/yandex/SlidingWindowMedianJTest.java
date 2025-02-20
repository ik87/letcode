package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SlidingWindowMedianJTest {
    @Test
    public void case1() {
        var result = SlidingWindowMedianJ.medianSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        Assertions.assertArrayEquals(result, new double[]{1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000});
    }

    @Test
    public void case2() {
        var result = SlidingWindowMedianJ.medianSlidingWindow(new int[]{1,4,2,3},4);
        System.out.println(Arrays.toString(result));
       // Assertions.assertArrayEquals(result, new double[]{1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000});
    }
}