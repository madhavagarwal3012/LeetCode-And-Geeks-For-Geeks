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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = null;
        ListNode evenHead = null;
        
        ListNode oddTail = null;
        ListNode evenTail = null;
        
        ListNode tail = head;
        
        int countIndex  = 1;
        while(tail != null){
            ListNode next = tail.next;
            if(countIndex % 2 == 1){
                if(oddTail == null){
                    oddHead = tail;
                    oddTail = tail;
                    tail.next = null;
                }
                else{
                    oddTail.next = tail;
                    if(oddTail.next != null){
                        oddTail = oddTail.next;
                    }
                    tail.next = null;
                }
            }
            else{
                if(evenTail == null){
                    evenHead = tail;
                    evenTail = tail;
                    tail.next = null;
                }
                else{
                    evenTail.next = tail;
                    if(evenTail.next != null){
                        evenTail = evenTail.next;
                    }
                    tail.next = null;
                }
            }
            countIndex++;
            tail = next;
        }
        if(oddHead != null){
            head = oddHead;
            oddTail.next = evenHead;
        }
        return head;
    }
}