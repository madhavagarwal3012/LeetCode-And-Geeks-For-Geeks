class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Initialize variables
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = 0, count = 0, steps = rows * columns;
        int inCol = 0; // Variable to track inward columns
        List<Integer> spiral = new ArrayList<>();

        // Loop until all elements are visited
        while (count < steps) {
            // Traverse from left to right
            while (column < columns) {
                // Check if all elements are visited
                if (count == steps) {
                    return spiral;
                }
                // Add current element to the result list
                spiral.add(matrix[row][column]);
                count++;
                column++;
            }
            // Adjust column boundary and position
            columns--;
            column--;
            row++;

            // Traverse from top to bottom
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

            // Traverse from right to left
            while (column >= 0 + inCol) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                column--;
            }
            column++;
            row--;

            // Traverse from bottom to top
            while (row > 0 + inCol) {
                if (count == steps) {
                    return spiral;
                }
                spiral.add(matrix[row][column]);
                count++;
                row--;
            }
            // Update inward column count and adjust row boundary
            inCol++;
            rows--;
            row++;
            column++;
        }
        return spiral;
    }
}
