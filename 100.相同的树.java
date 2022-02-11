

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
 */

// @lc code=start

// Definition for a binary tree node.


class Solution {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    return sameTree(p, q);
  }

  private boolean sameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return sameTree(p.left, q.left) && sameTree(p.right, q.right);
  }
}
// @lc code=end
