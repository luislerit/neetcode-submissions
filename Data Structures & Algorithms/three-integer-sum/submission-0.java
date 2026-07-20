class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-2 ; i++) {
            for(int j = i+1 ; j < nums.length-1; j++) {
                for(int k = j+1 ; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        result.add(List.of(nums[i], nums[j],nums[k]));
                    }
                }
            }
        }
        return result.stream().toList();
    }
}
