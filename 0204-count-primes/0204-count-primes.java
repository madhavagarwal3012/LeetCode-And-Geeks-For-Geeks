class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int prime = 0;

        for (int num = 2; num < n; num++) {
            if (!isComposite[num]) {
                prime++;
                for (int multiple = num * 2; multiple < n; multiple += num) {
                    isComposite[multiple] = true;
                }
            }
        }

        return prime;
    }
}
