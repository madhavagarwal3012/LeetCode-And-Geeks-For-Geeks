class Solution {
    static int[] rowCoordinates = {-1, -1, -1};
    static int[] columnCoordinates = {0, -1 , 1};	

    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        List<List<String>> queenPlacements = new ArrayList<>();
        solveQueens(board, n, 0, queenPlacements);
        return queenPlacements;
    }
    private static void solveQueens(int[][] board, int boardSize, int row, List<List<String>> queenPlacements){
        if(row == boardSize){
            List<String> qBoard = new ArrayList<>();
            StringBuilder qRow = new StringBuilder();
            for(int r = 0; r < boardSize; r++){
                for(int c = 0; c < boardSize; c++){
                    if(board[r][c] == 1){
                        qRow.append('Q');
                    }
                    else{
                        qRow.append('.');
                    }
                }
                qBoard.add(qRow.toString());
                qRow.setLength(0);
            }
            queenPlacements.add(qBoard);
            return;
        }
        for(int c = 0; c < boardSize; c++){
            if(isBoardSafe(board, boardSize, row, c)){
                board[row][c] = 1;
                solveQueens(board, boardSize, row + 1, queenPlacements);
                board[row][c] = 0;
            }
        }
    }
    private static boolean isBoardSafe(int[][] board, int boardSize, int currentRow, int currentColumn){
		for(int direction = 0; direction < 3; direction++){
			int newRow = currentRow + rowCoordinates[direction];
			int newColumn = currentColumn + columnCoordinates[direction];

			while(newRow >= 0 && newRow < boardSize && newColumn >= 0 && newColumn < boardSize){
				if(board[newRow][newColumn] == 1){
					return false;
				}
				newRow += rowCoordinates[direction];
				newColumn += columnCoordinates[direction];
			}
		}
		return true;
	}
}