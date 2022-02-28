import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=804 lang=java
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {
    private String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseSet = new HashSet<>();
        if (words.length == 1) {
            return 1;
        }
        int count = 0;
        var sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                sb.append(morse[(int) chars[j] - 97]);
            }
            var morseCode = sb.toString();
            if (!morseSet.contains(morseCode)) {
                count++;
                morseSet.add(morseCode);
            }
            sb.setLength(0);
        }
        return count;
    }
}
// @lc code=end
