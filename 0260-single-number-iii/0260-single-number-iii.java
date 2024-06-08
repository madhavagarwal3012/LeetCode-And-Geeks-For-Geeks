class Solution {
    public int[] singleNumber(int[] nums) {
        int single[] = new int[2];
        int singleIndex = 0;
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
                single[singleIndex] = nums[index];
                singleIndex++;
            }
            index++;
        }
        return single;
    }
}