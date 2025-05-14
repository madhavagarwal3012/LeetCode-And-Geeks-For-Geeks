/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode tail = head;

        while(tail != null){
            if(!set.contains(tail)){
                set.add(tail);
            }
            else{
                return true;
            }
            tail = tail.next;
        }
        return false;
    }
}