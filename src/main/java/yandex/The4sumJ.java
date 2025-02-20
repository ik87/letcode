package yandex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/4sum/
public class The4sumJ {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List result = new ArrayList<List<Integer>>();
        int a,b,c,d = 0;
        for(a = 0; a < nums.length; a++) {
            for(b = a + 1; b < nums.length; b++) {
                for(c = b + 1; c < nums.length; c++) {
                    for(d = c + 1; d < nums.length; d++) {
                        if(target == (nums[a] + nums[b] + nums[c] + nums[d])) {
                            List nnn = new ArrayList<Integer>();
                            nnn.add(nums[a]);
                            nnn.add(nums[b]);
                            nnn.add(nums[c]);
                            nnn.add(nums[d]);
                            Collections.sort(nnn);
                            if(!result.contains(nnn)) {
                                result.add(nnn);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
