class Solution {
    public int alternateDigitSum(int n) {
        if (n <= 9) {
            return n;
        }

        String str = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sum += Character.getNumericValue(str.charAt(i));  // Add even-positioned digits
            } 
            else {
                sum -= Character.getNumericValue(str.charAt(i));  // Subtract odd-positioned digits
            }
        }

        return sum;
    }
}
