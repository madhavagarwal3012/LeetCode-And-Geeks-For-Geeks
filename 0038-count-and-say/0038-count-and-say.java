class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String cs = "11";
        for(int count = 2; count < n; count++){
            String number = "";
            boolean lastValueFlag = true;
            int frequency = 1;
            for(int index = 0; index < cs.length() - 1; index++){
                if(cs.charAt(index) == cs.charAt(index + 1)){
                    frequency++;
                    if(index + 1 == cs.length() - 1){
                        lastValueFlag = false;
                        number = number + String.valueOf(frequency) + cs.charAt(index);
                    }
                }
                else{
                    number = number + String.valueOf(frequency) + cs.charAt(index);
                    frequency = 1;
                }
            }
            if(lastValueFlag){
                number = number + "1" +  cs.charAt(cs.length() - 1);
            }
            cs = number;
        }
        return cs;
    }
}