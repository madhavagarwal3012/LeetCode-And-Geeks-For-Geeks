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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        int nodePosition = 1;
        ListNode currentNode = head;
        ListNode nextNode = currentNode.next;
        ListNode alternateConnectNode = null;

        ListNode nextHead = nextNode;

        while(currentNode != null && nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = currentNode;
            currentNode.next = temp;
            if(alternateConnectNode != null){
                alternateConnectNode.next = nextNode;
            }
            alternateConnectNode = currentNode;
            currentNode = currentNode.next;
            if(currentNode != null){
                nextNode = currentNode.next;
            }
        }
        if(nextHead != null){
            head = nextHead;
        }
        return head;
    }
}