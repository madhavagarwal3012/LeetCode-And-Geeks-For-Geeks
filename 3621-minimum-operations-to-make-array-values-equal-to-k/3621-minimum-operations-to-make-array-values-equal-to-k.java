class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> greaterSet = new HashSet<>();
        int size = 0;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] < k){
                return -1;
            }
            else if(!greaterSet.contains(nums[index]) && nums[index] > k){
                greaterSet.add(nums[index]);
                size++;
            }
        }
        return size;
    }
}