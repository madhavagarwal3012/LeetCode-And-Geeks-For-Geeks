class MyCircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (size < data.length) {
            if (front == -1) {
                front = 0;
                rear = 0;
            } 
            else if (rear == data.length - 1 && front != 0) {
                rear = 0;
            } 
            else {
                rear++;
            }
            data[rear] = value;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } 
        else {
            front = (front + 1) % data.length;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == data.length;
    }
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */