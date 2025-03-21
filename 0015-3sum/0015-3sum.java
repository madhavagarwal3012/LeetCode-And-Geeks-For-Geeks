class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSumList = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(index > 0 && nums[index] == nums[index - 1]) continue;
            int low = index + 1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[index] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> sumList = new ArrayList<>();
                    sumList.add(nums[index]);
                    sumList.add(nums[low]);
                    sumList.add(nums[high]);
                    threeSumList.add(sumList);
                    
                    while (low < high && nums[low] == nums[low + 1]) low++;  
                    while (low < high && nums[high] == nums[high - 1]) high--; 

                    low++;  
                    high--; 
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    low++;
                }

            }
        }
        return threeSumList;
    }
}