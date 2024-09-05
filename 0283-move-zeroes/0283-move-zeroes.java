class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        for(int index = 0; index < nums.length; index++){
            if(zeroIndex == -1 && nums[index] == 0){
                zeroIndex = index;
            }
            else if(nums[index] != 0 && zeroIndex != -1){
                int temp = nums[index];
                nums[index] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                while(nums[zeroIndex] != 0 && zeroIndex < nums.length){
                    zeroIndex++;
                }
            }
        }
    }
}