class Solution {
    public int findPeakElement(int[] nums) {
        int peakElement = 0;
        for(int index = 1; index < nums.length - 1; index++){
            if(nums[index] > nums[index - 1] && nums[index] > nums[index + 1]){
                peakElement = index;
            }
        }
        if(peakElement == 0){
            if(nums.length > 1 && nums[nums.length - 1] > nums[nums.length - 2]){
                return nums.length-1;
            }
        }
        return peakElement;
    }
}