class Solution {
    public int countPartitions(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        int pSum = 0;
        int sSum = 0;
        for(int increasingIndex = 0, decreasingIndex = nums.length - 1; increasingIndex < nums.length && decreasingIndex >= 0; increasingIndex++, decreasingIndex--){
            prefixSum[increasingIndex] = nums[increasingIndex] + pSum;
            suffixSum[decreasingIndex] = nums[decreasingIndex] + sSum;
            pSum = prefixSum[increasingIndex];
            sSum = suffixSum[decreasingIndex];
        }
        int prefixSumIndex = 0;
        int suffixSumIndex = 1;
        int partitionCount = 0;
        while(prefixSumIndex < prefixSum.length && suffixSumIndex < suffixSum.length){
            if((prefixSum[prefixSumIndex++] - suffixSum[suffixSumIndex++]) % 2 == 0){
                partitionCount++;
            }
        }
        return partitionCount;
    }
}