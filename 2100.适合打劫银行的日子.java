import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=2100 lang=java
 *
 * [2100] 适合打劫银行的日子
 */

// @lc code=start
class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ret = new ArrayList<>();

        var len = security.length;

        var left = new int[len];
        var right = new int[len];

        for (int i = 1; i < len; i++) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
            if (security[len - i - 1] <= security[len - i]) {
                right[len - i - 1] = right[len - i] + 1;
            }
        }

        for (int i = time; i < len - time; i++) {
            if (left[i] >= time && right[i] >= time) {
                ret.add(i);
            }
        }

        return ret;
    }
}
// @lc code=end
