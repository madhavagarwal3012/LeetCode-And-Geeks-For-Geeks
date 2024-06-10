class Solution {
    public int commonFactors(int number1, int number2) {
        int number = 1;
        int minimum = 0;
        int factorCount = 0;
        if(number1 <= number2){
            minimum = number1;
        }
        else{
            minimum = number2;
        }
        while(number <= minimum){
            if(number1 % number == 0 && number2 % number == 0){
                factorCount++;
            }
            number++;
        }
        return factorCount;
    }
}