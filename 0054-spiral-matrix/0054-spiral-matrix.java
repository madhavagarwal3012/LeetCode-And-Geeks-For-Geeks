class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = 0, count = 0, steps = rows * columns;
        int inCol = 0;                           // Variable to track inward columns
        List<Integer> spiral = new ArrayList<>();

        while (count < steps) {                  // Loop until all elements are visited
            while (column < columns) {           // Traverse from left to right
                if (count == steps) {            // Check if all elements are visited
                    return spiral;
                }
                spiral.add(matrix[row][column]); // Add current element to the result list
                count++;
                column++;
            }
            columns--;                           // Adjust column boundary and position
            column--;
            row++;

            while (row < rows) {
                if (count == steps) {            // Traverse from top to bottom
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                row++;
            }
            row--;
            column--;

            while (column >= 0 + inCol) {         // Traverse from right to left
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                column--;
            }
            column++;
            row--;

            while (row > 0 + inCol) {             // Traverse from bottom to top
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                row--;
            }
            inCol++;                       // Update inward column count and adjust row boundary
            rows--;
            row++;
            column++;
        }
        return spiral;
    }
}
