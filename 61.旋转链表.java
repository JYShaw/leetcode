/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 特殊情况处理
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        int step = len - k % len;

        if (step == len) {
            return head;
        }

        // 将首尾连接成环
        tail.next = head;

        while (step > 0) {
            tail = tail.next;
            step--;
        }
        // 分裂环
        head = tail.next;
        tail.next = null;
        return head;
    }
}
// @lc code=end
