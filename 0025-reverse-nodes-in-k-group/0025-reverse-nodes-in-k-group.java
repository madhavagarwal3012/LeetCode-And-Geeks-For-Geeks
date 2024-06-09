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
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null || k <= 1) {
            return head;
        }
        
        ListNode connector = head;
        ListNode prev = null;
        ListNode nextNode = null;
        int count = 0;

        while(count < k && connector != null){
            connector = connector.next;
            count++;
        }
        if(count != k){
            return head;
        }
        else{
            count = 0;
            connector = head;
        }

        while (count < k && connector != null) {
            nextNode = connector.next;
            connector.next = prev;
            prev = connector;
            connector = nextNode;
            count++;
        }

        
        if (nextNode != null) {
            head.next = reverseKGroup(nextNode, k);
        }

        return prev;
    }
}