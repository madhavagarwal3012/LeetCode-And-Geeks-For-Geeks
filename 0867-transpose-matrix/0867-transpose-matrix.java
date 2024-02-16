class Solution {
    public int[][] transpose(int[][] matrix) {
        int row_length=matrix.length;
		int column_length=matrix[0].length;
		
		int transpose [][]= new int [column_length][row_length];

		int row=0;

		while(row<row_length){
			int column=0;
			while(column<column_length){
				transpose[column][row]=matrix[row][column];
				column++;
			}
			row++;
		}
		return transpose;
    }
}