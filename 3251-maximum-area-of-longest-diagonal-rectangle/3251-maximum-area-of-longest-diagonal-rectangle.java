class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagonalLength = Integer.MIN_VALUE;
        int maximumArea = Integer.MIN_VALUE;
        int maximumIndex = -1;
        boolean equalFlag = false;
        for(int row = 0; row < dimensions.length; row++){
            int dLength = dimensions[row][0] * dimensions[row][0] + dimensions[row][1] * dimensions[row][1];

            if(dLength > diagonalLength){
                diagonalLength = dLength;
                int mArea = dimensions[row][0] * dimensions[row][1];
                if(mArea > maximumArea){
                    maximumArea = mArea;
                }
                maximumIndex = row;
                equalFlag = false;
            }
            else if(dLength == diagonalLength){
                int mArea = dimensions[row][0] * dimensions[row][1];
                if(mArea > maximumArea){
                    maximumArea = mArea;
                }
                equalFlag = true;
            }
        }
        if(equalFlag){
            return maximumArea;
        }
        return dimensions[maximumIndex][0] * dimensions[maximumIndex][1];
    }
}