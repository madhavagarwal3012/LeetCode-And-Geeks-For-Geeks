class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] sortedArray = new int[matrix.length * matrix.length];
        int sortedIndex = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                sortedArray[sortedIndex] = matrix[row][column];
                sortedIndex++;
            }
        }
        Arrays.sort(sortedArray);
        return sortedArray[k - 1];
    }
}