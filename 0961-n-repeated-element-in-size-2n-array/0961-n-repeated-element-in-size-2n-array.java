class Solution {
    public int repeatedNTimes(int[] nums) {
        int Element=0,repeatedElement=0,index=0;
        
        while(index<nums.length){
            Element=nums[index];
            int subIndex=0;
            while(subIndex<nums.length){
                if(subIndex==index){
                    subIndex++;
                }
                else{
                    if(Element==nums[subIndex]){
                        repeatedElement=Element;
                    }
                    subIndex++;
                }
            }
            index++;
        }
        return repeatedElement;
    }
}