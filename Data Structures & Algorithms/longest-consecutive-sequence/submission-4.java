class Solution {
     public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int curr = nums[0];
        int i = 0;
        int counter = 0;
        while(i < nums.length) {
            if(curr != nums[i]) {
                curr = nums[i];
                counter = 0;
            }

            while (i < nums.length && curr == nums[i]) {
                i++;
            }
            counter++;
            curr++;
            max = Math.max(max, counter);

        }
        return max;
    }
}
