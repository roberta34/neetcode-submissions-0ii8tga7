class Solution {
    public int maxProfit(int[] prices) {
        int minLocal = prices[0];
        int maxLocal = 0;  
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minLocal) {
                minLocal = prices[i];
            }
            else {
                if(prices[i] - minLocal > maxLocal) {
                     maxLocal = prices[i] - minLocal;
                }
            }
        }
        return maxLocal;
    }
}