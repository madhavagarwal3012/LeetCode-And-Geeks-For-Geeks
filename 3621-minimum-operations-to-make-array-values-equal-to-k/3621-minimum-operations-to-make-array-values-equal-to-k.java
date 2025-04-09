class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> greaterThanKSet = new HashSet<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] < k){
                return -1;
            }
            else if(!greaterThanKSet.contains(nums[index]) && nums[index] > k){
                greaterThanKSet.add(nums[index]);
            }
        }
        return greaterThanKSet.size();
    }
}