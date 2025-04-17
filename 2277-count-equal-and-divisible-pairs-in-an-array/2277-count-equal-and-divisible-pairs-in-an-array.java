class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int index = 0; index < nums.length; index++){
            for(int subIndex = index + 1; subIndex < nums.length; subIndex++){
                if(nums[index] == nums[subIndex] && index * subIndex % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}