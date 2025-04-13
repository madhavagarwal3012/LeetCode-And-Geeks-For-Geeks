class Solution {
    public int countGoodNumbers(long n) {
        long primeNumberCountPerDigitExponent = (n/2);
        long evenNumberCountPerDigitExponent = (n - primeNumberCountPerDigitExponent);

        long result5 = 1;
        long base5 = 5;
        for(long exponent = evenNumberCountPerDigitExponent; exponent > 0; exponent/=2){
            if (exponent % 2 == 1) {  
                result5 = (result5 * base5) % 1000000007;
            }
            base5 = (base5 * base5) % 1000000007;
        }
        long result4 = 1;
        long base4 = 4;
        for(long exponent = primeNumberCountPerDigitExponent; exponent > 0; exponent/=2){
            if (exponent % 2 == 1) {  
                result4 = (result4 * base4) % 1000000007;
            }
            base4 = (base4 * base4) % 1000000007;
        }
        return (int)((result5 * result4) % 1000000007);
    }
}