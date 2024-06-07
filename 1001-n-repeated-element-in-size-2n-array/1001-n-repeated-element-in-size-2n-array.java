class Solution {
    public int repeatedNTimes(int[] nums) {
        int repeatedElement=0,index=0;
        
        while(index<nums.length){
            repeatedElement=nums[index];
            int subIndex=0;
            while(subIndex<nums.length){
                if(subIndex==index){
                    subIndex++;
                }
                else{
                    if(repeatedElement==nums[subIndex]){
                        return repeatedElement;
                    }
                    subIndex++;
                }
            }
            index++;
        }
        return repeatedElement;
    }
}