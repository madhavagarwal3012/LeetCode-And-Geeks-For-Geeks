// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }
        else{
            n-= 2;
            
            int n1 = 1;
            int n2 = 1;
            int nthFibonacci = 0;
            while(n > 0){
                nthFibonacci = n1 + n2;
                n1 = n2;
                n2 = nthFibonacci;
                
                n--;
            }
            return nthFibonacci;
        }
    }
}