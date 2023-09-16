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
  public ListNode deleteMiddle(ListNode head) {
    ListNode fh = new ListNode(-1, head), fast;
    
    for(fast = head = fh; fast.next != null && (fast = fast.next.next) != null; ) head = head.next;
    head.next = head.next.next;
    
    return fh.next;
  }
}