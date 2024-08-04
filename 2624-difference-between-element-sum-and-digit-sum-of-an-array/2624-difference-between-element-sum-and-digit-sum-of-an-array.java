class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int index = 0; index < nums.length; index++){
            elementSum = elementSum + nums[index];
            String number = String.valueOf(nums[index]);
            for(int stringIndex = 0; stringIndex < number.length(); stringIndex++){
                digitSum = digitSum + Character.getNumericValue(number.charAt(stringIndex));
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}