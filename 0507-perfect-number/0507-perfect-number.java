class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int start=1;
        while(start<=num/2){
            if(num%start==0){
                sum=sum+start;
            }
            start++;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}