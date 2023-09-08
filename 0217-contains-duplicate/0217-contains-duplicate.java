class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        while(start<nums.length-1){
            if(nums[start]==nums[start+1]){
                return true;
            }
            start++;
        }
        return false;
    }
}