/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {

  public int maxSubArray(int[] nums) {
    int prev = 0;
    int max = nums[0];
    for (int i : nums) {
      prev = Math.max(prev + i, i);
      max = Math.max(max, prev);
    }
    return max;
  }
}
// @lc code=end
