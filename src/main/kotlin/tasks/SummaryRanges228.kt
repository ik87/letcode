package tasks

class SummaryRanges228 {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = mutableListOf<String>()
        var count = 0
        while (nums.size > count) {
            var i = nums[count]
            val from = i;
            while (nums.size > ++count && nums[count] == (i + 1)) {
                i++
            }
            val to = i
            if(from != to)
                result.add("${from}->${to}")
            else
                result.add("${from}")
        }
        return result
    }
}