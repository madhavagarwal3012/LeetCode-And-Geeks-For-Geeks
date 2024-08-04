class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int leftRightDifferenceArray [] = new int[nums.length];

        for(int index = 0; index < nums.length; index++){
            int sum = 0;
            for(int subIndex = 0; subIndex < index; subIndex++){
                sum = sum + nums[subIndex];
            }
            leftSum[index] = sum;
        }
        for(int index = 0; index < nums.length; index++){
            int sum = 0;
            for(int subIndex = index + 1; subIndex < nums.length; subIndex++){
                sum = sum + nums[subIndex];
            }
            rightSum[index] = sum;
        }
        for(int index = 0; index < nums.length; index++){
            leftRightDifferenceArray[index] = Math.abs(leftSum[index] - rightSum[index]);
        }
        return leftRightDifferenceArray;
    }
}