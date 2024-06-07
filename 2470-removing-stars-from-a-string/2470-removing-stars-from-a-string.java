import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack<Character>stack = new Stack<>();
        int index = 0;
        
        String result = "";
        String output = "";
        
        while(index<s.length()){
            stack.push(s.charAt(index));
            if(s.charAt(index)=='*' && !stack.isEmpty()){
                stack.pop();
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            index++;
        }
        while(!stack.isEmpty()){
            result += stack.pop();
            
        }
        index = result.length()-1;
        while(index>=0){
            output += result.charAt(index);
            index--;
        }
        return output;
    }
}