class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[]{0,0,0};

        for(int i = 0; i < nums.length; i++) {
            colors[nums[i]] += 1;
        }
        int L = 0;
        for(int i = 0; i < colors.length; i++) {
            for(int j = 0; j < colors[i]; j++) {
                nums[L++] = i;
            }
        }
    }
}