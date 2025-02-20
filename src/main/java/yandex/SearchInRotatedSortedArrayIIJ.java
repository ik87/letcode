package yandex;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/
public class SearchInRotatedSortedArrayIIJ {
    public static boolean search(int[] nums, int target) {
        //find target
        if(nums.length == 1) {
            if(nums[0] == target) {
                return true;
            } else {
                return false;
            }
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[0] < nums[mid]) {
                left = mid + 1;
            } else  {
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target){
                    left = mid + 1;
                } else {
                    return nums[0] > target;
                }
            }
        }
        //target could be less then 0 index
        return false;
    }
}
