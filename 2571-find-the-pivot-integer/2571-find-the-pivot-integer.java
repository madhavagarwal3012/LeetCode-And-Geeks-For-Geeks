class Solution {
    public int pivotInteger(int n) {
        if(n <= 1){
            return n;
        }
        else{
            int number = 1;
            while(number <= n){
                int sumtillPivot = (number * (1+number))/2;
                int sumtillN = ((n-number+1) * (number+n))/2;

                if(sumtillPivot == sumtillN){
                    return number;
                }
                number++;
            }
        }
        return -1;
    }
}