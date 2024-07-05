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
        if(head == null){
            return head;
        }
        else if(head.next == null){
            head = null;
        }
        else if(head.next != null && head.next.next == null){
            head.next = null;
        }
        else{
            ListNode slowPrevious = head;
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slowPrevious = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            slowPrevious.next = slowPrevious.next.next;
            slowPrevious = null;
            slow = null;
            fast = null;
        }
        return head;
    }
}