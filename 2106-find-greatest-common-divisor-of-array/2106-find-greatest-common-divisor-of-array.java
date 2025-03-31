class Solution {
    public int findGCD(int[] nums) {
        int minimumNumber = Integer.MAX_VALUE;
        int maximumNumber = Integer.MIN_VALUE;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] < minimumNumber){
                minimumNumber = nums[index];
            }
            if(nums[index] > maximumNumber){
                maximumNumber = nums[index];
            }
        }
        int a = maximumNumber;
        int b = minimumNumber;
        int remainder;
        while(b != 0){
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}