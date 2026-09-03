class Solution {
    public int removeDuplicates(int[] nums) {
        int L = 0;
        int R = 0;

        while(R < nums.length) {

            if(nums[R] != nums[L] && R < nums.length){
                L++;
                nums[L] = nums[R];
            }
            if(nums[R] == nums[L] && R < nums.length) {
                R++;
            }
        }
        return L+1;
    }
}