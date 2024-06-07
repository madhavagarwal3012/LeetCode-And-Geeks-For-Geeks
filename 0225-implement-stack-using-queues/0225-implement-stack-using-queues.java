import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    int size;
    int size2;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        size = 0;
        size2 = 0; 
    }
    public void push(int x) {
        q1.add(x);
        size++;
    }
    public static Queue<Integer> helper(Queue<Integer> input){
		int size = input.size();

		if(size==0){
			return input;
		}
		int temp = input.poll();
		helper(input);
		input.add(temp);
		return input;
	}
    public int pop() {
         if(q1.size() == 0){           
            size = size2 - 1;
            return 0;
        }
        int temp =q1.poll();
        size--;
        size2++;
        pop();
        q2.add(temp);
        size2--;
        if(size2 == 0){
          temp = q2.poll();
          q2 = helper(q2);
          while(!q2.isEmpty()){
              q1.add(q2.poll());
          }
        }
        return temp;
    }
    
    public int top() {
        if(q1.size() == 0){            //My Recursive Approach
            size = size2 - 1;
            return 0;
        }
        int temp =q1.poll();
        size--;
        size2++;
        top();
        q2.add(temp);
        size2--;
        if(size2 == 0){
          temp = q2.peek();
          q2 = helper(q2);
          while(!q2.isEmpty()){
              q1.add(q2.poll());
          }
        }
        return temp;
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */