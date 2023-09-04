class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;

        if (num == 1) {
            return true;
        }
        
        while (start * start <= num) {
            if (start * start == num) {
                return true;
            }
            start++;
        }
        
        return false;
    }
}
