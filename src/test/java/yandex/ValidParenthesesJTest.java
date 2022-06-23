package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesJTest {

    @Test
    public void case1() {
        var aa = ValidParenthesesJ.isValid("()");
        Assertions.assertTrue(aa);
    }

    @Test
    public void case2() {
        var aa = ValidParenthesesJ.isValid("()[]{}");
        Assertions.assertTrue(aa);
    }

}