/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int len = 0;
    int prev = nums[0];
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
      if (prev == nums[i]) {
        continue;
      } else {
        prev = nums[i];
        j++;
        nums[j] = prev;
      }
    }
    return j + 1;
  }
}
// @lc code=end
