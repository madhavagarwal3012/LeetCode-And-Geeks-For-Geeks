class Solution {
    public int[] searchRange(int[] nums, int target) {
        int positions[] = new int[2];
        positions[0] = -1;
        positions[1] = -1;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] == target && positions[0] == -1){
                positions[0] = index;
                positions[1] = index;
            }
            else if(nums[index] == target){
                positions[1] = index;
            }
        }
        return positions;
    }
}