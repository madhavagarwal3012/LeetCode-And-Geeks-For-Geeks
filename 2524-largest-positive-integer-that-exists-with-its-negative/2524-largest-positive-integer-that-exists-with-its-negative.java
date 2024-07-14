class Solution {
    public int findMaxK(int[] nums) {
        int largestElement = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(map.containsKey(nums[index]) && map.containsKey(-nums[index])){
                if(nums[index] > largestElement){
                    largestElement = nums[index];
                }
            }
        }
        return largestElement;
    }
}