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
    public ListNode sortList(ListNode head) {
        int size = 0;
        ListNode tail = head;
        while(tail != null){
            size++;
            tail = tail.next;
        }
        int array [] = new int[size];
        int index = 0;
        tail = head;
        while(tail != null){
            array[index] = tail.val;
            tail = tail.next;
            index++;
        }
        Arrays.sort(array);
        index = 0;
        tail = head;
        while(tail != null){
            tail.val = array[index];
            tail = tail.next;
            index++;
        }
        return head;
    }
}