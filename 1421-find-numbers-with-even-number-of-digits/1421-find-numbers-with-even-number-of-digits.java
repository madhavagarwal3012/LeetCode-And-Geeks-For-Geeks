class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for(int index = 0; index < nums.length; index++){
            String number = String.valueOf(nums[index]);
            if(number.length() % 2 == 0){
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }
}