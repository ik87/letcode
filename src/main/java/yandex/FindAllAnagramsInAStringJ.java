package yandex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagramsInAStringJ {
    public static List<Integer> findAnagrams(String s, String p) {
        //set p all world to hashmap
        // count the same characters, if count equals p.length(), then add i to list
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pCharsA = new HashMap<>();
        extracted(p.chars(), pCharsA);
        StringBuilder pCharsB = new StringBuilder();
        for (int j = 0; j < s.length();) {
            if (pCharsA.containsKey(s.charAt(j)) && pCharsA.get(s.charAt(j)) != 0) {
                pCharsA.compute(s.charAt(j), (k, v) -> v - 1);
                pCharsB.append(s.charAt(j));
                j++;
            } else {
                extracted(pCharsB.chars(), pCharsA);
                j -= (pCharsB.length() - 1);
                pCharsB.setLength(0);
            }
            if (pCharsB.length() == p.length()) {
                result.add(j - p.length());
                extracted(pCharsB.chars(), pCharsA);
                j -= (pCharsB.length() - 1);
                pCharsB.setLength(0);
            }
        }
        return result;
    }

    private static void extracted(IntStream chars, Map<Character, Integer> pCharsA) {
        chars.forEach(a ->
                pCharsA.compute((char) a, (key, val) -> val == null ? 1 : val + 1)
        );
    }
}
