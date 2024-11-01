class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int rowCount = 0; rowCount < matrix.length; rowCount++){
            for(int columnCount = 0; columnCount < matrix[0].length; columnCount++){
                if(rowCount > 0 && columnCount > 0){
                    if(matrix[rowCount][columnCount] != matrix[rowCount - 1][columnCount - 1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}