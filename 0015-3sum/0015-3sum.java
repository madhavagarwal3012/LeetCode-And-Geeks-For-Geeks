class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSumList = new ArrayList<>();
        HashMap<List<Integer>, Boolean> listMap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int low = index + 1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[index] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> sumList = new ArrayList<>();
                    sumList.add(nums[index]);
                    sumList.add(nums[low]);
                    sumList.add(nums[high]);
                    if(!listMap.containsKey(sumList)){
                        listMap.put(sumList,true);
                        threeSumList.add(sumList);
                    }
					low++;
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