/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }
    if (x % 10 == 0) {
      return false;
    }
    int revert = 0;
    while (x > revert) {
      revert = revert * 10 + x % 10;
      x /= 10;
    }
    return x == revert || x == revert / 10;
  }
}
// @lc code=end
