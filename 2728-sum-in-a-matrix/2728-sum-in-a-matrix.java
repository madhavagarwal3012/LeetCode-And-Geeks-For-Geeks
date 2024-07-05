class Solution {
    public int matrixSum(int[][] nums) {
        int sum = 0;
        for(int row = 0; row < nums.length; row++){
            Arrays.sort(nums[row]);
        }
        for(int column = 0; column < nums[0].length; column++){
            int maximum = nums[0][column];
            for(int row = 1; row < nums.length ; row++){
                if(nums[row][column] > maximum){
                    maximum = nums[row][column];
                }
            }
            sum = sum + maximum;
        }
        return sum;
    }
}