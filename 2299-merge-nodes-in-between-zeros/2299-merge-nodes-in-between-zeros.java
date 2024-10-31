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
    public ListNode mergeNodes(ListNode head) {
        ListNode firstZeroNode = null;
        ListNode secondZeroNode = null;

        ListNode newListHead = null;
        ListNode newListTail = null;

        while(head != null){
            if(head.val == 0){
                if(firstZeroNode == null){
                    firstZeroNode = head;
                }
                else if(secondZeroNode == null){
                    secondZeroNode = head;

                    int sum = 0;
                    ListNode tail = firstZeroNode.next;

                    while(tail != null && tail != secondZeroNode){
                        sum = sum + tail.val;
                        tail = tail.next;
                    }
                    if(newListHead == null){
                        newListHead = new ListNode(sum);
                        newListTail = newListHead;
                    }
                    else{
                        newListTail.next =  new ListNode(sum);
                        newListTail = newListTail.next;
                    }
                    firstZeroNode = secondZeroNode;
                    secondZeroNode = null;
                }
            }
            head = head.next;
        }
        return newListHead;
    }
}