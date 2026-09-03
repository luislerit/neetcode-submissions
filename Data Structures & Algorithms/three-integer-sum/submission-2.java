class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            int curr = nums[i];

            if(i >0 && nums[i] == nums[i-1]) {
                continue;
            }

            int L = i+1, R = nums.length -1;
            while(L < R) {
                int twoSum = nums[L] + nums[R] + curr;
                if (twoSum == 0) {
                    result.add(List.of(nums[L], nums[R], curr));
                    L++;
                    R--;
                    while (L < R && nums[R] == nums [R+1]) {
                        R--;
                    }
                    while (L < R && nums[L] == nums [L-1]) {
                        L++;
                    }
                } else if (twoSum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return result;
    }
}
