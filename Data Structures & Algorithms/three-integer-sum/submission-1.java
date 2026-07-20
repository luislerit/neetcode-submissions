class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++) {
            if(i > 0 && nums[i-1] == nums[i]) {
                continue;
            }
            int L = i+1, R= nums.length-1;
            while(L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(sum== 0) {
                    result.add(new ArrayList<>(List.of(nums[i], nums[L], nums[R])));
                    do {
                        L++;
                    } while (nums[L] == nums[L - 1] && L < R);
                } else if (sum > 0) {
                    R--;
                } else if (sum < 0) {
                    L++;
                }
            }
        }
        return result;
    }
}
