import java.util.LinkedList;
import java.util.Queue;

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

    Queue<QueueNode> queue = new LinkedList<>();
    queue.offer(new QueueNode(root, 1));
    while (!queue.isEmpty()) {
      QueueNode queueNode = queue.poll();
      int depth = queueNode.depth;
      TreeNode node = queueNode.node;
      if (node.left == null && node.right == null) {
        return depth;
      }
      if (node.left != null) {
        queue.offer(new QueueNode(node.left, depth + 1));
      }
      if (node.right != null) {
        queue.offer(new QueueNode(node.right, depth + 1));
      }
    }

    return 0;
  }
}

class QueueNode {
  public TreeNode node;
  public int depth;

  public QueueNode(TreeNode node, int depth) {
    this.node = node;
    this.depth = depth;
  }
}
// @lc code=end
