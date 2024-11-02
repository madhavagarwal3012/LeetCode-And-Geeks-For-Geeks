class Solution {
    public int[] finalPrices(int[] prices) {
        int pricesAfterDiscount [] = new int[prices.length];
        for(int index = 0; index < prices.length; index++){
            boolean checkDiscount = false;
            for(int subIndex = index + 1; subIndex < prices.length; subIndex++){
                if(prices[subIndex] <= prices[index]){
                    pricesAfterDiscount[index] = prices[index] - prices[subIndex];
                    checkDiscount = true;
                    break;
                }
            }
            if(!checkDiscount){
                pricesAfterDiscount[index] = prices[index];
            }
        }
        return pricesAfterDiscount;
    }
}