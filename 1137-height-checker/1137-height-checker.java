class Solution {
    public int[] sortedArray(int [] heights){
        int sorted[] = new int[heights.length];
        for(int index = 0; index < heights.length; index++){
            sorted[index] = heights[index];
        }
        Arrays.sort(sorted);
        return sorted;
    }
    public int heightChecker(int[] heights) {
        int expected [] = sortedArray(heights);
        int unmatchedIndices = 0;
        for(int index = 0; index < heights.length; index++){
            if(heights[index] != expected[index]){
                unmatchedIndices++;
            }
        }
        return unmatchedIndices;
    }
}