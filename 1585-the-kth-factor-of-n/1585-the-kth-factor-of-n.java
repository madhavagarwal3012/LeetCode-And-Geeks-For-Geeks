class Solution {
    public int kthFactor(int n, int k) {
        int factorCount = 0;
        for(int numberCount = 1; numberCount <= n; numberCount++){
            if(n % numberCount == 0){
                factorCount++;
            }
            if(factorCount == k){
                return numberCount;
            }
        }
        return -1;
    }
}