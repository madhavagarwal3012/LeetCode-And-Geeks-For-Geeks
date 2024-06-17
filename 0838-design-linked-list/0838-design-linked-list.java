class MyLinkedList {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int targetNodeIndex) {
        if(head == null || targetNodeIndex >= size){
            return -1;
        }
        else if(targetNodeIndex == size - 1){
            return tail.data;
        }
        else{
            int NodeIndex = 0;
            Node currentNode = head;
            while(NodeIndex < targetNodeIndex){
                currentNode = currentNode.next;
                NodeIndex++;
            }
            return currentNode.data;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if(head == null){
            head = newNode;
            tail = head;
        }
        else{
            head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(tail == null){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void addAtIndex(int targetNodeIndex, int val) {
        if(targetNodeIndex > size){
            return;
        }
        else if(targetNodeIndex == 0){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
        else if(targetNodeIndex == size){
            Node newNode = new Node(val);
            tail.next = newNode;
            tail = tail.next;
        }
        else{
            int NodeIndex = 0;
            Node currentNode = head;
            while(NodeIndex < targetNodeIndex - 1 ){
                currentNode = currentNode.next;
                NodeIndex++;
            }
            Node newNode = new Node(val);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }
    
    public void deleteAtIndex(int targetNodeIndex) {
        if(targetNodeIndex < 0 || targetNodeIndex >= size){
            return;
        }
        else if(targetNodeIndex == 0){
            if(head == null){
                return;
            }
            else{
                head = head.next;
            }
        }
        else{
            int NodeIndex = 0;
            Node currentNode = head;
            while(NodeIndex < targetNodeIndex - 1 ){
                currentNode = currentNode.next;
                NodeIndex++;
            }
            if (NodeIndex == size - 2) {
                tail = currentNode; 
            }
            else{
                currentNode.next = currentNode.next.next;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */