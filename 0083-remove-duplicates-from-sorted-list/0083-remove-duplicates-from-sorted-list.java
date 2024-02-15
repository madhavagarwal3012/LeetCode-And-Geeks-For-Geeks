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
        ListNode previousNode = head;
        ListNode headStore=head;
        
        int duplicate;
        while(head!=null){
            duplicate = head.val;
            previousNode=head;
            tail=head.next;
            while(tail!=null){
                if(duplicate==tail.val){
                    previousNode.next=tail.next;
                }
                else{
                    previousNode=tail;
                }
                tail=tail.next;
            } 
            head=head.next;
            if(head!=null){
                duplicate=head.val;
            }
        }
        return  headStore;
    }
}