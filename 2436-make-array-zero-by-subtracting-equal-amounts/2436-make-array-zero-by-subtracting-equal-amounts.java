class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index]) && nums[index] != 0){
                map.put(nums[index], true);
            }
        }
        return map.size();
    }
}