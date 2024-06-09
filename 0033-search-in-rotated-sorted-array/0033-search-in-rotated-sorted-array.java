class Solution {
    public int search(int[] nums, int target) {
        if(nums[nums.length - 1] == target){
            return nums.length - 1;
        }
        else{
            int index = 0;
            while(index < nums.length){
                if(nums[index] ==  target){
                    return index;
                }
                index ++;
            }
            return -1;
        }
    }
}