import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        int smallestPositive = 1;
        while(index < nums.length){
            if(nums[index]== smallestPositive){
                smallestPositive++;
            }
            index++;
        }
        return smallestPositive;
    }
}