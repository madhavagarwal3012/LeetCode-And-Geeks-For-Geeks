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
    public static int [] rightRotation(ArrayList<Integer> nums, int R){
		int size = nums.size();
        R = R % size; 
        int[] rotatedArray = new int[size];
        
        for (int index = 0; index < size; index++) {
            int rightPointer = (index + R) % size;
            rotatedArray[rightPointer] = nums.get(index);
        }
		return rotatedArray;
	}
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ArrayList<Integer>list =  new ArrayList<>();
        ListNode tail = head;
        while(tail != null){
            list.add(tail.val);
            tail = tail.next;
        }

        int rotatedArray[] = new int[list.size()];
        rotatedArray = rightRotation(list, k);
        tail = head;
        for(int index = 0; index < rotatedArray.length; index++){
            tail.val = rotatedArray[index];
            tail = tail.next;
        }
        list = null;
        rotatedArray = null;
        return head;
    }
}