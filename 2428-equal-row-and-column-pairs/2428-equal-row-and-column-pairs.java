class Solution {
    public int equalPairs(int[][] grid) {
        int equalRowColumnPairCount = 0;
        HashMap<List<Integer>, Integer> columnListMap = new HashMap<>();
        for(int column = 0; column < grid[0].length; column++){
            List<Integer> columnList = new ArrayList<>();
            for(int row = 0; row < grid.length; row++){
                columnList.add(grid[row][column]);
            }
            if(!columnListMap.containsKey(columnList)){
                columnListMap.put(columnList, 1);
            }
            else{
                columnListMap.put(columnList, columnListMap.get(columnList) + 1);
            }
        }
        for(int row = 0; row < grid.length; row++){
            List<Integer> columnList = new ArrayList<>();
            for(int column = 0; column < grid[row].length; column++){
                columnList.add(grid[row][column]);
            }
            if(columnListMap.containsKey(columnList)){
                equalRowColumnPairCount+= columnListMap.get(columnList);
                
            }
        }
        return equalRowColumnPairCount;
    }
}