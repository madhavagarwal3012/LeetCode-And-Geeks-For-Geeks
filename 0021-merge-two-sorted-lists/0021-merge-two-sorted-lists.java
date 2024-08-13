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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<ListNode> sorted = new ArrayList<>();

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                sorted.add(list1);
                list1 = list1.next;
            }
            else{
                sorted.add(list2);
                list2 = list2.next;
            }
        }
        while(list1 != null){
            sorted.add(list1);
            list1 = list1.next;
        }
        while(list2 != null){
            sorted.add(list2);
            list2 = list2.next;
        }

        ListNode head = null;
        ListNode tail = null;
        for(int index = 0; index < sorted.size(); index++){
            if(head == null){
                head = sorted.get(index);
                tail = head;
                sorted.set(index, null);
            }
            else{
                tail.next = sorted.get(index);
                tail = tail.next;
                sorted.set(index, null);
            }
        }
        return head;
    }
}