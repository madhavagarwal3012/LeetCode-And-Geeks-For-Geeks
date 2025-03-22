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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tail = head;
        ListNode prev = null;
        while(tail != null && tail.next != null){
            if(tail.val != tail.next.val){
                prev = tail;
            }
            else{
                while(tail != null && tail.next != null && tail.val == tail.next.val){
                    tail = tail.next;
                }
            }
            tail = tail.next;
            if(prev != null){
                prev.next = tail;
            }
            else{
                head = tail;
            }
        }
        return head;
    }
}