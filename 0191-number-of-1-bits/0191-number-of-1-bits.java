class Solution {
    public int hammingWeight(int n) {
        long base = 1;
        long power = 0;
        int bitCount = 0;

        while(base < n){
            base = base * 2;
            if(base > n){
                break;
            }
            power++;
        }
        while(power >= 0){
            if((int)Math.pow(2, power) <= n){
                n = n - (int)Math.pow(2, power);
                bitCount++;
            }
            power--;
        }
        return bitCount;
    }
}