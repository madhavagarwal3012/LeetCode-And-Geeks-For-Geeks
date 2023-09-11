class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4){
            return true;
        }
        else{
            if(n%4==0){
                int i=4;
                long power_of_four=4;
                while(i<=n/2){
                    power_of_four=4*power_of_four;
                    if(power_of_four==n){
                        return true;
                    }
                    else if(power_of_four>n){
                        return false;
                    }
                    i++;
                }
            }
            return false;
        }
    }
}