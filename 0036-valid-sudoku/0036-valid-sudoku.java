class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = 0;
        while(row < 9){
            HashSet<Character> rowSet = new HashSet<>();
            int column = 0;
            while(column < 9){
                if(board[row][column] == '.'){
                    column++;
                    continue;
                }
                if(rowSet.contains(board[row][column])){
                    return false;
                }
                rowSet.add(board[row][column]);
                column++;
            }
            row++;
        }

        int column = 0;
        while(column < 9){
            HashSet<Character> columnSet = new HashSet<>();
            row = 0;
            while(row < 9){
                if(board[row][column] == '.'){
                    row++;
                    continue;
                }
                if(columnSet.contains(board[row][column])){
                    return false;
                }
                columnSet.add(board[row][column]);
                row++;
            }
            column++;
        }

        int blockCount = 0;
        int blockDivision = 0;
        int rowPoint = 0;
        int columnPoint = 0;

        while(blockCount < 9){
            int startPointR = 0;
            row = rowPoint;
            HashSet<Character> blockSet = new HashSet<>();
            while(startPointR < 3){
                int startPointC = 0;
                column = columnPoint;
                while(startPointC < 3){
                    if(board[row][column] == '.'){
                        startPointC++;
                        column++;
                        continue;
                    }
                    if(blockSet.contains(board[row][column])){
                        return false;
                    }
                    blockSet.add(board[row][column]);
                    column++;
                    startPointC++;
                }
                row++;
                startPointR++;
            }
            startPointR = 0;
            blockCount++;
            columnPoint += 3;
            if(blockCount % 3 == 0){
                columnPoint = 0;
                rowPoint += 3;
            }
        }
        return true;
    }
}