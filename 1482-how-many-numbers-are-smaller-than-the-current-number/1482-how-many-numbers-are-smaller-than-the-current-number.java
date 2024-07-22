class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numberCheck [] = new int[nums.length];
        for(int index = 0; index < nums.length; index++){
            int smallelementCount = 0;
            for(int subIndex = 0; subIndex < nums.length; subIndex++){
                if(subIndex != index){
                    if(nums[index] > nums[subIndex]){
                        smallelementCount++;
                    }
                }
                else{
                    continue;
                }
            }
            numberCheck[index] = smallelementCount;
        }
        return numberCheck;
    }
}