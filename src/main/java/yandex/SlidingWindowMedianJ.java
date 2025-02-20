package yandex;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/sliding-window-median
public class SlidingWindowMedianJ {
        public static double[] medianSlidingWindow(int[] nums, int k) {
                double[] medians = new double[nums.length];
                int i = 0;
                for(; i+k <= nums.length; i++) {
                 int[] array = IntStream
                        .range(i, i+k)
                        .map(x -> nums[x])
                        .sorted()
                        .limit(k/2 + 1)
                         .skip(((k+1)/2) - 1)
                        .toArray();
                 if(k % 2 == 0) {
                   medians[i] = array[0]/2d + array[1]/2d;
                 } else {
                   medians[i] = array[0];
                 }
            }

            return Arrays.copyOf(medians, i);
        }
}
