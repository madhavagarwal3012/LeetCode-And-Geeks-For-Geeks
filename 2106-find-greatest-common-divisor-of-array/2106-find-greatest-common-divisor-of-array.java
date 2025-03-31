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
        int r = 0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}