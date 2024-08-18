class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Boolean> mapList = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
                if(map.get(nums[index]) > nums.length / 3){
                    if(!mapList.containsKey(nums[index])){
                        mapList.put(nums[index], true);
                        list.add(nums[index]);
                    }
                }
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
                if(map.get(nums[index]) > nums.length / 3){
                    if(!mapList.containsKey(nums[index])){
                        mapList.put(nums[index], true);
                        list.add(nums[index]);
                    }
                }
            }
        }
        return list;
    }
}