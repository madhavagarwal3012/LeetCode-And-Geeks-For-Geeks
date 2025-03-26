class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisStack = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '(' || s.charAt(index) == '{' || s.charAt(index) == '['){
                parenthesisStack.push(s.charAt(index));
            }
            if(s.charAt(index) == ')' || s.charAt(index) == '}' || s.charAt(index) == ']'){
                if(parenthesisStack.isEmpty()){
                    return false;
                }
                else if(s.charAt(index) == ')'){
                    if(parenthesisStack.peek() == '('){
                        parenthesisStack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(index) == '}'){
                    if(parenthesisStack.peek() == '{'){
                        parenthesisStack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(index) == ']'){
                    if(parenthesisStack.peek() == '['){
                        parenthesisStack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return parenthesisStack.isEmpty();
    }
}