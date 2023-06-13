class Solution {
    public int majorityElement(int[] nums) {
        int start=0;
        int end=nums.length;
        int element_count=1;
        int majority_element=0;
        
        
        if(end==1){
            majority_element=nums[start];
        }
        
        while(start<end){
            if(element_count>end/2){
                break;
            }
            else{
                element_count=1;
            }
            int j=start+1;
            while(j<end){
                if(nums[start]==nums[j]){
                    majority_element=nums[start];
                    element_count++;
                 }
                j++;
            }
            start++;
        }
        return majority_element;
    }
}