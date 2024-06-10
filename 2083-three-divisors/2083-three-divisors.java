class Solution {
    public boolean isThree(int n) {
        int countDivisor = 0;
        int number = 1;
        while(number <= n){
            if(n % number == 0){
                countDivisor++;
                if(countDivisor == 4){
                    return false;
                }
            }
            number++;
        }
        if(countDivisor != 3){
            return false;
        }
        return true;
    }
}