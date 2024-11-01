class Solution {
    public String replaceDigits(String s) {
        String output = "";
        String digits = "";
        int outputIndex = -1;
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                digits += s.charAt(index);
            }
            else{
                if(!digits.equals("")){
                    output += (char)(s.charAt(outputIndex) + Integer.parseInt(digits));
                    digits = "";
                    output += s.charAt(index);
                    outputIndex+=2;
                }
                else{
                    output += s.charAt(index);
                    outputIndex++;
                }
            }
        }
        if(!digits.equals("")){
            output += (char)(s.charAt(outputIndex) + Integer.parseInt(digits));
            digits = "";
            outputIndex++;
        }
        return output;
    }
}