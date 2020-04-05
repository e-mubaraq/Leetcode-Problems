/** 
Best Time to Buy and Sell Stock II
**/

class Solution {
    public int maxProfit(int[] prices) {
        
        int i, profit = 0;
        int maximumProfit = 0;
        
        for (i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                profit = prices[i+1] - prices[i];
                maximumProfit = maximumProfit + profit;
            }
        }
        
        return maximumProfit;
    }
}
