class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] < 0){
                negativeCount++;
            }
            else if(nums[index] > 0){
                positiveCount++;
            }
        }
        if(negativeCount > positiveCount){
            return negativeCount;
        }
        return positiveCount;
    }
}