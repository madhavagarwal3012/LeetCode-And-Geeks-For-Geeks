class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int index = 0;
        int negativeCount = 0;

        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                if(grid[row][column] < 0){
                    negativeCount++;
                }
            }
        }
        return negativeCount;
    }
}