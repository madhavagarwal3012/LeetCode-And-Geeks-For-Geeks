class Solution {
    private static boolean isValid(char[][] board, int row, int column, char character){
        for(int verticalCheck = 0; verticalCheck < 9; verticalCheck++){
            if(board[verticalCheck][column] == character){
                return false;
            }
        }
        for(int horizontalCheck = 0; horizontalCheck < 9; horizontalCheck++){
            if(board[row][horizontalCheck] == character){
                return false;
            }
        }
        int startingRow = (row/3) * 3;
        int startingColumn = (column/3) * 3;
        for(int sRow = startingRow; sRow <= startingRow + 2; sRow++){
            for(int sColumn = startingColumn; sColumn <= startingColumn + 2; sColumn++){
                if(board[sRow][sColumn] == character){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean solve(char[][] board){
        for(int row = 0; row < 9; row++){
            for(int column = 0; column < 9; column++){
                if(board[row][column] == '.'){
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isValid(board, row, column, ch)){
                            board[row][column] = ch;
                            if(solve(board)){
                                return true;
                            }
                            board[row][column] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}