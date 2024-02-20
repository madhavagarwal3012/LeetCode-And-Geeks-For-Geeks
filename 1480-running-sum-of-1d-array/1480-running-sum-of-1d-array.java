class Solution {
    public int[] runningSum(int[] nums) {
        int index=0,sum=0,length=nums.length;
        int runningSum []= new int[length];
        
        while(index<length){
            int subIndex=0;
            while(subIndex<=index){
                sum = sum+nums[subIndex];
                subIndex++;
            }
            runningSum[index]=sum;
            sum=0;
            index++;
        }
        return runningSum;
    }
}