class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isComposite = new boolean[n];
        int count = 0;
        for (int start = 2; start * start < n; start++) {
            if (!isComposite[start]) {
                for (int multiple = start * start; multiple < n; multiple += start) {
                    isComposite[multiple] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        return count;
    }
}
