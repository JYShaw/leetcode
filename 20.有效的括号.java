import java.util.Stack;
/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        char[] chars = s.toCharArray();
        char top;
        try {
            for (var c : chars) {
                switch (c) {
                case '(':
                    bracketStack.push(c);
                    break;
                case ')':
                    top = bracketStack.pop();
                    if (top != '(') {
                        return false;
                    }
                    break;
                case '{':
                    bracketStack.push(c);
                    break;
                case '}':
                    top = bracketStack.pop();
                    if (top != '{') {
                        return false;
                    }
                    break;
                case '[':
                    bracketStack.push(c);
                    break;
                case ']':
                    top = bracketStack.pop();
                    if (top != '[') {
                        return false;
                    }
                    break;
                default:
                    break;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return bracketStack.empty();
    }
}
// @lc code=end
