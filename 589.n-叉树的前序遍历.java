import java.util.List;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N 叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ret = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return ret;
    }

    public void helper(Node node) {
        if (node == null) {
            return;
        }
        ret.add(node.val);
        for(var child : node.children){
            helper(child);
        }
    }
}
// @lc code=end
