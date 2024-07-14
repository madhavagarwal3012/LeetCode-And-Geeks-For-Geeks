class Solution {
    public String clearDigits(String s) {
        boolean checkDigit = true;
        Stack<Character> stack = new Stack<>();
        Stack<Character> reverse = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            if(Character.getNumericValue(s.charAt(index)) < 10){
                if(!stack.isEmpty()){
                    checkDigit = false;
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(index));
            }
        }
        if(checkDigit){
            return s;
        }
        s = "";
        while(!stack.isEmpty()){
            reverse.push(stack.pop());
        }
        while(!reverse.isEmpty()){
            s += reverse.pop();
        }
        return s;
    }
}