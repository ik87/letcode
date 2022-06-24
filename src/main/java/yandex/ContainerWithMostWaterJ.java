package yandex;
//https://leetcode.com/problems/container-with-most-water/submissions/
public class ContainerWithMostWaterJ {
    public static int maxArea(int[] height) {
        int[] i = new int[]{0, height.length - 1};
        int max = getMax(i, height);
        while(i[0] != i[1]) {
            int value = getMax(i, height);
            max = max > value ? max : value;
            i = getNext(i, height);
        }
        return max;
    }

    private static int getMax(int[] i, int[] height) {
        int min = Math.min(height[i[0]], height[i[1]]);
        return min * (i[1] - i[0]);
    }

    private static int[] getNext(int[] i, int[] height) {
        if(height[i[0]] < height[i[1]])
            i[0]++;
        else
            i[1]--;
        return i;
    }
}
