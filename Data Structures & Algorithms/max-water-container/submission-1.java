class Solution {
    public int maxArea(int[] heights) {
        int L = 0;
        int R = heights.length-1;
        int distance = 0;
        int maxHeight = 0;
        int currHeight = 0;

        while(L<R){
            distance = R-L;
            currHeight = Math.min(heights[L], heights[R]) * distance;
            maxHeight = Math.max(maxHeight, currHeight);

            if(heights[L] < heights[R]) {
                L++;
            } else if (heights[L] > heights[R]) {
                R--;
            } else {
                L++;
                R--;
            }
        }
        return maxHeight;
    }
}
