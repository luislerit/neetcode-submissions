class Solution {
     public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> pair = new HashMap<>();
        
        for (int i = 0 ; i < nums.length ; i++) {
            if (pair.containsKey(nums[i])) {
                if (Math.abs(i - pair.get(nums[i])) <= k) {
                    return true;
                }
            }
            pair.put(nums[i], i);
        }
        return false;
    }
}