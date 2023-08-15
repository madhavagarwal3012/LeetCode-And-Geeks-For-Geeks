class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder output = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += Character.getNumericValue(num1.charAt(i));
                i--;
            }
            if (j >= 0) {
                sum += Character.getNumericValue(num2.charAt(j));
                j--;
            }
            carry = sum / 10;
            int remainder = sum % 10;
            output.insert(0, (char) ('0' + remainder));
        }
        
        return output.toString();
    }
}
