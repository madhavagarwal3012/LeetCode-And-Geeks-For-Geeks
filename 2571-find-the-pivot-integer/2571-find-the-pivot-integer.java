class Solution {
    public int pivotInteger(int n) {
        if(n <= 1){
            return n;
        }
        else{
            int x = 1;
            while(x <= n){
                int sumtillPivot = (x * (1 + x))/2;
                int sumtillN = ((n - x + 1) * (x +n ))/2;

                if(sumtillPivot == sumtillN){
                    return x;
                }
                x++;
            }
        }
        return -1;
    }
}