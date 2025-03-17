class Solution {
    public int myAtoi(String s) {
        long number = 0;

        int index = 0;
        while(index < s.length() && s.charAt(index) == ' '){
            index++;
        }
        int signIndex = index;
        if(index < s.length()){
            if(s.charAt(index) != '-' && s.charAt(index) != '+' && !Character.isDigit(s.charAt(index))){
                return 0;
            }
            else if(s.charAt(signIndex) == '-' || s.charAt(index) == '+'){
                index++;
            }
            while(index < s.length()  && Character.isDigit(s.charAt(index))){
                int digit = s.charAt(index) - '0';
                if(number == 0){
                    number += digit;
                }
                else{
                    number = number * 10 + digit;
                }
                if(s.charAt(signIndex) == '-'){
                    if(number * -1 < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }
                else if(number > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                index++;
            }
            if(s.charAt(signIndex) == '-'){
                number *= -1;
            }
        }
        return (int)number;
    }
}