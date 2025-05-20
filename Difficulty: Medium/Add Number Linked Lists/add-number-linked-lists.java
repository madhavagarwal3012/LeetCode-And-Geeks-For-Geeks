/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverseList(Node head){
        if(head == null){
            return null;
        }
        
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = currentNode.next;
        
        while(currentNode != null){
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }
        return previousNode;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        num1 = reverseList(num1);
        num2= reverseList(num2);
        
        Node sumListHead = null;
        Node sumListTail = null;
        
        Node tail1 = num1;
        Node tail2 = num2;
        int carry = 0;
        int sumValue = 0;
        
        while(tail1 != null && tail2 != null){
            sumValue = tail1.data + tail2.data + carry;
            if(sumValue > 9){
                if(sumListHead == null){
                    sumListHead = new Node(sumValue % 10);
                    sumListTail = sumListHead;
                }
                else{
                    sumListTail.next = new Node(sumValue % 10);
                    sumListTail = sumListTail.next;
                }
                carry = sumValue/=10;
            }
            else{
                if(sumListHead == null){
                    sumListHead = new Node(sumValue % 10);
                    sumListTail = sumListHead;
                }
                else{
                    sumListTail.next = new Node(sumValue % 10);
                    sumListTail = sumListTail.next;
                }
                carry = 0;
            }
            tail1 = tail1.next;
            tail2 = tail2.next;
        }
        while(tail1 != null){
            sumValue = tail1.data + carry;
            if(sumValue > 9){
                sumListTail.next = new Node(sumValue % 10);
                sumListTail = sumListTail.next;
                carry = sumValue/=10;
            }
            else{
                sumListTail.next = new Node(sumValue);
                sumListTail = sumListTail.next;
                sumListTail.next = tail1.next;
                carry = 0;
                break;
            }
            tail1 = tail1.next;
        }
        while(tail2 != null){
            sumValue = tail2.data + carry;
            if(sumValue > 9){
                sumListTail.next = new Node(sumValue % 10);
                sumListTail = sumListTail.next;
                carry = sumValue/=10;
            }
            else{
                sumListTail.next = new Node(sumValue);
                sumListTail = sumListTail.next;
                sumListTail.next = tail2.next;
                carry = 0;
                break;
            }
            tail2 = tail2.next;
        }
        if(carry != 0){
            sumListTail.next = new Node(carry);
            sumListTail = sumListTail.next;
            carry = 0;
        }
        sumListHead = reverseList(sumListHead);
        Node tail3 = sumListHead;
        while(tail3 != null && tail3.data == 0){
            tail3 = tail3.next;
        }
        sumListHead = tail3;
        return sumListHead;
    }
}