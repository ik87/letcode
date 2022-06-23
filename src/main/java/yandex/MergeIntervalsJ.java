package yandex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

//https://leetcode.com/problems/merge-intervals
public class MergeIntervalsJ {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt( a -> a[0]));
        int a = intervals[0][0];
        int b = intervals[0][1];

        for(int i = 1 ; i < intervals.length; i++) {
            int c = intervals[i][0];
            int d = intervals[i][1];

            if (b < c || a > d ) {
                result.add(new int[]{a,b});
                a = c;
                b = d;
                continue;
            }

            if (c <= a ) {
                a = c;
            }

            if (d >= b ) {
                b = d;
            }
        }
        result.add(new int[]{a,b});
        return result.toArray(new int[result.size()][]);
    }
}
