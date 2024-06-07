class Solution {
    public int smallestEvenMultiple(int n) {
        int start=1;
        while(start<=n){
            int product=n*start;
            if(product%2==0){
                return product;
            }
            start++;
        }
        return 2;
    }
}