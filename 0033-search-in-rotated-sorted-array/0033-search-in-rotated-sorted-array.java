class Solution {
    public int search(int[] nums, int target) {
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