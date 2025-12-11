class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int index = 0; index < num.length(); index++){
            while(k > 0 && !stack.isEmpty() && Character.getNumericValue(stack.peek()) > Character.getNumericValue(num.charAt(index))){
                k--;
                stack.pop();
            }
            stack.push(num.charAt(index));
        }
        while(k > 0 && !stack.isEmpty()){
            k--;
            stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0) return "0";
        return sb.toString();
    }
}