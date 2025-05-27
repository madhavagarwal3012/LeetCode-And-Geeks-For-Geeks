class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for(;n > 0; n--){
            if(n % m == 0){
                sum -= n;
            }
            else{
                sum += n;
            }
        }
        return sum;
    }
}