class Solution {
    public int nOP(int[][] grid, int k, int row, int column, int sum, long[][][] result){
        if(row < 0 || column < 0 || row >= grid.length || column>= grid[0].length) return 0;
        if(row == grid.length - 1 && column == grid[0].length - 1) {
            sum += grid[row][column];
            if(sum % k == 0) return 1;
            return 0;
        }
        if(result[row][column][sum % k] != 0){
            return (int)result[row][column][sum % k];
        }
        long right = nOP(grid, k, row, column + 1, sum + grid[row][column], result);
        long down = nOP(grid, k, row + 1, column, sum + grid[row][column], result);

        result[row][column][sum % k ] = ((right % 1000000007) + (down % 1000000007)) % 1000000007;
        return (int)result[row][column][sum % k ];
    }
    public int numberOfPaths(int[][] grid, int k) {
        long [][][] result = new long[grid.length][grid[0].length][k];
        return nOP(grid, k, 0, 0, 0, result);
    }
}