class Solution {
    public void subsetsHelper(int nums [], List<List<Integer>> ans, List<Integer> subset, int startIndex){
        if(startIndex == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[startIndex]);
        subsetsHelper(nums, ans, subset, startIndex + 1);
        subset.remove(subset.size() - 1);
        subsetsHelper(nums, ans, subset, startIndex + 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsetsHelper(nums, ans, subset, 0);
        return ans;
    }
}