class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> remainderMap = new HashMap<>();
        int difference = 0;

        for(int i = 0 ; i < nums.length; i++) {
            difference = target - nums[i];
            if(remainderMap.containsKey(difference)) {
                return new int[]{remainderMap.get(difference),i};
            } else {
                remainderMap.put(nums[i], i);
            }
        }
        return null;
    }
}
