
/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    int minDepth = Integer.MAX_VALUE;
    if (root.left != null) {
      minDepth = Math.min(minDepth(root.left), minDepth);

    }
    if (root.right != null) {
      minDepth = Math.min(minDepth(root.right), minDepth);
    }
    return minDepth + 1;
  }

}
// @lc code=end
