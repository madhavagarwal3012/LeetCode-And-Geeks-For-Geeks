class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        int evenIndex = 0;
        int oddIndex = 0;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] % 2 == 0){
                evenList.add(nums[index]);
            }
            else{
                oddList.add(nums[index]);
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(evenIndex < evenList.size()){
                nums[index] = evenList.get(evenIndex);
                evenIndex++;
            }
            else if(oddIndex < oddList.size()){
                nums[index] = oddList.get(oddIndex);
                oddIndex++;
            }
        }
        return nums;
    }
}