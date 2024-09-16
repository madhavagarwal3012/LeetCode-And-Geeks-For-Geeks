class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int newIndex = 0;
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
                nums[newIndex] = nums[index];
                newIndex++; 
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
                if(map.get(nums[index]) == 2){
                    nums[newIndex] = nums[index];
                    newIndex++; 
                }
            }
            if(map.get(nums[index]) <= 2){
                count++;
            }
        }
        return count;
    }
}