class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
                if(map.get(nums[index]) == 2){
                    list.add(nums[index]);
                }
            }
        }
        return list;
    }
}