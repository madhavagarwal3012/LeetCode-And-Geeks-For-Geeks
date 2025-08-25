class Solution {
    public int[][] sortMatrix(int[][] grid) {
         int startingDiagonalRow = grid.length - 1;
        while(startingDiagonalRow >= 0){
            List<Integer> diagonalElementsList = new ArrayList<>();
            int traversingRow = startingDiagonalRow;
            int traversingColumn = 0;

            while(traversingRow < grid.length && traversingColumn < grid[0].length){
                diagonalElementsList.add(grid[traversingRow++][traversingColumn++]);
            }

            Collections.sort(diagonalElementsList, Collections.reverseOrder());

            traversingRow = startingDiagonalRow;
            traversingColumn = 0;
            int index = 0;

            while(traversingRow < grid.length && traversingColumn < grid[0].length){
                grid[traversingRow++][traversingColumn++] = diagonalElementsList.get(index++);
            }
            startingDiagonalRow--;
        }
        int startingDiagonalColumn = 1;
        while(startingDiagonalColumn < grid[0].length){
            List<Integer> diagonalElementsList = new ArrayList<>();
            int traversingRow = 0;
            int traversingColumn = startingDiagonalColumn;

            while(traversingRow < grid.length && traversingColumn < grid[0].length){
                diagonalElementsList.add(grid[traversingRow++][traversingColumn++]);
            }

            Collections.sort(diagonalElementsList);

            traversingRow = 0;
            traversingColumn = startingDiagonalColumn;
            int index = 0;

            while(traversingRow < grid.length && traversingColumn < grid[0].length){
                grid[traversingRow++][traversingColumn++] = diagonalElementsList.get(index++);
            }
            startingDiagonalColumn++;
        }
        return grid;
    }
}