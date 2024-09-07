class Solution {
    public int search(int[] nums, int target) {
        for(int startingIndex = 0, endingIndex = nums.length - 1; startingIndex <= endingIndex;){
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                endingIndex = mid - 1;
            }
            else{
                startingIndex = mid + 1;
            }
        }
        return -1;
    }
}