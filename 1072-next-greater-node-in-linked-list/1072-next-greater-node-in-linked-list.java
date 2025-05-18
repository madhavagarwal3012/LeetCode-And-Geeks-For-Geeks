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
    public int[] nextLargerNodes(ListNode head) {
        ListNode tail = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(tail != null){
            list.add(tail.val);
            tail = tail.next;
        }
        int size = list.size();
        int[] arr = new int[size];
        
        for (int index = 0; index < size; index++) {
            int currentValue = list.get(index);
            arr[index] = 0;
            for (int nextIndex = index + 1; nextIndex < size; nextIndex++) {
                if (list.get(nextIndex) > currentValue) {
                    arr[index] = list.get(nextIndex);
                    break;
                }
            }
        }
        return arr;
    }
}