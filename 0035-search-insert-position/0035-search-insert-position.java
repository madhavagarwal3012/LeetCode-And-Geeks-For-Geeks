class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]){
            return nums.length;
        }
        else if(target < nums[0]){
            return 0;
        }
        else{
            int index = 0;
            while(nums[index] < target){
                index++;
            }
            return index;
        }
    }
}