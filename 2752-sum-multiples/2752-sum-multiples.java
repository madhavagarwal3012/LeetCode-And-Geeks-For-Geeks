class Solution {
    public int sumOfMultiples(int n) {
        int number = 3;
        int sum = 0;
        while(number <= n){
            if(number % 3 == 0 || number % 5 == 0 || number % 7 == 0){
                sum = sum + number;
            }
            number++;
        }
        return sum;
    }
}