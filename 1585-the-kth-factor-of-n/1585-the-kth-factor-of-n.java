class Solution {
    public int kthFactor(int n, int k) {
        int factorCount = 0;
        for(int numberCount = 1; numberCount <= n / 2; numberCount++){
            if(n % numberCount == 0){
                factorCount++;
            }
            if(factorCount == k){
                return numberCount;
            }
        }
        if(factorCount + 1 == k){
            return n;
        }
        return -1;
    }
}