class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length < 2) {
            return 0; // Not enough elements to form a product
        }
        int maximumFrequency = 1;
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
        int product = 1;
        if(maximum != Integer.MIN_VALUE){
            if(maximumFrequency > 1){
                product = product * (maximum - 1) * (maximum - 1);
            }
            else if(secondMaximum != Integer.MIN_VALUE){
                product = product * (secondMaximum - 1) * (maximum - 1);
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
        return product;
    }
}