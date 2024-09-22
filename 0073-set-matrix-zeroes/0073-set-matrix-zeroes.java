class Solution {
    public void setZeroes(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                if(matrix[row][column] == 0){
                    for(int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++){
                        if(matrix[row][columnIndex] != 0){
                            matrix[row][columnIndex] = 786;
                        }
                    }
                    for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
                        if(matrix[rowIndex][column] != 0){
                            matrix[rowIndex][column] = 786;
                        }
                    }
                }
            }
        }
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                if(matrix[row][column] == 786){
                    matrix[row][column] = 0;
                }
            }
        }
    }
}