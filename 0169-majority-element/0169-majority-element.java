class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majorityCount = 0;
        int majorityIndex = 0;
        int count = 0;
        for(int index = 0; index < nums.length; index++){
            int subIndex = index + 1;
            if(subIndex < nums.length){
                if(nums[index] == nums[subIndex]){
                    count++;
                }
                else{
                    count = 0;
                }
            }
            if(count > majorityCount){
                majorityCount = count;
                majorityIndex = index;
            }
        }
        return nums[majorityIndex];
    }
}