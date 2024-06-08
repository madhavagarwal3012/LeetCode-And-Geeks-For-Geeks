class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean present = false;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int row=0; row < rows; row++){
            for(int column=0; column < columns; column++){
                if(matrix[row][column] == target){
                    return true;
                }
            }
        }
        return present;
    }
}