/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        var numArr = String.valueOf(num).toCharArray();
        int sum = 0;
        while (numArr.length != 1) {
            for (var n : numArr) {
                sum += n - '0';
            }
            numArr = String.valueOf(sum).toCharArray();
            sum = 0;
        }
        return numArr[0] - '0';
    }

}

// @lc code=end
