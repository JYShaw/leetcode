/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {

  public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int min = Math.min(height[left], height[right]);
      int volume = min * (right - left);
      max = Math.max(max, volume);

      while (height[left] <= min && left < right) {
        left++;
      }
      while (height[right] <= min && left < right) {
        right--;
      }
    }
    return max;
  }
}
// @lc code=end
