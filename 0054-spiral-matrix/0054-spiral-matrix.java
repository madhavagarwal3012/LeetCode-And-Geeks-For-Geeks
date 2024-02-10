class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length,columns=matrix[0].length,row = 0, column = 0, count = 0, steps = rows * columns,inCol=0;
        List<Integer> spiral = new ArrayList<>();

        while (count < steps) {
            while (column < columns) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                column++;
            }
            columns--;
            column--;
            row++;
            while (row < rows) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                row++;
            }
            row--;
            column--;
            while (column >= 0+inCol) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                column--;
            }
            column++;
            row--;
            while (row > 0+inCol) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                row--;
            }
            inCol++;
            rows--;
            row++;
            column++;
        }
        return spiral;
    }
}