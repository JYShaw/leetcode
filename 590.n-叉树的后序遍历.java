import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N 叉树的后序遍历
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

    public List<Integer> postorder(Node root) {
        helper(root);
        return ret;
    }

    private void helper(Node node) {
        if (node == null) {
            return;
        }
        for (var child : node.children) {
            helper(child);
        }
        ret.add(node.val);
    }
}
// @lc code=end
