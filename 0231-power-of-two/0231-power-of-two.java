class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        else{
            if(n%2==0){
                int i=2;
                int power_oftwo=2;
                while(i<=n/2){
                    power_oftwo=2*power_oftwo;
                    if(power_oftwo==n){
                        return true;
                    }
                   
                    i++;
                }
            }
            return false;
        }
    }
}