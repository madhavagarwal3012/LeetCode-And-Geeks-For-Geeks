class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4){
            return true;
        }
        else{
            if(n%4==0){
                int i=4;
                long power_ofthree=4;
                while(i<=n/2){
                    power_ofthree=4*power_ofthree;
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