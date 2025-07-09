class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || word.length() == 0){
            return false;
        }
        int[][] visited = new int[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if(board[row][column] == word.charAt(0)){
                    if(search(board, word, visited, 1, row, column, board.length, board[0].length)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static boolean search(char[][] board, String word, int[][] visited, int characterIndex, int row, int column, int rowSize, int columnSize){
        if(characterIndex == word.length()){
            return true;
        }
        visited[row][column] = 1;
        if(row - 1 >= 0 && visited[row - 1][column] == 0 && board[row - 1][column] == word.charAt(characterIndex)){
            if(search(board, word, visited, characterIndex + 1, row - 1, column, rowSize, columnSize)){
                return true;
            }
        }
        if(row + 1 < rowSize && visited[row + 1][column] == 0 && board[row + 1][column] == word.charAt(characterIndex)){
            if(search(board, word, visited, characterIndex + 1, row + 1, column, rowSize, columnSize)){
                return true;
            }
        }
        if(column - 1 >= 0  && visited[row][column - 1] == 0 && board[row][column - 1] == word.charAt(characterIndex)){
            if(search(board, word, visited, characterIndex + 1, row, column - 1, rowSize, columnSize)){
                return true;
            }
        }
        if(column + 1 < columnSize  && visited[row][column + 1] == 0 && board[row][column + 1] == word.charAt(characterIndex)){
            if(search(board, word, visited, characterIndex + 1, row, column + 1, rowSize, columnSize)){
                return true;
            }
        }
        visited[row][column] = 0;
        return false;
    }
}