class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], index);
            }
            else{
                if(Math.abs(map.get(nums[index]) - index) <= k){
                    return true;
                }
                map.put(nums[index], index);
            }
        }
        return false;
    }
}