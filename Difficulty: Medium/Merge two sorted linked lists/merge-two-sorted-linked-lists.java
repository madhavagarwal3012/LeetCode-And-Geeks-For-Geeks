/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node sortedHead = null;
        Node sortedTail = null;
        if(head1.data < head2.data){
            sortedHead = head1;
            sortedTail = head1;
            head1 = head1.next;
        }
        else{
            sortedHead = head2;
            sortedTail = head2;
            head2 = head2.next;
        }
        Node tail1 = head1;
        Node tail2 = head2;
        
        while(tail1 != null && tail2 != null){
            if(tail1.data < tail2.data){
                sortedTail.next = tail1;
                sortedTail = sortedTail.next;
                
                tail1 = tail1.next;
                sortedTail.next = null;
            }
            else{
                sortedTail.next = tail2;
                sortedTail = sortedTail.next;
                
                tail2 = tail2.next;
                sortedTail.next = null;
            }
        }
        if(tail1 != null){
            sortedTail.next = tail1;
        }
        else if(tail2 != null){
            sortedTail.next = tail2;
        }
        return sortedHead;
    }
}
