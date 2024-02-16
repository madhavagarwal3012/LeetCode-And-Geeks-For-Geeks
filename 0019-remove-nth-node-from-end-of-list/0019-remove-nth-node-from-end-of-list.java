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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        ListNode prev = tail;
        int count=1;
        
        while(tail!=null){
            count++;
            tail=tail.next;
        }
        count=count-1;
        if(n==count){
            return head.next;
        }
        else if(count>2){                               //For Linked List Length>2
          n=count-(n-1); 
        }     
        else if(count==2){                              //For Linked List Length<2
          if(n==1){
              head.next=null;
              return head;
          }
          return head.next;
        }
        else{
            return head;
        }
        count=1;
        tail=head;
        while(tail!=null){
            if(count==n){
                prev.next=tail.next;
                break;
            }
            count++;
            prev=tail;
            tail=tail.next;
        }
        return head;
    }
}