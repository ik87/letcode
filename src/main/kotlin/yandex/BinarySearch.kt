package yandex
//https://leetcode.com/problems/binary-search/
object BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var first = 0
        var last = nums.size
        while (first != last) {
            var point = (first + last) / 2
            if (nums[point] == target) {
                return point
            }
            else if (nums[point] < target) {
                first = point + 1
            }
            else if (nums[point] > target) {
                last = point
            }
        }
        return -1
    }
}