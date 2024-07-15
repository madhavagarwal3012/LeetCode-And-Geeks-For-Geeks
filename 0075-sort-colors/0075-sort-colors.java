class Solution {
    public void sortColors(int[] nums) {
        int redFrequency = 0;
        int whiteFrequency = 0;
        int blueFrequency = 0;
        for(int index = 0; index < nums.length; index++){
             if(nums[index] == 0){
                redFrequency++;
            }
            else if(nums[index] == 1){
                whiteFrequency++;
            }
            else if(nums[index] == 2){
                blueFrequency++;
            }
        }
        for(int index = 0; index < nums.length;){
            while(redFrequency > 0){
                nums[index] = 0;
                redFrequency--;
                index++;
            }
            while(whiteFrequency > 0){
                nums[index] = 1;
                whiteFrequency--;
                index++;
            }
            while(blueFrequency > 0){
                nums[index] = 2;
                blueFrequency--;
                index++;
            }
        }
    }
}