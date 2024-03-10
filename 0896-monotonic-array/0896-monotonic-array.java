class Solution {
    public boolean isMonotonic(int[] nums) {
        int index=0;
        int increasingCount=0;
        int decreasingCount=0;
        while(index<nums.length-1){
            if(nums[index+1]>=nums[index]){
                increasingCount++;
            }
            if(nums[index+1]<=nums[index]){
                decreasingCount++;
            }
            index++;
        }
        if(increasingCount==nums.length-1 || decreasingCount==nums.length-1){
            return true;
        }
        return false;
    }
}