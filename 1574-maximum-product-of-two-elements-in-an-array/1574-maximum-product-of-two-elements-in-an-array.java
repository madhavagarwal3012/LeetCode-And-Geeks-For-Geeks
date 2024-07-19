class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int maximumFrequency = 0;
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;

        for(int index = 0; index < nums.length; index++){
            if(maximum == nums[index]){
                maximumFrequency++;
            }
            else if(nums[index] > secondMaximum && nums[index] < maximum){
                secondMaximum = nums[index];
            }
            else if(nums[index] > maximum){
                secondMaximum = maximum;
                maximum = nums[index];
                maximumFrequency = 1;
            }
        }
        if(maximum != Integer.MIN_VALUE){
            if(maximumFrequency > 1){
                return (maximum - 1) * (maximum - 1);
            }
            else if(secondMaximum != Integer.MIN_VALUE){
                return (secondMaximum - 1) * (maximum - 1);
            }
        }
        return 0;
    }
}