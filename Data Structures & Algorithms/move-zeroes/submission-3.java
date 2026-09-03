class Solution {
    public void moveZeroes(int[] nums) {
        int position =0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                temp = nums[position];
                nums[position] = nums[i];
                nums[i] = temp;
                position++;
             
            }
        }
    }
}