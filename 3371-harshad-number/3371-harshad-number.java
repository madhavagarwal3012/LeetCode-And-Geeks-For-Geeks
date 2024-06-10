class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digit = 0;

        while(number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        if(sum!=0 && originalNumber % sum == 0){
            return sum;
        }
        else{
            return -1;
        }
    }
}