class Solution {
    public void permuteHelper(List<List<Integer>> permutationList, List<Integer> tempList, int nums []){
        if(tempList.size() == nums.length){
            permutationList.add(new ArrayList<>(tempList));
            return;
        }
        for(int index = 0; index < nums.length; index++){
            if(tempList.contains(nums[index])){
                continue;
            }
            tempList.add(nums[index]);
            permuteHelper(permutationList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        permuteHelper(permutationList, new ArrayList<>(), nums);
        return permutationList;
    }
}