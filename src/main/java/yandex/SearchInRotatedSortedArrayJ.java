package yandex;

//https://leetcode.com/problems/search-in-rotated-sorted-array
public class SearchInRotatedSortedArrayJ {
    public static int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        //BS searh to shift
        int low = 0;
        int max = nums.length - 1;
        while(low <= max) {
            int mid = low + (max - low) / 2;
            int value = nums[mid];
            if(value == target) {
                return mid;
            }

            boolean bigTarget = target >= nums[0];
            boolean bigValue = value >= nums[0];

            if(bigTarget == bigValue) {
                if(value < target) {
                    low = mid + 1;
                } else {
                    max = mid - 1;
                }
            } else {
                if(bigValue) {
                    low = mid + 1;
                } else {
                    max =  mid - 1;
                }
            }
        }
        return -1;
    }
}
