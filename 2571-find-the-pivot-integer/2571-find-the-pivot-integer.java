class Solution {
    public int pivotInteger(int n) {
        if(n <= 1){
            return n;
        }
        else{
            int x = 1;
            while(x <= n){
                int sumtillPivot = x * (x +1) / 2;
                int sumtillN = (x + n) * (n - x + 1) /2;

                if(sumtillPivot == sumtillN){
                    return x;
                }
                x++;
            }
        }
        return -1;
    }
}