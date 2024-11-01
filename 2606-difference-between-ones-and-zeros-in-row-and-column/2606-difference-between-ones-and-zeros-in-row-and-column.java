class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int diff [][] = new int[0][0];
        List<Integer> onesRowList = new ArrayList<>();
        List<Integer> onesColList = new ArrayList<>();
        List<Integer> zerosRowList = new ArrayList<>();
        List<Integer> zerosColList = new ArrayList<>();
        if(grid.length > 0){
            diff = new int[grid.length][grid[0].length];
        }
        for(int rowCount = 0; rowCount < grid.length; rowCount++){
            for(int columnCount = 0; columnCount < grid[0].length; columnCount++){
                int difference = 0;
                int onesRow = 0;
                int onesCol = 0;
                int zerosRow = 0;
                int zerosCol = 0;
                if(rowCount > onesRowList.size() - 1){
                    for(int rowIndex = 0; rowIndex < grid[0].length; rowIndex++){
                        if(grid[rowCount][rowIndex] ==  1){
                            onesRow++;
                        }
                        else{
                            zerosRow++;
                        }
                    }
                    onesRowList.add(onesRow);
                    zerosRowList.add(zerosRow);
                }
                else{
                    onesRow = onesRowList.get(rowCount);
                    zerosRow = zerosRowList.get(rowCount);
                }
                if(onesColList.size() != grid[0].length){
                    for(int columnIndex = 0; columnIndex < grid.length; columnIndex++){
                        if(grid[columnIndex][columnCount] ==  1){
                            onesCol++;
                        }
                        else{
                            zerosCol++;
                        }
                    }
                    difference = onesRow + onesCol - zerosRow - zerosCol;
                    onesColList.add(onesCol);
                    zerosColList.add(zerosCol);
                }
                else{
                    difference = onesRow + onesColList.get(columnCount) - zerosRow - zerosColList.get(columnCount);
                }
                diff[rowCount][columnCount] = difference;
            }
        }
        return diff;
    }
}