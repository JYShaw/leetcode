import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1706 lang=java
 *
 * [1706] 球会落何处
 */

// @lc code=start
class Solution {
    private int[][] board;
    private int rowNum;
    private int colNum;

    public int[] findBall(int[][] grid) {
        board = grid;
        rowNum = grid.length;
        colNum = grid[0].length;
        int[] ret = new int[colNum];
        Arrays.fill(ret, -1);
        for (int i = 0; i < colNum; i++) {
            ret[i] = helper(0, i);
        }
        return ret;
    }

    private int helper(int row, int col) {
        int nextCol = -1;
        while (row < rowNum) {
            nextCol = col + board[row][col];
            if (nextCol < 0 || nextCol >= colNum) {
                return -1;
            }
            if (board[row][col] != board[row][nextCol]) {
                return -1;
            }
            col = nextCol;
            row++;
        }
        return nextCol;
    }
}

// @lc code=end
