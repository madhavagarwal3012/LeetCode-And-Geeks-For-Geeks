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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tail = head;
        ListNode previousNode = null;
        
        while(tail!=null){
            if(head!=null && head.val==val){
                head=head.next;
                tail=head;
            }
            else if(tail.val==val){
                previousNode.next=tail.next;
                tail=previousNode.next;
            }
            else{
                previousNode=tail;
                tail=tail.next;
            }
        }
        return head;
    }
}