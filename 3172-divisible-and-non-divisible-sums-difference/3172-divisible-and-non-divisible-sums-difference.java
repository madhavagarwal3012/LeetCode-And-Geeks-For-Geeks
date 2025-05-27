class Solution {
    public int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int nonDivisibleSum = 0;
        for(int number = 1; number <= n; number++){
            if(number % m == 0){
                divisibleSum += number;
            }
            else{
                nonDivisibleSum += number;
            }
        }
        return nonDivisibleSum - divisibleSum;
    }
}