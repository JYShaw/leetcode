import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
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
    public String tree2str(TreeNode root) {
        var sb = new StringBuilder();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            sb.append("");
        } else if (root.left != null && root.right != null) {
            sb.append("(").append(tree2str(root.left)).append(")").append("(").append(tree2str(root.right)).append(")");
        } else if (root.left != null) {
            sb.append("(").append(tree2str(root.left)).append(")");
        } else if (root.right != null) {
            sb.append("()(").append(tree2str(root.right)).append(")");
        }
        return sb.toString();
    }
}
// @lc code=end
