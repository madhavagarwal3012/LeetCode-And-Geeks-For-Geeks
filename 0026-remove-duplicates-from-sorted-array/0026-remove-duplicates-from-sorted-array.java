class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> uniqueList =  new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], true);
                uniqueList.add(nums[index]);
            }
        }
        for(int index = 0; index < uniqueList.size(); index++){
            nums[index] = uniqueList.get(index);
        }
        return uniqueList.size();
    }
}