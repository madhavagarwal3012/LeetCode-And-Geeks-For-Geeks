class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                sum = sum + nums[index];
                map.put(nums[index],1);
            }
            else if(map.get(nums[index]) > 0){
                sum = sum - nums[index];
                map.put(nums[index] , 0);
            }
        }
        return sum;
    }
}