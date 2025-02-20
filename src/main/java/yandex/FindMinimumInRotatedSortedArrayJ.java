package yandex;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
public class FindMinimumInRotatedSortedArrayJ {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = nums[0];
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[0] <= nums[mid]) {
                left = mid + 1; //-inf
            } else if (nums[0] > nums[mid]) {
                if(min > nums[mid]) {
                    min = nums[mid];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return min;
    }
}
