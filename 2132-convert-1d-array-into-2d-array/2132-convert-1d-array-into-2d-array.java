class Solution {
    public int[][] construct2DArray(int[] original, int rows, int columns) {
        int arr[][] = new int[rows][columns];
        if(rows*columns==original.length){
            int index=0,row=0;
            while(row<rows){
                int column=0;
                while(column<columns){
                    if(index<original.length){
                        arr[row][column]=original[index];
                    }
                    index++;
                    column++;
                }
                row++;
            }
        }
        else{
            int empty [][] = new int[0][0];
            return empty;
        }
        return arr;
    }
}