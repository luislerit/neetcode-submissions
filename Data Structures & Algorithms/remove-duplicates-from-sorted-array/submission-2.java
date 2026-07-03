class Solution {
        public int removeDuplicates(int[] nums) {

          int L = 0;
          int R = 1;
          int counter = 0;

        while (R < nums.length) {
            if(nums[L] != nums[R]) {
               L++;
               nums[L] = nums[R];
            }
            if(nums[L] == nums[R]) {
               R++;
            }
            
        }
        

        return L+1;
    }

}