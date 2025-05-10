class Solution {
    public int[][] generateMatrix(int n) {
        int topLeftToRight = n;
        int topToBottomRight = n - 1;
        int bottomRightToLeft = n - 1;
        int bottomToTopLeft = n - 2;

        int columnRange = n;

        int count = 1;
        int[][] matrix = new int[n][n];
        int row = 0;
        int column = 0;
        while(count <= n * n){
            for(int topLeft = 1; topLeft <= topLeftToRight; topLeft++){
                matrix[row][column] = count;
                count++;
                column++;
            }

            if(count == n * n){
                break;
            }
            else{
                topLeftToRight-=2;
                row++;
                column = --columnRange;
            }

            for(int topRight = 1; topRight <= topToBottomRight; topRight++){
                matrix[row][column] = count;
                count++;
                row++;
            }
            topToBottomRight-=2;
            row--;
            column--;

            for(int bottomRight = 1; bottomRight <= bottomRightToLeft; bottomRight++){
                matrix[row][column] = count;
                count++;
                column--;
            }
            bottomRightToLeft-=2;
            row--;
            column++;

            for(int bottomLeft = 1; bottomLeft <= bottomToTopLeft; bottomLeft++){
                matrix[row][column] = count;
                count++;
                row--;
            }
            bottomToTopLeft-=2;
            row++;
            column++;
        }
        return matrix;
    }
}