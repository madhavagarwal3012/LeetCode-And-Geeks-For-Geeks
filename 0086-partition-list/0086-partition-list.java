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
    public ListNode partition(ListNode head, int x) {
        ArrayList<ListNode> listSmallerThanX = new ArrayList<>();
        ArrayList<ListNode> listGreaterThanEqualToX = new ArrayList<>();

        ListNode tail = head;
        while(tail != null){
            if(tail.val < x){
                listSmallerThanX.add(tail);
            }
            else{
                listGreaterThanEqualToX.add(tail);
            }
            tail = tail.next;
        }
        head = null;
        tail = null;
        if(listSmallerThanX.size() > 0){
            head = listSmallerThanX.get(0);
            tail = head;
        }
        for(int index = 1; index < listSmallerThanX.size(); index++){
            tail.next = listSmallerThanX.get(index);
            tail = tail.next;
        }
        int indexCheck = 0;
        if(head == null && listGreaterThanEqualToX.size() > 0){
            head = listGreaterThanEqualToX.get(0);
            tail = head;
            indexCheck++;
        }
        for(int index = indexCheck; index < listGreaterThanEqualToX.size(); index++){
            tail.next = listGreaterThanEqualToX.get(index);
            tail = tail.next;
        }
        if(tail != null){
            tail.next = null;
        }
        return head;
    }
}