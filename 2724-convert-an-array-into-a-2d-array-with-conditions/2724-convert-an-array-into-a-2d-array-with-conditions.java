class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2D = new ArrayList<>();

        for(int index = 0; index < nums.length; index++){
            if(!map.containsKey(nums[index])){
                map.put(nums[index], 1);
                list.add(nums[index]);
            }
            else{
                map.put(nums[index], map.get(nums[index]) + 1);
            }
        }
        while(!list.isEmpty()){
            List<Integer> rowList = new ArrayList<>();
            int listSize = list.size();
            for(int index = 0; index < listSize; index++){
                rowList.add(list.get(index));
                map.put(list.get(index), map.get(list.get(index)) - 1);
                if(map.get(list.get(index)) == 0){
                    map.remove(list.get(index));
                    list.remove(index);
                    listSize--;
                    index--;
                }
            }
            list2D.add(rowList);
        }
        return list2D;
    }
}