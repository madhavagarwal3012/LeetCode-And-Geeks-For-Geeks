class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = Integer.MAX_VALUE;
        int maximumProfit = Integer.MIN_VALUE;

        for(int index = 0; index < prices.length; index++){
            if(prices[index] < minimumPrice){
                minimumPrice = prices[index];
            }
            if(prices[index] - minimumPrice > maximumProfit){
                maximumProfit = prices[index] - minimumPrice;
            }
        }
        return maximumProfit;
    }
}