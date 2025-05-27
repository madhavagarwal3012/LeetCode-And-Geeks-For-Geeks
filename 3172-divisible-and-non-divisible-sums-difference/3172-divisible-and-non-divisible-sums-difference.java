class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for(int number = 1; number <= n; number++){
            if(number % m == 0){
                sum -= number;
            }
            else{
                sum += number;
            }
        }
        return sum;
    }
}