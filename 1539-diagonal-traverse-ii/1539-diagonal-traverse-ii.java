class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int totalElements = 0;
        HashMap<Integer, List<Integer>> diagonalMap = new HashMap<>();

        for(int row = 0; row < nums.size(); row++){
            for(int column = 0; column < nums.get(row).size(); column++){
                if(!diagonalMap.containsKey(row + column)){
                    diagonalMap.put(row + column, new ArrayList<>());
                    diagonalMap.get(row + column).add(nums.get(row).get(column));
                }
                else{
                    diagonalMap.get(row + column).add(nums.get(row).get(column));
                }
                totalElements++;
            }
        }
        int[] arr = new int[totalElements];
        int mapIndex = 0;
        int index = 0;
        while(mapIndex < diagonalMap.size()){
            List<Integer> list = diagonalMap.get(mapIndex);
            for(int listIndex = list.size() - 1; listIndex >= 0; listIndex--){
                arr[index] = list.get(listIndex);
                index++;
            }
            mapIndex++;
        }
        return arr;
    }
}