class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap();
        int diff = 0;
        int current = 0;
        
        for(int i = 0 ; i < nums.length ; i++) {
            current = nums[i];
            diff = target - current;
            if(seen.containsKey(diff)) {
                return new int[]{seen.get(diff), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
