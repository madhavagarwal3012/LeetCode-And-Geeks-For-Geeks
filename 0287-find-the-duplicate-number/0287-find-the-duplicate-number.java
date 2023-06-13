import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        int end=nums.length;
        int start=0;
        int j=1;
        int duplicate=0;
        
        Arrays.sort(nums);
        while(start<end){
            if(nums[start]==nums[j]){
                duplicate=nums[start];
                break;
            }
            
            
            // int duplicate_count=0;
            // int j=0;
            // while(j<end){
            //     if(start!=j && nums[start]==nums[j]){
            //         duplicate_count++;
            //         break;
            //     }
            //     j++;
            // }
            // if(duplicate_count>0){
            //     duplicate = nums[start];
            //     break;
            // }
            
            start++;
            j++;
        }
      return duplicate;
        
    }
}