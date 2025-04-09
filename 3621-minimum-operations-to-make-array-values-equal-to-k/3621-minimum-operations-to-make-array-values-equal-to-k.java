class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> greaterSet = new HashSet<>();
        for(int index = 0; index < nums.length; index++){
            if(!greaterSet.contains(nums[index]) && nums[index] > k){
                greaterSet.add(nums[index]);
            }
            else if(nums[index] < k){
                return -1;
            }
        }
        return greaterSet.size();
    }
}