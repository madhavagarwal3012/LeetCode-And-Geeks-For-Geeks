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
        ArrayList<Integer> sorted = new ArrayList<>();


        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                sorted.add(list1.val);
                list1 = list1.next;
            }
            else{
                sorted.add(list2.val);
                list2 = list2.next;
            }
        }
        while(list1 != null){
            sorted.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            sorted.add(list2.val);
            list2 = list2.next;
        }

        ListNode head = null;
        ListNode tail = null;
        for(int index = 0; index < sorted.size(); index++){
            if(head == null){
                head = new ListNode(sorted.get(index));
                tail = head;
            }
            else{
                tail.next = new ListNode(sorted.get(index));
                tail = tail.next;
            }
        }
        return head;
    }
}