class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 == 1){
            return false;
        }
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 1; index+=2){
            if(nums[index] != nums[index + 1]){
                return false;
            }
        }
        return true;
    }
}