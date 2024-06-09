class Solution {
    public boolean search(int[] nums, int target) {
        int comparison = (int)Math.log(nums.length);
        int length =  nums.length - 1;
        int index = 0;

        while(comparison > 0){
            if(nums[length] == target){
                return true;
            }
            else if(nums[index] == target){
                return true;
            }
            index++;
            length--;
            comparison--;
        }

        while(index <= length){
            if(nums[index] ==  target){
                return true;
            }
            index ++;
        }
        return false;
    }
}