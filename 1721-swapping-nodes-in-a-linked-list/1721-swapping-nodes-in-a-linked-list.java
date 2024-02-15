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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tail=head;
        ListNode beginningNode=head;
        int count=1;
        int value;
        
        while(tail!=null){
            if(count==k){
                beginningNode=tail;
            }
            count++;
            tail=tail.next;
        }
        count=count-1;
        k=count-(k-1);
        count=1;
        tail=head;
        while(tail!=null){
            if(count==k){
                value=tail.val;
                tail.val=beginningNode.val;
                beginningNode.val=value;
                break;
            }
            count++;
            tail=tail.next;
        }
        return head;
    }
}