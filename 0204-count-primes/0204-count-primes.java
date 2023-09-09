class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isComposite = new boolean[n];
        int count = 0;
        int start = 2;
        while (start < n) {
            if (!isComposite[start]) {
                count++;
                int multiple = 2 * start;
                while (multiple < n) {
                    isComposite[multiple] = true;
                    multiple += start;
                }
            }
            start++;
        }
        return count;
    }
}

