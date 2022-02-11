import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1081 lang=java
 *
 * [1081] 不同字符的最小子序列
 */

// @lc code=start
class Solution {
    public String smallestSubsequence(String s) {
        var charArr = s.toCharArray();
        var charSet = new HashSet<>();
        for (var each : charArr) {
            charSet.add(each);
        }
        charArr = charSet.toArray();
        return null;
    }
}
// @lc code=end
