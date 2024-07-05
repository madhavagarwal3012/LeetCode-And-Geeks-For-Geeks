class Solution {

    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for(int row = 0; row < grid.length; row++){
            Arrays.sort(grid[row]);
        }
        for(int column = 0; column < grid[0].length; column++){
            int maximum = grid[0][column];
            for(int row = 1; row < grid.length ; row++){
                if(grid[row][column] > maximum){
                    maximum = grid[row][column];
                }
            }
            sum = sum + maximum;
        }
        return sum;
    }
}