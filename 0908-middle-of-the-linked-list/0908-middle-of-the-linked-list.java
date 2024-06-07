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
    public ListNode middleNode(ListNode head) {
        ListNode tail = head;
        int count=1,mid;
        
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        if(count%2==1){
            mid=(count+1)/2;
        }
        else{
            mid=(count+2)/2;
        }
        count=1;
        while(head!=null){
            if(count==mid){
                tail=head;
                return tail;
            }
            count++;
            head=head.next;
        }
        return head;
    }
}