package yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class FindAllAnagramsInAStringJTest {
    @Test
    public void case1() {
        var result = FindAllAnagramsInAStringJ.findAnagrams("cbaebabacd", "abc");
        var expect = List.of(0,6);
        Assertions.assertIterableEquals(result, expect);
    }

    @Test
    public void case2() {
        var result = FindAllAnagramsInAStringJ.findAnagrams("af", "be");
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void case3() {
        var result = FindAllAnagramsInAStringJ.findAnagrams("abab", "ab");
        var expect = List.of(0,1,2);
        Assertions.assertIterableEquals(result, expect);
    }


}