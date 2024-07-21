class Solution {
    public int[] sortArrayByParityII(int[] nums) {
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
            if(index % 2 == 0){
                nums[index] = evenList.get(evenIndex);
                evenIndex++;
            }
            else{
                nums[index] = oddList.get(oddIndex);
                oddIndex++;
            }
        }
        return nums;
    }
}