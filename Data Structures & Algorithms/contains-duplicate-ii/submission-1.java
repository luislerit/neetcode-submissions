class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> pair = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(pair.containsKey(nums[i])) {
                int index = pair.get(nums[i]);
                if(Math.abs(index - i) <= k) {
                    return true;
                }
            }
            pair.put(nums[i], i);
        }
        return false;
    }
}