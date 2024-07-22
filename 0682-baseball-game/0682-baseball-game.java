class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int index = 0; index < operations.length; index++){
            if(operations[index].equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(operations[index].equals("D")){
                if(!stack.isEmpty()){
                    stack.push(2 * stack.peek());
                }
            }
            else if(operations[index].equals("+")){
                if(!stack.isEmpty()){
                    int top = stack.pop();
                    int currentElement = top + stack.peek();

                    stack.push(top);
                    stack.push(currentElement);
                }
            }
            else{
                stack.push(Integer.parseInt(operations[index]));
            }
        }
        int totalScore = 0;
        while(!stack.isEmpty()){
            totalScore = totalScore + stack.pop();
        }
        return totalScore;
    }
}