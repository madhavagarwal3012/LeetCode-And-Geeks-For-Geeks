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
    public void reorderList(ListNode head) {
        ListNode tail = head;
        while(tail != null && tail .next != null){
            ListNode prevNode = tail;
            ListNode currentNode = tail.next;
            while(currentNode.next != null){
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = null;
            currentNode.next = tail.next;
            tail.next = currentNode;
            tail = currentNode.next;
        }
    }
}