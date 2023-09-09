class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int start = 2; start < n; start++) {
            if (!isComposite[start]) {
                count++;

                // Mark all multiples of the prime as composite
                for (int multiple = 2 * start; multiple < n; multiple += start) {
                    isComposite[multiple] = true;
                }
            }
        }

        return count;
    }
}
