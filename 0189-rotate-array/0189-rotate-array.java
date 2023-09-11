class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return; // No need to rotate for arrays of size 0 or 1.
        }

        k = k % n; // Ensure k is within the range of the array length.
        
        int pointer = 0;
        int end = n - 1;
        int[] rotatedArr = new int[n];

        while (pointer < k) {
            rotatedArr[k - pointer - 1] = nums[end];
            pointer++;
            end--;
        }

        pointer = 0;
        while (pointer < n - k) {
            rotatedArr[k + pointer] = nums[pointer];
            pointer++;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotatedArr[i];
        }
    }
}