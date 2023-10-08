import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int check=0;
        Arrays.sort(nums);
        int start=0;
        int missing_number=0;
        while(start<len-1){
            int j=start+1;
            if(nums[start]==nums.length){
                check=1;
            }
            if((nums[start]+1)==nums[j]){
                start++;
            }
            else{
                missing_number=nums[start]+1;
                start++;
            }
        }
        if(nums[start]==nums.length){
          check=1;
        }
        if(check==0){
          return nums.length;
        }
        return missing_number;
    }
}