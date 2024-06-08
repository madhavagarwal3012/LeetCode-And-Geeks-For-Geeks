class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int index = 0;

        while(index < nums.length){
            String digits = String.valueOf(nums[index]);
            if(digits.length() % 2 == 0){
                count++;
            }
            index++;
        }
        return count;
    }
}