class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int start=0;
        int end=nums.length;
        int temp=0;
        int count=0;

        while(start<end){
            if(nums[start]==val){
                count++;
            }
            else if(nums[start]!=val){
                temp=nums[start];
                nums[index]=temp;
                index++;
            }
            start++;

        }
        return end-count;
    }
}