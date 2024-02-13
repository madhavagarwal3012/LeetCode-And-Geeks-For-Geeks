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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode reverse = null;
        ListNode reverseStore = null;
        ListNode tail = head;
        int count = 0;
        int equalElement = 0;
        
        while(tail!=null){
            tail = tail.next;
            count++;
        }
        while(equalElement<count/2){
            reverse = new ListNode(head.val);
            if(equalElement==0){
                reverseStore=reverse;
                reverse.next=null;              //Storing the reverse of the half linked list 
            }
            reverse.next=reverseStore;         //Example: for testcase [1,2,2,1],It will store 
            reverseStore=reverse;             //its first half as [2,1] same a second half 
            head=head.next;       
            equalElement++;
        }
        if (count%2!=0 && equalElement==count/2) {
            head=head.next;
        }
        reverse=reverseStore;
        equalElement=0;
        while(head!=null){
            if(reverse.val==head.val){
                equalElement++;
            }
            reverse=reverse.next;
            head=head.next;
        }
        if(equalElement==count/2){
            return true;
        }
        else{
            return false;
        }
    }
}