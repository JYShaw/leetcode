/*
 * @lc app=leetcode.cn id=318 lang=java
 *
 * [318] 最大单词长度乘积
 */

// @lc code=start
class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        var masks = new int[len];
        var lens = new int[len];
        for (int i = 0; i < len; i++) {
            lens[i] = words[i].length();
            for (int j = 0; j < words[i].length(); j++) {
                masks[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }

        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    int mul = lens[i] * lens[j];
                    max = Math.max(mul, max);
                }
            }
        }
        return max;
    }

}
// @lc code=end
