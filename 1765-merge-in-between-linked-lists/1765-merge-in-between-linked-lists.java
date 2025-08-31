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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int nodeIndex = 0;
        int removalNodeCount = b - a + 1;
        ListNode tail = list1;
        while(tail != null){
            if(nodeIndex + 1 == a){
                break;
            }
            tail = tail.next;
            nodeIndex++;
        }
        ListNode tail2 = null;
        if(tail != null){
            tail2 = tail.next;
            tail.next = list2;
            tail = tail.next;
            while(tail.next != null){
                tail = tail.next;
            }
            while(removalNodeCount > 0){
                tail2 = tail2.next;
                removalNodeCount--;
            }
            tail.next = tail2;
            return list1;
        }
        return list2;
    }
}