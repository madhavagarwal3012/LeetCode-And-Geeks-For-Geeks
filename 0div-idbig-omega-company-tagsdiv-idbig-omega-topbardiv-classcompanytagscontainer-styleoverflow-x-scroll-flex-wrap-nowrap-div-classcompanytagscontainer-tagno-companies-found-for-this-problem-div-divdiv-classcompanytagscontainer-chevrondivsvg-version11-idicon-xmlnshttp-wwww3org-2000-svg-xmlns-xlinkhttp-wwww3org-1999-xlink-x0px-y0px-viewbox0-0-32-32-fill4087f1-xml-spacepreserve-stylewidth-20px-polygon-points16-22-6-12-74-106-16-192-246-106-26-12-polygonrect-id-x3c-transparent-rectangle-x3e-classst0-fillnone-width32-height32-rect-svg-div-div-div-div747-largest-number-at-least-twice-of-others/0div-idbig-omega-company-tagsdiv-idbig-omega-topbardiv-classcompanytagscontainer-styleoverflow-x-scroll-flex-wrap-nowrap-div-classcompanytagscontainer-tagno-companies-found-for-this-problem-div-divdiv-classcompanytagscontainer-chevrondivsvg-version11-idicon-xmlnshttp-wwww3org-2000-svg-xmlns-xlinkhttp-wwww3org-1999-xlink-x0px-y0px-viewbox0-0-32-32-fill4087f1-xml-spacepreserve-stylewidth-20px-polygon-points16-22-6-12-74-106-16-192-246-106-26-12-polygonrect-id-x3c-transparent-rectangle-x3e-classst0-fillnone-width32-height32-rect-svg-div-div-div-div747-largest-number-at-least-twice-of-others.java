class Solution {
    public int dominantIndex(int[] nums) {
        int start=0;
        int end=nums.length;
        int count=-1;
        int largest=Integer.MIN_VALUE;
        
        while(start<end){
            if(nums[start]>largest){
                largest=nums[start];
                count=start;
            }
            start++;
        }
        start=0;
        int ind=0;
        while(start<end){
            if(largest>=nums[start]*2 && count!=start){
                ind++;
                start++;
            }
            else{
                start++;
            }
        }
        start--;
        if(start==ind){
         return count;
        }
        else{
         return -1;
        }
    }
}