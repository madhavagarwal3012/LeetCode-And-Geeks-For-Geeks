class Solution {
    public int[] finalPrices(int[] prices) {
        for(int index = 0; index < prices.length; index++){
            for(int subIndex = index + 1; subIndex < prices.length; subIndex++){
                if(prices[subIndex] <= prices[index]){
                    prices[index] = prices[index] - prices[subIndex];
                    break;
                }
            }
        }
        return prices;
    }
}