/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {

  public int romanToInt(String s) {
    int number = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      switch (c) {
        case 'I':
          number += 1;
          break;
        case 'V':
          if (i != 0 && s.charAt(i - 1) == 'I') {
            number += 4;
            i--;
          } else {
            number += 5;
          }
          break;
        case 'X':
          if (i != 0 && s.charAt(i - 1) == 'I') {
            number += 9;
            i--;
          } else {
            number += 10;
          }
          break;
        case 'L':
          if (i != 0 && s.charAt(i - 1) == 'X') {
            number += 40;
            i--;
          } else {
            number += 50;
          }
          break;
        case 'C':
          if (i != 0 && s.charAt(i - 1) == 'X') {
            number += 90;
            i--;
          } else {
            number += 100;
          }
          break;
        case 'D':
          if (i != 0 && s.charAt(i - 1) == 'C') {
            number += 400;
            i--;
          } else {
            number += 500;
          }
          break;
        case 'M':
          if (i != 0 && s.charAt(i - 1) == 'C') {
            number += 900;
            i--;
          } else {
            number += 1000;
          }
          break;
      }
    }
    return number;
  }
}
// @lc code=end
