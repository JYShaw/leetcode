import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            while ((!Character.isLetter(charArr[left])) && left < right) {
                left++;
            }
            while ((!Character.isLetter(charArr[right])) && right > left) {
                right--;
            }
            if (left >= right) {
                break;
            }
            char tmp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = tmp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}

// @lc code=end
