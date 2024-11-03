class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        int occurences [] = new int[queries.length];
        for(int index = 0; index < nums.length; index++){
            if(nums[index] == x){
                list.add(index);
            }
        }
        if(list.size() == 0){
            for(int index = 0; index < occurences.length; index++){
                occurences[index] = - 1;
            }
        }
        else{
            for(int index = 0; index < occurences.length; index++){
                if(queries[index] <= list.size()){
                    occurences[index] = list.get(queries[index] - 1);
                }
                else{
                    occurences[index] = -1;
                }
            }
        }
        return occurences;
    }
}