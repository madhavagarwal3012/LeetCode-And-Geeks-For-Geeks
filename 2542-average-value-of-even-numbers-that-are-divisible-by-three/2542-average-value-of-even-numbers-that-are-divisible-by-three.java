class Solution {
    public int averageValue(int[] nums) {
        int index = 0;
        int count = 0;
        int average = 0;

        while(index < nums.length){
            if(nums[index] % 2 == 0 && nums[index] % 3 == 0){
                average = average + nums[index];
                count++;
            }
            index++;
        }
        if(count > 0){
            average = average/count;
        }
        return average; 
    }
}