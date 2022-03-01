/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    private char[][] grid;
    int row, col, cycle, len;

    public String convert(String s, int numRows) {
        len = s.length();
        row = numRows;

        if (row == 1 || row > len) {
            return s;
        }

        cycle = 2 * row - 2;
        col = (len + cycle - 1) / cycle * (row - 1);

        grid = new char[row][col];

        generateGrid(s);
        var sb = new StringBuilder(s.length());
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {
                    sb.append(grid[i][j]);
                }
            }
        }
        return sb.toString();
    }

    private void generateGrid(String s) {
        for (int i = 0, r = 0, c = 0; i < len; i++) {
            grid[r][c] = s.charAt(i);
            if (i % cycle < row - 1) {
                r++;
            } else {
                r--;
                c++;
            }
        }
    }
}
// @lc code=end
