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
    public ListNode removeNodes(ListNode head) {
        ArrayList<ListNode> currentList = new ArrayList<>();
        ListNode tail = head;

        while(tail != null){
            currentList.add(tail);
            tail = tail.next;
        }

        int maximumValue = Integer.MIN_VALUE;
        for(int index = currentList.size() - 1; index >= 0; index--){
            if(currentList.get(index).val >= maximumValue){
                maximumValue = currentList.get(index).val;
            }
            else{
                currentList.remove(index);
            }
        }
        if(currentList.size() > 0){
            head = currentList.get(0);
            tail = head;
        }
        for(int index = 1; index < currentList.size(); index++){
            tail.next = currentList.get(index);
            tail = tail.next;
        }
        if(tail != null){
            tail.next = null;
        }
        return head;
    }
}