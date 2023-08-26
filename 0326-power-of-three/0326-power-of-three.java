class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3){
            return true;
        }
        else{
            if(n%3==0){
                int i=3;
                long power_ofthree=3;
                while(i<=n/2){
                    power_ofthree=3*power_ofthree;
                    if(power_ofthree==n){
                        return true;
                    }
                    else if(power_ofthree>n){
                        return false;
                    }
                    i++;
                }
            }
            return false;
        }
    }
}