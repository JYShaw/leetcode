/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {

  public int lengthOfLastWord(String s) {
    s = s.trim();
    char[] arr = s.toCharArray();
    int len = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == ' ') {
        break;
      } else {
        len++;
      }
    }
    return len;
  }
}
// @lc code=end
