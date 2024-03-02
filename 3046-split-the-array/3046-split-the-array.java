class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2==0){
            int count=1;
            int index=0;
            while(index<nums.length){
                int duplicate=nums[index];
                int subIndex=0;
                while(subIndex<nums.length){
                    if(subIndex==index){
                        subIndex++;
                        if(subIndex==nums.length){
                            return true;
                        }
                    }
                    if(nums[subIndex]==duplicate){
                        count++;
                    }
                    subIndex++;
                }
                if(count>2){
                    return false;
                }
                count=1;
                index++;
            }
        }
        return false;
    }
}