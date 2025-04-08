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
    public ListNode swapPairs(ListNode head) {
        ArrayList<ListNode> referencesList = new ArrayList<>();
        ListNode tail = head;
        while(tail != null){
            referencesList.add(tail);
            tail = tail.next;
        }
        for(int index = 0; index < referencesList.size() - 1; index+=2){
            ListNode temp = referencesList.get(index + 1).next;
            referencesList.get(index + 1).next = referencesList.get(index);
            referencesList.get(index).next = temp;
            if(index > 1){
                referencesList.get(index - 2).next = referencesList.get(index + 1);
            }
        }
        if(referencesList.size() > 1){
            head = referencesList.get(1);
        }
        return head;
    }
}