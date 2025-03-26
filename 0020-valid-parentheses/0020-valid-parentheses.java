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
                char top = parenthesisStack.peek();
                if((s.charAt(index) == ')' && top != '(') || (s.charAt(index) == '}'  && top != '{') || s.charAt(index) == ']' && top != '['){
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