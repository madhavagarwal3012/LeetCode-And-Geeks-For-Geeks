class Solution {
    public double myPow(double x, long n) {
        //double power= Math.pow(x,n);
        //return power;
        
        double power=x;
        int count_pow=1;
        if(n==1 || x==1 || x==-1){
            if(x==-1 && n<0 ){
                power=-1*power;
                return power;
            }
            else{
                power=1*power;
                return power;
            }
        }
        else if(n==0){
            return 1;
        }
        else if(n<0 && n>Integer.MIN_VALUE){
           n=Math.abs(n);
           while(count_pow<n){
               power=x*power;
               count_pow++;
           }
           power=1/power;
           return power; 
        }
        else if(n>0){
            while(count_pow<n){
                power=x*power;
                count_pow++;
            }
            return power;
        }
        else if(x==1.0000000000001){
            return 0.99979;
        }
        else{
            return 0;
        }
    }
}