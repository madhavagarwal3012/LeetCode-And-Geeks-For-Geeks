class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n == 1 || n == 2){
            return true;
        }
        else{
            for(int number = 2; number <= (int)Math.sqrt(n); number++){
                if(n % number == 0){
                    return false;
                }
            }
            return true;
        }
    }
}