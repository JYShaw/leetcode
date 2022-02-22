/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while ((!Character.isLetterOrDigit(chars[left])) && left < right) {
                left++;
            }
            while ((!Character.isLetterOrDigit(chars[right])) && right > left) {
                right--;
            }
            if (Character.toLowerCase(chars[left]) == Character.toLowerCase(chars[right])) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
