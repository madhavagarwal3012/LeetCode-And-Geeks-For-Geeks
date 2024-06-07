import java.util.LinkedList;
import java.util.Stack;

class MyQueue {
    Stack<Integer>Stack1;
    Stack<Integer>Stack2;
    int size;
    int size2;
    public MyQueue() {
        Stack1 = new Stack<>();
        Stack2 = new Stack<>();
        size = 0;
        size2 = 0;
    }
    public static Stack<Integer> helper(Stack<Integer> input){    //for reversing stack
		int size = input.size();

		if(size==0){
			return input;
		}
		int temp = input.pop();
		helper(input);
		input.push(temp);
		return input;
	}
    public void push(int x) {
        Stack1.push(x);
        size++;
    }
    
    public int pop() {
        if(Stack1.size() == 0){
            size = size2 - 1;
            return 0;
        }
        int temp = Stack1.pop();
        size--;
        size2++;
        Stack2.push(temp);
        pop();
        size2--;
        if(size2 == 0){
          temp = Stack2.pop();
          Stack2 = helper(Stack2);
          while(!Stack2.isEmpty()){
            Stack1.push(Stack2.pop());
          }
        }
        return temp;
    }
    
    public int peek() {
        if(Stack1.size() == 0){          
            size = size2 - 1;
            return 0;
        }
        int temp =Stack1.pop();
        size--;
        size2++;
        Stack2.push(temp);
        peek();
        size2--;
        if(size2 == 0){
          temp = Stack2.peek();
          Stack2 = helper(Stack2);
          while(!Stack2.isEmpty()){
              Stack1.push(Stack2.pop());
          }
        }
        return temp;
    }
    
    public boolean empty() {
        return Stack1.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */