class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=nums.length;

        int arr[]=new int[2];
        int k=0;
        while(start<end){
            int j=start+1;
            while(j<end){
                 if(nums[start]+nums[j]==target){
                    arr[k]=start;
                    arr[k+1]=j;
            }
            j++;
               
        }
        start++;
        }
        return arr;
    }
}