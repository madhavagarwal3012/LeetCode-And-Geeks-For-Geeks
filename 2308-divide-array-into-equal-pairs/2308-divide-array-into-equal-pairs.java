class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 == 1){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> uniqueElementsList = new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
                uniqueElementsList.add(nums[index]);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        for(int index = 0; index < uniqueElementsList.size(); index++){
            if(map.get(uniqueElementsList.get(index)) % 2 == 1){
                return false;
            }
        }
        return true;
    }
}