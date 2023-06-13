class Solution {
    public int singleNumber(int[] nums) {
        int end=nums.length;
        int index=0;
        int unique=0;
        int unique_count=0;
        if(end==1){
            unique=nums[index];
        }
        while(index<end){
            if(unique_count==end-1){
                break;
            }
            unique_count=0;
            int start=0;
            if(start==index){
                start++;
            }
            while(start<end){

                if(nums[index]==nums[start] && index!=start){
                    break;
                }
                else if(nums[index]!=nums[start]){
                    unique=nums[index];
                    unique_count++;
                }
                start++;

            }
            index++;
        }
        return unique;
    }
}