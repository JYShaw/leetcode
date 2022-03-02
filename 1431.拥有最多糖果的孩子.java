import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1431 lang=java
 *
 * [1431] 拥有最多糖果的孩子
 */

// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        List<Boolean> ret = new ArrayList<>(candies.length);

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                ret.add(true);
            } else {
                ret.add(false);
            }
        }
        return ret;
    }
}
// @lc code=end
