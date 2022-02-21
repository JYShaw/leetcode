import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>(numRows);
        ret.add(new ArrayList<Integer>() {
            {
                add(1);
            }
        });

        if (numRows == 1) {
            return ret;
        }

        ret.add(new ArrayList<Integer>() {
            {
                add(1);
                add(1);
            }
        });

        for (int i = 3; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList<>(i);
            List<Integer> upper = ret.get(i - 2);
            tmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                tmp.add(upper.get(j - 1) + upper.get(j));
            }
            tmp.add(1);
            ret.add(tmp);
        }

        return ret;
    }
}
// @lc code=end
