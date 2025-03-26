class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisStack = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '(' || s.charAt(index) == '{' || s.charAt(index) == '['){
                parenthesisStack.push(s.charAt(index));
            }
            else{
                if(parenthesisStack.isEmpty()){
                    return false;
                }
                else if((s.charAt(index) == ')' && parenthesisStack.peek() != '(') || (s.charAt(index) == '}'  && parenthesisStack.peek() != '{') || s.charAt(index) == ']' && parenthesisStack.peek() != '['){
                    return false;                   
                }
                else{
                    parenthesisStack.pop();
                }
            }
        }
        return parenthesisStack.isEmpty();
    }
}