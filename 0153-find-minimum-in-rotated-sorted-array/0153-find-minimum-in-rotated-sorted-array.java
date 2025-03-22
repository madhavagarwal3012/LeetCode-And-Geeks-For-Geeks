class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            if(nums[low] > nums[high]){
                low++;
            }
            else if(nums[low] < nums[high]){
                high--;
            }
            else{
                low++;
                high--;
            }
        }
        return nums[low];
    }
}