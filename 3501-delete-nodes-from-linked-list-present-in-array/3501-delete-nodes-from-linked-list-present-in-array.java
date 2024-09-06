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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], true);
            }
        }
        ListNode newListHead = null;
        ListNode newListTail = null;
        ListNode tail = head;
        
        while(tail != null){
            if(!map.containsKey(tail.val) && newListHead == null){
                newListHead = tail;
                newListTail = newListHead;

                tail = tail.next;
                newListHead.next = null;
            }
            else if(!map.containsKey(tail.val)){
                newListTail.next = tail;
                newListTail = newListTail.next;

                tail = tail.next;
                newListTail.next = null;

            }
            else{
                tail = tail.next;
            }
        }
        return newListHead;
    }
}