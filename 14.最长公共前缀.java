/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 1) {
      return strs[0];
    }
    String comm = "";
    comm = commonPrefix(strs[0], strs[1]);
    for (int i = 2; i <= strs.length - 1; i++) {
      comm = commonPrefix(comm, strs[i]);
    }
    return comm;
  }

  private String commonPrefix(String a, String b) {
    int len = 0;
    for (int i = 0; i <= a.length() - 1 && i <= b.length() - 1; i++) {
      if (a.charAt(i) == b.charAt(i)) {
        len++;
      } else {
        break;
      }
    }
    return a.substring(0, len);
  }
}
// @lc code=end
