class Solution {
    public int[] numberGame(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                if(nums[index] < minimum){
                    minimum = nums[index];
                }
                if(nums[index] > maximum){
                    maximum = nums[index];
                }
                map.put(nums[index], 1);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        int index = 0;
        for(int count = minimum; count <= maximum; count++){
            if(map.containsKey(count)){
                for(int frequency = map.get(count); frequency > 0; frequency--){
                    nums[index] = count;
                    index++;
                }
            }
        }
        map.clear();
        for(index = 0; index < nums.length - 1; index+=2){
            int temp = nums[index];
            nums[index] = nums[index + 1];
            nums[index + 1] = temp;
        }
        return nums;
    }
}