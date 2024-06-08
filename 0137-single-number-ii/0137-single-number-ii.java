class Solution {
    public int singleNumber(int[] nums) {
        boolean unique = true;
        int index = 0;
        while(index < nums.length){
            unique = true;
            int subIndex = 0;
            while(subIndex < nums.length){
                if(index != subIndex && nums[index] == nums[subIndex]){
                    unique = false;
                    break;
                }
                subIndex++;
            }
            if(unique){
                return nums[index];
            }
            index++;
        }
        return nums[index - 1];
    }
}