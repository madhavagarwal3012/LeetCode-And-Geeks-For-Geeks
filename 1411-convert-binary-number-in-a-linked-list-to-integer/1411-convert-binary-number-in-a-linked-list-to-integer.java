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
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryNumber = new StringBuilder();

        while(head != null){
            binaryNumber.append(String.valueOf(head.val));
            head = head.next;
        }

        return Integer.parseInt(binaryNumber.toString(), 2);
    }
}