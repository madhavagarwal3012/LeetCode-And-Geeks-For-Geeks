class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        boolean distinct = false;
        
        int minimumNumber = 0;
        int removedElementIndex = 0;
        int index = 0;
        while(!distinct){
            for(index = removedElementIndex; index < nums.length; index++){
                if(!uniqueSet.contains(nums[index])){
                    uniqueSet.add(nums[index]);
                }
                else{
                    removedElementIndex+=3;
                    uniqueSet.clear();
                    minimumNumber++;
                    break;
                }
            }
            if(index == nums.length || removedElementIndex > nums.length){
                distinct = true;
            }
        }
        return minimumNumber;
    }
}