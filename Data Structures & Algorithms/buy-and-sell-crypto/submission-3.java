class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int L = 0;
        int R = 0;
        while(R < prices.length) {
            int currProfit = prices[R] - prices[L];
            if(prices[R]>prices[L]){
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                L=R;
            }
            R++;
        }
        return maxProfit;

    }
}
