package yandex;
//https://leetcode.com/problems/search-in-rotated-sorted-array
public class SearchInRotatedSortedArrayV2J {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if ((nums[mid] >= nums[0]) == (nums[0] <= target)) {
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                //left side
            } else {
                if (nums[mid] >= nums[0]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
