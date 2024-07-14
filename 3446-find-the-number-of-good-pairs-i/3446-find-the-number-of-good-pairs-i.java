class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int pairCount = 0;
        for(int index = 0; index < nums1.length; index++){
            for(int subIndex = 0; subIndex < nums2.length; subIndex++){
                if(nums1[index] % (nums2[subIndex] * k) == 0){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}