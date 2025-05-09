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
    public ListNode doubleIt(ListNode head) {
        ArrayList<ListNode> number = new ArrayList<>();
        ListNode tail = head;

        while(tail != null){
            number.add(tail);
            tail = tail.next;
        }
        int carry = 0;
        for(int index = number.size() - 1; index > 0; index--){
            int value = number.get(index).val * 2 + carry;
            number.get(index).val = value % 10;
            carry = value / 10;
        }
        int value = number.get(0).val * 2 + carry;
        if(value > 9){
            ListNode newNode = new ListNode(value / 10);
            number.get(0).val = value % 10;
            number.add(0, newNode);
        }
        else{
            number.get(0).val = value;
        }
        head = number.get(0);
        tail = head;
        
        for(int index = 0; index < number.size(); index++){
            tail.next = number.get(index);
            tail = tail.next;
        }
        if(tail != null){
            tail.next = null;
        }
        return head;
    }
}