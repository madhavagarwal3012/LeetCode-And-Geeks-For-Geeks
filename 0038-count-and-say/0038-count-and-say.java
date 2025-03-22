class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String cs = "11";
        for(int count = 2; count < n; count++){
            StringBuilder number = new StringBuilder();
            boolean lastValueFlag = true;
            int frequency = 1;
            for(int index = 0; index < cs.length() - 1; index++){
                if(cs.charAt(index) == cs.charAt(index + 1)){
                    frequency++;
                    if(index + 1 == cs.length() - 1){
                        lastValueFlag = false;
                        number.append(frequency).append(cs.charAt(index));
                    }
                }
                else{
                    number.append(frequency).append(cs.charAt(index));
                    frequency = 1;
                }
            }
            if(lastValueFlag){
                number.append(1).append(cs.charAt(cs.length() - 1));
            }
            cs = number.toString();
        }
        return cs;
    }
}