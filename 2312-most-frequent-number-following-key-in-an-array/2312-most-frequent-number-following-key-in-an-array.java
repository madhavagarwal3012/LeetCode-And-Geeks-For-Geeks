class Solution {
    public int mostFrequent(int[] nums, int key) {
        int maximumFrequencyKey = 0;
        int maximumFrequencyKeyValue = Integer.MIN_VALUE;
        int targetIndex = 0;
        ArrayList<Integer> keyList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index <= nums.length - 2; index++){
            if(nums[index] == key){
                if(!map.containsKey(nums[index + 1])){
                    keyList.add(nums[index + 1]);
                    map.put(nums[index + 1], 1);
                }
                else{
                    map.put(nums[index + 1], map.get(nums[index + 1]) + 1);
                }
            }
        }
        for(int index = 0; index < keyList.size(); index++){
            if(map.get(keyList.get(index)) > maximumFrequencyKeyValue){
                maximumFrequencyKey = keyList.get(index);
                maximumFrequencyKeyValue = map.get(keyList.get(index));
            }
        }
        return maximumFrequencyKey;
    }
}