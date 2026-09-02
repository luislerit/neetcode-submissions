class Solution {
    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        

        for(int i = 0; i < nums.length ; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                if(i != j) {
                    sum += nums[j];
                    if(sum == k) {
                        counter++;
                    }
                } else if (i == j) {
                    if (nums[i] == k) {
                        counter++;
                    }
                    sum = nums[i];
                }
            }
            
        }
        return counter;
    }
}