class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBracket = new Stack<>();
        Stack<Character> closedBracket = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == '(' || s.charAt(index) == '[' || s.charAt(index) == '{'){
                openBracket.push(s.charAt(index));
            }
            else if(s.charAt(index) == ')'){
                closedBracket.push(s.charAt(index));
                if(!openBracket.isEmpty()){
                    if(openBracket.peek() == '('){
                        openBracket.pop();
                        closedBracket.pop();
                    }
                }
            }
            else if(s.charAt(index) == ']'){
                closedBracket.push(s.charAt(index));
                if(!openBracket.isEmpty()){
                    if(openBracket.peek() == '['){
                        openBracket.pop();
                        closedBracket.pop();
                    }
                }
            }
            else if(s.charAt(index) == '}'){
                closedBracket.push(s.charAt(index));
                if(!openBracket.isEmpty()){
                    if(openBracket.peek() == '{'){
                        openBracket.pop();
                        closedBracket.pop();
                    }
                }
            }
        }
        if(openBracket.isEmpty() && closedBracket.isEmpty()){
            return true;
        }
        return false;
    }
}