class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> keys = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] % 2 == 0){
                if(!map.containsKey(nums[index])){
                    keys.add(nums[index]);
                    map.put(nums[index],1);
                }
                else{
                    map.put(nums[index], map.get(nums[index])+1);
                }
            }
        }
        int frequency = Integer.MIN_VALUE;
        int maximumFrequencyElement = -1;
        for(int index = 0; index < keys.size(); index++){
            if(frequency < map.get(keys.get(index))){
                frequency = map.get(keys.get(index));
                maximumFrequencyElement = keys.get(index);
            }
        }
        return maximumFrequencyElement;
    }
}