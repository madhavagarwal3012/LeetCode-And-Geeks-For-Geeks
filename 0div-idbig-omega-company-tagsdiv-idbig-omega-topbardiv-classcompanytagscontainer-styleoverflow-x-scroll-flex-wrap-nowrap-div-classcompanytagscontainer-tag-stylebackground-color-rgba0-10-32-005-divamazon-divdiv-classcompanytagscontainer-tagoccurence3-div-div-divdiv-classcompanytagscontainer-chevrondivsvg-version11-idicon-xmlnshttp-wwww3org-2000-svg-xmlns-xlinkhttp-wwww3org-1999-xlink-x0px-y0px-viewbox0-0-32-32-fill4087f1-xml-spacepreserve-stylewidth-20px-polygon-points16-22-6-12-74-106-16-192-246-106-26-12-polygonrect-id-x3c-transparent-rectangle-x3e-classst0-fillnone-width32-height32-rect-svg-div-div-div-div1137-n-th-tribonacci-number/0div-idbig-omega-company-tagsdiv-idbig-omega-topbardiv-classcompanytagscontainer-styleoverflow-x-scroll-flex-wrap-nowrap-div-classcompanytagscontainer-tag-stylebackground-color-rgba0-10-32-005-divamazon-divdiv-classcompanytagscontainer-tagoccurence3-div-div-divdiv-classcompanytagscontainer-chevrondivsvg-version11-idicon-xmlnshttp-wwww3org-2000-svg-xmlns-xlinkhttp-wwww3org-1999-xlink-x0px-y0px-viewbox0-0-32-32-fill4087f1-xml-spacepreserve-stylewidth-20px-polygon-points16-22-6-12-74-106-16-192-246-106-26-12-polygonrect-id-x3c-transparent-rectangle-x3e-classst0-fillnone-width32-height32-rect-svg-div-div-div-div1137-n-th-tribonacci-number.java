class Solution {
    public int tribonacci(int n) {
        int n1=0;
        int n2=1;
        int n3=1;
        int T_Sum;
        
        int start=0;
        while(start<n){
            T_Sum=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=T_Sum;
            start++;
        }
        return n1;
    }
}