class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        else{
            int sum = 0;
            int check = 0;
            int step = 0;
            String num = String.valueOf(n);
            while(sum!=1){
                if(step>40){
                    return false;
                }
                sum = 0;
                int index = 0;
                while(index<num.length()){
                    int value = Character.getNumericValue(num.charAt(index));
                    sum = sum + (value * value);
                    if(step>10 && check == sum){
                        return false;
                    }
                    index++;
                }
                if(sum == n){
                    return false;
                }
                else{
                    num = String.valueOf(sum);
                }
                if(check == 0){
                    check = sum;
                }
                step++;
            }
        }
        return true;
    }
}