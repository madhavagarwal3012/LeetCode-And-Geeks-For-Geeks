import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int check = 0;
        Arrays.sort(nums);
        int start = 0;
        int missingNumber = 0;
        
        while (start < len - 1) {
            int j = start + 1;
            if (nums[start] == len) {
                check = 1;
            }
            if ((nums[start] + 1) == nums[j]) {
                start++;
            } 
            else {
                missingNumber = nums[start] + 1;
                start++;
            }
        }
        if (nums[start] == len) {
            check = 1;
        }
        if (check == 0) {
            return len;
        }
        return missingNumber;
    }
}
