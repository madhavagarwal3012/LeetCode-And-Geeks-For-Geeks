class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int index = 0; index < nums.length; index++){
            elementSum = elementSum + nums[index];
            int number = nums[index];
            while(number > 0){
                digitSum = digitSum + number % 10;
                number = number/10;
            }
        }
        if(elementSum - digitSum < 0){
            return (elementSum - digitSum) * -1;
        }
        return elementSum - digitSum;
    }
}