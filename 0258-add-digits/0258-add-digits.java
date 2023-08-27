class Solution {
    public int addDigits(int n) {
        if (n <= 9) {
            return n;
        }

        String str = Integer.toString(n);
        int sum = Character.getNumericValue(str.charAt(0));

        int i = 1;
        while (i < str.length()) {
            sum = sum + Character.getNumericValue(str.charAt(i));
            i++;
        }

        while (sum > 9) {
            str = Integer.toString(sum);
            sum = Character.getNumericValue(str.charAt(0));

            i = 1;
            while (i < str.length()) {
                sum = sum + Character.getNumericValue(str.charAt(i));
                i++;
            }
        }

        return sum;
    }
}
