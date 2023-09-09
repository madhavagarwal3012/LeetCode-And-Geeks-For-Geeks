class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int count = 0;
        boolean[] isPrime = new boolean[n];
        
        for (int num = 2; num * num < n; num++) {
            if (!isPrime[num]) {
                for (int multiple = num * num; multiple < n; multiple += num) {
                    isPrime[multiple] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}

