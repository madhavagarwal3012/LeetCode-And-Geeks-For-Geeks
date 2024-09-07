class Solution {
    public int[] twoSum(int[] nums, int target) {
        int positions[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < nums.length; index++){
            map.put(nums[index], index);
        }
        for(int index = 0; index < nums.length; index++){
            if(map.containsKey(target - nums[index]) && map.get(target - nums[index]) != index){
                positions[0] = index;
                positions[1] = map.get(target - nums[index]);
                break;
            }
        }
        return positions;
    }
}