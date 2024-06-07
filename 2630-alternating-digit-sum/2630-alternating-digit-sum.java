class Solution {
    public int alternateDigitSum(int n) {
        if (n <= 9) {
            return n;
        }
        String str = Integer.toString(n);
        int sum = 0;
        int start=0;
        
        while(start< str.length()) {
            if (start % 2 == 0) {
                sum += Character.getNumericValue(str.charAt(start));
            } 
            else {
                sum -= Character.getNumericValue(str.charAt(start));
            }
            start++;
        }
        return sum;
    }
}
