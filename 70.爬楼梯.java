/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {

  public int climbStairs(int n) {
    if (n < 2) {
      return 1;
    }
    int p = 1;
    int q = 1;
    int r = 1;
    for (int i = 2; i <= n; i++) {
      r = p + q;
      p = q;
      q = r;
    }
    return r;
  }
}
// @lc code=end
