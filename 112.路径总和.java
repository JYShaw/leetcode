/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return helper(root, 0, targetSum);
    }

    public boolean helper(TreeNode node, int sum, int targetSum) {
        if (node == null) {
            return false;
        }
        sum += node.val;
        if (node.left == null && node.right == null) {
            return sum == targetSum;
        }
        return helper(node.left, sum, targetSum) || helper(node.right, sum, targetSum);
    }
}
// @lc code=end
