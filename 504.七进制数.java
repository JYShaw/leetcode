/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        // 判断特殊情况
        if (num == 0) {
            return "0";
        }
        var sb = new StringBuilder();
        // int是否为负数，如果为负数，则取反运算，最后加上负号
        var flag = false;
        if (num < 0) {
            flag = true;
            num = -num;
        }

        // 首先对base取余数，结果放入队列中，然后再除以base，循环往复直至num == 0
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }

        // 负数添加负号
        if (flag) {
            sb.append('-');
        }
        // 反转即为所求
        return sb.reverse().toString();
    }
}
// @lc code=end
