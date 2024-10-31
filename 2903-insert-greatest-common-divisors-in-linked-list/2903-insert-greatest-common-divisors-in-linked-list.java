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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentHead = head;
        while(head.next != null){
            int gcd = 0;

            for(int numCount = 1; numCount <= Math.min(head.val, head.next.val); numCount++){
                if(head.val % numCount == 0 && head.next.val % numCount == 0){
                    gcd = numCount;
                }
            }
            ListNode tail = head;
            ListNode newNode = new ListNode(gcd);
            head = head.next;

            tail.next = newNode;
            newNode.next = head;
        }
        return currentHead;
    }
}