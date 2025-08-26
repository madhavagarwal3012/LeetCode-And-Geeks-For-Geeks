class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        List<Integer> lonelyList = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index] - 1) && !map.containsKey(nums[index] + 1) && map.get(nums[index]) == 1){
                lonelyList.add(nums[index]);
            }
        }
        return lonelyList;
    }
}