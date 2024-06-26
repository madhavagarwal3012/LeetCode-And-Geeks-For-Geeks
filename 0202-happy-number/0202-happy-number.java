class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        else{
            int sum = 0;
            int step = 0;
            String num = String.valueOf(n);
            while(sum!=1){
                if(step>10){
                    return false;
                }
                sum = 0;
                int index = 0;
                while(index<num.length()){
                    int value = Character.getNumericValue(num.charAt(index));
                    sum = sum + (value * value);
                    index++;
                }
                if(sum == n){
                    return false;
                }
                else{
                    num = String.valueOf(sum);
                }
                step++;
            }
        }
        return true;
    }
}