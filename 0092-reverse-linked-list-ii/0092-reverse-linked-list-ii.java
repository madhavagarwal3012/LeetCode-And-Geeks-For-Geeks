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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tail = null;
        int value1=0,value2=0,count;
        
        while(left<right){
            tail=head;
            count=1;
            while(count<=right){
                if(count==left){
                    if(tail!=null){
                        value1=tail.val;
                    }
                }
                else if(count==right){
                    if(tail!=null){
                        value2=tail.val;
                    }
                }
                if(tail.next!=null){
                    tail=tail.next;
                }
                count++;
            }
            tail=head;
            count=1;
            while(count<=right){
                if(count==left){
                    tail.val=value2;
                }
                else if(count==right){
                    tail.val=value1;
                }
                if(tail.next!=null){
                    tail=tail.next;
                }
                count++;
            }
            left++;
            right--;
        }
        return head;
    }
}