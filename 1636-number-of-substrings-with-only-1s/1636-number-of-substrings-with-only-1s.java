class Solution {
    public int numSub(String s) {
        int consecutiveOnesLength = 0;
        int result = 0;
        int stringLength = s.length();
        for(int index = 0; index < stringLength; index++){
            if(s.charAt(index) != '1' && consecutiveOnesLength > 0){
                long substringCountContainingOnes = (long) consecutiveOnesLength * (consecutiveOnesLength + 1) / 2;
                result = (result + (int)(substringCountContainingOnes % 1000000007)) % 1000000007;
                
                consecutiveOnesLength = 0;
            }
            else if(s.charAt(index) == '1'){
                consecutiveOnesLength++;
                if(index == stringLength - 1){
                    long substringCountContainingOnes = (long) consecutiveOnesLength * (consecutiveOnesLength + 1) / 2;
                    result = (result + (int)(substringCountContainingOnes % 1000000007)) % 1000000007;
                    consecutiveOnesLength = 0;
                }
            }
        }
        return result;
    }
}