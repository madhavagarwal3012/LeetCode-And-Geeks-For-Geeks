class Solution {
    public int fib(int n) {
        if(n == 1){
            return 1;
        }
        int fibonacci = 0;
        int n1 = 0;
        int n2 = 1;
        while(n>1){
            fibonacci = n1 + n2;
            n1 = n2;
            n2 = fibonacci;
            n--;
        }
        return fibonacci;
    }
}