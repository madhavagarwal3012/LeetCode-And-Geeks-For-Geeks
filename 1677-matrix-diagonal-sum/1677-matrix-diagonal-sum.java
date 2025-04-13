class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0, column = 0; row < mat.length && column < mat[row].length; row++, column++){
            sum += mat[row][column];
        }
        for(int row = 0, column = mat[row].length - 1; row < mat.length && column >= 0; row++, column--){
            if(row == column){
                continue;
            }
            sum += mat[row][column];
        }
        return sum;
    }
}