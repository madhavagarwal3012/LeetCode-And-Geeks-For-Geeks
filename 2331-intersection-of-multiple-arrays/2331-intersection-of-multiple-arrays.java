class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> intersectionList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int row = 0; row < nums.length; row++){
            for(int column = 0; column < nums[row].length; column++){
                if(row == nums.length - 1){
                    Arrays.sort(nums[row]);
                }
                if(!map.containsKey(nums[row][column])){
                    map.put(nums[row][column], 1);
                    if(map.get(nums[row][column]) == nums.length){
                        intersectionList.add(nums[row][column]);
                    }
                }
                else{
                    map.put(nums[row][column], map.get(nums[row][column]) + 1);
                    if(map.get(nums[row][column]) == nums.length){
                        intersectionList.add(nums[row][column]);
                    }
                }
            }
        }
        return intersectionList;
    }
}