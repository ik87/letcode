package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterJTest {
    @Test
    public void case1() {
        var result = ContainerWithMostWaterJ.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        Assertions.assertEquals(result, 49);
    }
}