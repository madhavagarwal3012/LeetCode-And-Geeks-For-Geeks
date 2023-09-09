class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int count = 0;
        boolean[] isPrime = new boolean[n];
        int num = 2;

        while (num * num < n) {
            if (!isPrime[num]) {
                int multiple = num * num;
                while (multiple < n) {
                    isPrime[multiple] = true;
                    multiple += num;
                }
            }
            num++;
        }

        int i = 2;
        while (i < n) {
            if (!isPrime[i]) {
                count++;
            }
            i++;
        }

        return count;
    }
}
