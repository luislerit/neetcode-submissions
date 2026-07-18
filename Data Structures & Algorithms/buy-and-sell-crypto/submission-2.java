class Solution {
     public int maxProfit(int[] prices) {

        int L = 0, max =0, R = 1, currentDiff = 0;
        while(R < prices.length) {
            currentDiff = prices[R] - prices[L];
            max = Math.max(max, currentDiff);
    
            while (prices[R] < prices[L])
                L++;
            R++;
        
        }
        return max;
    }
}
