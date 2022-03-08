import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Deque<Node> s;

    public MinStack() {
        s = new ArrayDeque<>();
    }

    public void push(int val) {
        if (s.isEmpty()) {
            s.offerLast(new Node(val, val));
        } else {
            s.offerLast(new Node(val, Math.min(val, s.peek().min)));
        }
    }

    public void pop() {
        s.pollFirst();
    }

    public int top() {
        return s.peek().val;
    }

    public int getMin() {
        return s.peek().min;
    }
}

class Node {
    Integer val;
    Integer min;

    public Node() {
    };

    public Node(Integer val, Integer min) {
        this.val = val;
        this.min = min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end
