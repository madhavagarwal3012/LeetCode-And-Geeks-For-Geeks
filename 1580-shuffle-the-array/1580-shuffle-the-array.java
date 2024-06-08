class Solution {
    public int[] shuffle(int[] nums, int mid) {
        int shuffled[] = new int[nums.length];
        int subIndex = 0;
        int index = 0;

        while(index < mid){
            shuffled[subIndex] = nums[index];
            if(mid + index < nums.length){
                shuffled[subIndex + 1] = nums[mid + index];
            }
            index++;
            subIndex+=2;
        }
        return shuffled;
    }
}