class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 1; index+=2){
            int temp = nums[index + 1];
            nums[index + 1] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
}