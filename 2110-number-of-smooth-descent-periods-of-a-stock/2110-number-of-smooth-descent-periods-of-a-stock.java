class Solution {
    public long getDescentPeriods(int[] prices) {
        long countDescent = prices.length;
        int countSubArray = 0;
        int originalIndex = 0;
        for(int index = 0; index < prices.length - 1;){
            int sdpIndex =  index + 1;
            if(sdpIndex == prices.length){
                break;
            }
            if(prices[index++] - prices[sdpIndex] == 1){
                countSubArray++;
            }
            else{
                countSubArray++;
                countDescent += (long)countSubArray * (countSubArray + 1) / 2;
                countDescent -= countSubArray;
                countSubArray = 0;
            }
        }
        if(countSubArray > 0){
            countSubArray++;
            countDescent += (long)countSubArray * (countSubArray + 1) / 2;
            countDescent -= countSubArray;
        }
        return countDescent;
    }
}