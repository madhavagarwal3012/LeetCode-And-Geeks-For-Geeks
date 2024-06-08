class Solution {
    public int singleNumber(int[] nums) {
        int unique = Integer.MIN_VALUE;
        int index = 0;

        while(index < nums.length){
            unique = nums[index];
            int subIndex = 0;
            while(subIndex < nums.length){
                if(index ==  subIndex){
                    subIndex++;
                }
                if(subIndex < nums.length && unique == nums[subIndex]){
                    unique = Integer.MIN_VALUE;
                    break;
                }
                subIndex++;
            }
            if(unique != Integer.MIN_VALUE){
                return unique;
            }
            index++;
        }
        return unique;
    }
}