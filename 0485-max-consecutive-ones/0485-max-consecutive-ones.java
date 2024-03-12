class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount=0;
        int numberofOnes=0;
        int index=0;
        
        while(index<nums.length){
            if(nums[index]==1){
                numberofOnes++;
            }
            else{
                if(oneCount<numberofOnes){
                    oneCount=numberofOnes;
                }
                numberofOnes=0;
            }
            index++;
        }
        if(oneCount<numberofOnes){
            oneCount=numberofOnes;
        }
        return oneCount;
    }
}