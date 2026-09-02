class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pair = new HashMap<>();
        int remaining = 0;
        for(int i = 0; i < nums.length; i++) {
            remaining = target - nums[i];
            if(pair.containsKey(remaining)) {
                return new int[]{pair.get(remaining), i};
            } 
            pair.put(nums[i], i);
        }

        return new int[]{};
    }
}
