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
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode nextNode = null;
        if(head!=null){
            if(head.next==null){
                return head;
            }
            tail=head.next;
            if(tail.next==null){
                tail.next=head;
                head.next=null;
                return tail;
            }
            else{
                head.next=null;
                nextNode = tail.next;
            }
            while(nextNode !=null){
                tail.next=head;
                head = tail;
                tail = nextNode;
                nextNode = tail.next;
            }
            tail.next=head;
            return tail;
        }
        return head;
    }
}