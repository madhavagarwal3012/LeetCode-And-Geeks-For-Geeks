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
    public ListNode insertionSortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode tail = head;
        int index = 0;
        while(tail != null){
            list.add(tail);
            tail = tail.next;
            list.get(index).next = null;
            index++;

        }
        for(index = 0; index < list.size(); index++){
            int tempIndex = index - 1;
            while(tempIndex >= 0){
                if(list.get(index).val < list.get(tempIndex). val){
                    ListNode tempNode = list.get(index);
                    list.set(index, list.get(tempIndex));
                    list.set(tempIndex, tempNode);
                    index = tempIndex--;
                }
                else{
                    break;
                }
            }
        }
        tail = null;
        head = null;
        if(list.size() > 0){
            head = list.get(0);
            tail = head;
        }
        for(index = 1; index < list.size(); index++){
            tail.next = list.get(index);
            tail = tail.next;
        }
        return head;
    }
}