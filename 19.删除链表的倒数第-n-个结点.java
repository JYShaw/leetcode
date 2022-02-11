/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummyHead = new ListNode(-1, head);
    ListNode node = dummyHead;
    ListNode prev = dummyHead;
    int i = 0;
    while (node != null) {
      node = node.next;
      if (i > n) {
        prev = prev.next;
      }
      i++;
    }
    prev.next = prev.next.next;
    return dummyHead.next;
  }
}
// @lc code=end
