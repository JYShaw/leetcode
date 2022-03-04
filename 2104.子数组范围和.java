/*
 * @lc app=leetcode.cn id=2104 lang=java
 *
 * [2104] 子数组范围和
 */

// @lc code=start
class Solution {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < len; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                sum += max - min;
            }
        }
        return sum;
    }
}
// @lc code=end
