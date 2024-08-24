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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> unsortedList = new ArrayList<>();
        for(int index = 0; index < lists.length; index++){
            ListNode head = lists[index];
            while(head != null){
                unsortedList.add(head.val);
                head = head.next;
            }
        }
        int array [] = new int[unsortedList.size()];
        for(int index = 0; index < unsortedList.size(); index++){
            array[index] = unsortedList.get(index);
        }
        Arrays.sort(array);
        ListNode head = null;
        ListNode tail = null;

        for(int index = 0; index < array.length; index++){
            if(head == null){
                head = new ListNode(array[index]);
                tail = head;
            }
            else{
                tail.next = new ListNode(array[index]);
                tail = tail.next;
            }
        }
        return head;
    }
}