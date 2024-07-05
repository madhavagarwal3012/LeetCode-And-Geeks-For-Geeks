class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majorityCount = 0;
        int majorityIndex = 0;
        for(int index = 0; index < nums.length; index++){
            int count = 0;
            for(int subIndex = index+1; subIndex < nums.length; subIndex++){
                if(nums[index] == nums[subIndex]){
                    count++;
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