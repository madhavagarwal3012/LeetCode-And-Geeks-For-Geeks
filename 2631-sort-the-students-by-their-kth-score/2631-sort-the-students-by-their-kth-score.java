class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int rowCount = 0; rowCount < score.length; rowCount++){
            int maximumValue = Integer.MIN_VALUE;
            int maximumValueIndex = 0;
            for(int rowIndex = rowCount; rowIndex < score.length; rowIndex++){
                if(score[rowIndex][k] > maximumValue){
                    maximumValue = score[rowIndex][k];
                    maximumValueIndex = rowIndex;
                }
            }
            for(int columnCount = 0; columnCount < score[0].length; columnCount++){
                int temp = score[maximumValueIndex][columnCount];
                score[maximumValueIndex][columnCount] = score[rowCount][columnCount];
                score[rowCount][columnCount] = temp;
            }
        }
        return score;
    }
}