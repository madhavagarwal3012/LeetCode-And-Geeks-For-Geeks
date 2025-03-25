class Solution {
    public int[] transformArray(int[] nums) {
        int zeroCount = 0;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] % 2 == 0){
                zeroCount++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(zeroCount > 0){
                nums[index] = 0;
                zeroCount--;
            }
            else{
                nums[index] = 1;
            }
        }
        return nums;
    }
}