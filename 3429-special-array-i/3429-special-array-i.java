class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int index = 0; index < nums.length - 1; index++){
            if(nums[index] % 2 == 0 && nums[index + 1] % 2 == 0){
                return false;
            }
            if(nums[index] % 2 == 1 && nums[index + 1] % 2 == 1){
                return false;
            }
        }
        return true;
    }
}