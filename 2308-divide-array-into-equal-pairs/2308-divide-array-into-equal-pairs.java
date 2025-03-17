class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 == 1){
            return false;
        }
        Arrays.sort(nums);
        int frequencyCount = 1;
        for(int index = 0; index < nums.length - 1; index++){
            if(nums[index] == nums[index + 1]){
                frequencyCount++;
            }
            else if(frequencyCount % 2 == 1 || index + 1 == nums.length - 1){
                return false;
            }
            else{
                frequencyCount = 1;
            }
        }
        return true;
    }
}