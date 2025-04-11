class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int countSI = 0;
        String endingPointNumber = "" + high;
        if(endingPointNumber.length() % 2 == 1){
            high = (int)Math.pow(10, endingPointNumber.length() - 1) - 1;
        }
        while(low <= high){
            String startingPointNumber = "" + low;
            if(startingPointNumber.length() % 2 == 1){
                low = (int)Math.pow(10, startingPointNumber.length());
            }
            else if(startingPointNumber.length() % 2 == 0){
                int leftDigitsSum = 0;
                int rightDigitsSum = 0;
                for(int startingIndex = 0, endingIndex = startingPointNumber.length() - 1; startingIndex < endingIndex; startingIndex++, endingIndex--){
                    leftDigitsSum += Character.getNumericValue(startingPointNumber.charAt(startingIndex));
                    rightDigitsSum += Character.getNumericValue(startingPointNumber.charAt(endingIndex));
                }
                if(leftDigitsSum == rightDigitsSum){
                    countSI++;
                }
            }
            low++;
        }
        return countSI;
    }
}