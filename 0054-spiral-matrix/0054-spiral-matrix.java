class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int topLeftToRight = matrix[0].length;
        int topToBottomRight = matrix.length - 1;
        int bottomRightToLeft = matrix[0].length - 1;
        int bottomToTopLeft = matrix.length - 2;

        int columnRange = matrix[0].length;

        List<Integer> spiralList = new ArrayList<>();
        int row = 0;
        int column = 0;
        while(spiralList.size() < matrix.length * matrix[0].length){
            for(int topLeft = 1; topLeft <= topLeftToRight; topLeft++){
                spiralList.add(matrix[row][column]);
                column++;
            }
            topLeftToRight-=2;
            row++;
            column = --columnRange;
            if(spiralList.size() == matrix.length * matrix[0].length){
                break;
            }

            for(int topRight = 1; topRight <= topToBottomRight; topRight++){
                spiralList.add(matrix[row][column]);
                row++;
            }
            topToBottomRight-=2;
            row--;
            column--;
            if(spiralList.size() == matrix.length * matrix[0].length){
                break;
            }

            for(int bottomRight = 1; bottomRight <= bottomRightToLeft; bottomRight++){
                spiralList.add(matrix[row][column]);
                column--;
            }
            bottomRightToLeft-=2;
            row--;
            column++;
            if(spiralList.size() == matrix.length * matrix[0].length){
                break;
            }

            for(int bottomLeft = 1; bottomLeft <= bottomToTopLeft; bottomLeft++){
                spiralList.add(matrix[row][column]);
                row--;
            }
            bottomToTopLeft-=2;
            row++;
            column++;
            if(spiralList.size() == matrix.length * matrix[0].length){
                break;
            }
        }
        return spiralList;
    }
}