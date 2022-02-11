/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    // public int[] plusOne(int[] digits) {
    // List<Integer> list =
    // Arrays.stream(digits).boxed().collect(Collectors.toList());
    // boolean carry = true;
    // int i = list.size() - 1;
    // while (carry) {
    // if (list.get(i) == 9) {
    // list.set(i, 0);
    // if (i == 0) {
    // list.add(0, 1);
    // break;
    // }
    // } else {
    // list.set(i, list.get(i) + 1);
    // carry = false;
    // }
    // i--;
    // }
    // return list.stream().mapToInt(Integer::intValue).toArray();
    // }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
// @lc code=end
