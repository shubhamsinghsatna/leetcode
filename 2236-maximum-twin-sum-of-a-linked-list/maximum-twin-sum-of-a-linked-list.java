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
    public int pairSum(ListNode head) {

        // Reverse the first half 
        // Keep a pointer at first element and another pointer at (n/2) th element [0-based].
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        // Reverse first half 
        // 3 -> 2 -> 1 -> 4 -> 5 -> 6 -> null
        // First pointer at 3 and second pointer at 4
        // Now we can use slow and fast pointer to get both first and second pointer
        // Keep both slow and fast at head and after each iteration move slow by one and fast by 2 steps
        // It is observered that after iterating the slow points at 4 i.e (n/2)
        // We need to keep track of 1 2 3 as we want to reverse it
        // So we take another pointer pointing to null initially and keep the record of previous node
        // Now we can reverse it.

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse from prev pointer

        ListNode rev = null;
        ListNode curr = head;
        while(curr != slow) {
            ListNode temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }

        ListNode back = rev;
        ListNode front = slow;
        int ans = 0;
        while(back != null) {
            ans = Math.max(ans , front.val + back.val);
            front = front.next;
            back = back.next;
        }
        return ans;









        /*

        // This is the naive approach where we clone the list and reverse the cloned list and iterate
        // Only n/2 times (n - count of nodes)

        ListNode curr = head;
        ListNode front = head;
        ListNode dummy = new ListNode();
        ListNode ok = dummy;
        while(curr != null) {
            ok.next = new ListNode(curr.val);
            ok = ok.next;
            curr = curr.next;
        }
        curr = head;
        int timesToIterate = countNodes(curr) >> 1;
        ListNode back = reverse(dummy.next);
        System.out.println(timesToIterate);
        int maximumSum = 0;
        while(timesToIterate --> 0) {
            int currSum = front.val + back.val;
            maximumSum = Math.max(maximumSum , currSum);
            front = front.next;
            back = back.next;
        }
        return maximumSum;
        */
    }
    static int countNodes(ListNode head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}