class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        ArrayList<Integer> evenIndex = new ArrayList<>();
        ArrayList<Integer> oddIndex = new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(index % 2 == 0){
                if(nums[index] % 2 == 1){
                    oddList.add(nums[index]);
                    oddIndex.add(index);
                }
                if(!evenList.isEmpty() && !oddList.isEmpty()){
                    nums[evenIndex.get(0)] = oddList.get(0);
                    nums[oddIndex.get(0)] = evenList.get(0);

                    oddList.remove(0);
                    oddIndex.remove(0);

                    evenList.remove(0);
                    evenIndex.remove(0);
                }
            }
            else{
                if(nums[index] % 2 == 0){
                    evenList.add(nums[index]);
                    evenIndex.add(index);
                }
                if(!evenList.isEmpty() && !oddList.isEmpty()){
                    nums[evenIndex.get(0)] = oddList.get(0);
                    nums[oddIndex.get(0)] = evenList.get(0);

                    oddList.remove(0);
                    oddIndex.remove(0);

                    evenList.remove(0);
                    evenIndex.remove(0);
                }
            }
        }
        return nums;
    }
}