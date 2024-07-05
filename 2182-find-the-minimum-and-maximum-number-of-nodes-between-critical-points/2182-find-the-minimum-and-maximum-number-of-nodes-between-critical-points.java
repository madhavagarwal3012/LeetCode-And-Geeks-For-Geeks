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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> indexlistMaximaMinima = new ArrayList<>();

        int array [] = {-1, -1};
        int minimumDistance = Integer.MAX_VALUE;
        int maximumDistance = Integer.MIN_VALUE;
        int nodeCount = 1;

        ListNode previousNode = head;
        ListNode currentNode = head.next;
        ListNode nextNode = null;
        if(currentNode.next != null){
            nextNode = currentNode.next;
        }

        while(nextNode != null){
            if(previousNode.val < currentNode.val && nextNode.val < currentNode.val){
                indexlistMaximaMinima.add(nodeCount);
            }
            else if(previousNode.val >currentNode.val && nextNode.val > currentNode.val){
                indexlistMaximaMinima.add(nodeCount);
            }
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
            nodeCount++;
        }
        int indexArray [] = new int[indexlistMaximaMinima.size()];
        for(int index = 0; index < indexlistMaximaMinima.size(); index++){
            indexArray[index] = indexlistMaximaMinima.get(index);
        }
        Arrays.sort(indexArray);

        if(indexArray.length < 2){
            return array;
        }
        else if(indexArray.length == 2 ){
            array[0] = indexArray[1] - indexArray[0];
            array[1] = indexArray[1] - indexArray[0];
        }
        else {
            for (int i = 1; i < indexArray.length; i++) {
            minimumDistance = Math.min(minimumDistance, indexArray[i] - indexArray[i-1]);
            }
            array[0] = minimumDistance;
            array[1] = indexArray[indexArray.length - 1] - indexArray[0];
        }
        return array;
    }
}