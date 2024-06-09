class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean found = false;
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                if(matrix[row][columns-1] > target){
                    rows = row + 1;
                }
                if(matrix[row][column] ==  target){
                    found = true;
                }
            }
        }
        return found;
    }
}