import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {

  private List<Integer> ret = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    recursionTraversal(root);
    return ret;
  }

  private void recursionTraversal(TreeNode node) {
    if (node != null) {
      recursionTraversal(node.left);
      ret.add(node.val);
      recursionTraversal(node.right);
    }
  }
}
// @lc code=end
