//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        ArrayList<Node> list = new ArrayList<>();
        Node tail = head;
        
        while(tail != null){
            list.add(tail);
            tail = tail.next;
        }
        int carry = 1;
        for(int index = list.size() - 1; index >= 0; index--){
            int value = list.get(index).data + carry;
            if(value > 9){
                list.get(index).data = value % 10;
                carry = value / 10;
            }
            else{
                list.get(index).data = value;
                carry = 0;
            }
        }
        if(carry > 0){
            head = new Node(carry);
            head.next = list.get(0);
        }
        return head;
    }
}
