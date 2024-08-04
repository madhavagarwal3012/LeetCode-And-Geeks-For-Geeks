class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int unsortedSequenceSum [] = new int[(n * (n+1))/2];
        int unsortedSequenceIndex = 0;
        for(int index = 0; index < n; index++){
            int sum = nums[index];
            unsortedSequenceSum[unsortedSequenceIndex] = sum;
            unsortedSequenceIndex++;
            for(int subIndex = index + 1; subIndex < n; subIndex++){
                sum = sum + nums[subIndex];
                unsortedSequenceSum[unsortedSequenceIndex] = sum;
                unsortedSequenceIndex++;
            }
        }
        Arrays.sort(unsortedSequenceSum);
        long sum = 0;
        for(int index = left - 1; index < right; index++){
            sum = sum + unsortedSequenceSum[index];
        }
        return (int)(sum % 1000000007);
    }
}