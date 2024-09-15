class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int array[] = new int[2];
        int arrayIndex = 0;
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
                if(map.get(nums[index]) == 2){
                    array[arrayIndex] = nums[index];
                    arrayIndex++;
                }
            }
        }
        return array;
    }
}