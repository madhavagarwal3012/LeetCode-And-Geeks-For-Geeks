import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        List<Integer> primes = new ArrayList<>();
        
        for (int num = 2; num < n; num++) {
            if (!isComposite[num]) {
                primes.add(num);
                for (int multiple = num * 2; multiple < n; multiple += num) {
                    isComposite[multiple] = true;
                }
            }
        }

        return primes.size();
    }
}
