class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;
        long square = 0;
        
        while (square <= num) {
            if (square == num) {
                return true;
            }
            start++;
            square = start * start;
        }
        
        return false;
    }
}
