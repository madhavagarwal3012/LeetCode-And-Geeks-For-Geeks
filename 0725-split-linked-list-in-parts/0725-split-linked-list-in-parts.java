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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        ListNode tail = head;
        int listSize = 0;
        while(tail != null){
            listSize++;
            tail = tail.next;
        }
        if(k > listSize){
            tail = head;

            for(int index = 0; index < listSize; index++){
                arr[index] = tail;
                tail = tail.next;
                arr[index].next = null;
            }
            k-=listSize;
            int index = listSize;
            while(k > 0){
                arr[index] = null;
                index++;
                k--;
            }
        }
        else{
            int remainder = listSize % k;
            int equalParts = (listSize - remainder) / k;
            int partCount = 0;
            int index = 0;
            tail = head;
            ListNode partHead = new ListNode();
            ListNode partTail = new ListNode();
            while(index < arr.length){
                if(partCount < equalParts){
                    if(partCount == 0){
                        partHead = tail;
                        partTail = tail;
                    }
                    else{
                        partTail.next = tail;
                        partTail = partTail.next;
                    }
                    tail = tail.next;
                    partCount++;
                    if(partCount == equalParts){
                        if(remainder == 0){
                            arr[index] = partHead;
                            partTail.next = null;
                            partHead = new ListNode();
                            partTail = new ListNode();

                            index++;
                            partCount = 0;
                        }
                    }
                }
                else if(remainder > 0){
                    partTail.next = tail;
                    partTail = partTail.next;
                    tail = tail.next;

                    arr[index] = partHead;
                    partTail.next = null;
                    partHead = new ListNode();
                    partTail = new ListNode();

                    remainder--;
                    index++;
                    partCount = 0;

                }
            }
        }
        return arr;
    }
}