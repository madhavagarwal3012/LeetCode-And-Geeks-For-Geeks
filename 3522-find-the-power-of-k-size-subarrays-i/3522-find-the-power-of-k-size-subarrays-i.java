class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int result[] = new int[nums.length - k + 1];
        for(int index = 0; index <= nums.length - k; index++){
            boolean check = true;
            int subIndex = index;
            for(int steps = k; steps > 1; steps--){
                if(nums[subIndex] > nums[subIndex + 1]){
                    result[index] = -1;
                    check = false;
                    break;
                }
                if(nums[subIndex] + 1 != nums[subIndex + 1]){
                    result[index] = -1;
                    check = false;
                    break;
                }
                subIndex++;
            }
            if(subIndex == index + k - 1){
                result[index] = nums[subIndex];
            }
        }
        return result;
    }
}