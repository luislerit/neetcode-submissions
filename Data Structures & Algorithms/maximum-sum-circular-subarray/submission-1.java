class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0];
        int globMin = nums[0];
        int currMax = 0;
        int currMin = 0;
        int total = 0;
        for (int n : nums) {
            currMin = Math.min(currMin + n, n);
            globMin = Math.min(globMin, currMin);
            currMax = Math.max(currMax + n, n);
            globMax = Math.max(globMax, currMax);
            total += n;
        }
        return globMax > 0 ? Math.max(total - globMin, globMax) : globMax;
    }
}