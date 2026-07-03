class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> remainderMap = new HashMap<>();
        int difference = 0;

        for(int i = 0 ; i < nums.length; i++) {
            difference = target - nums[i];
            if(remainderMap.containsKey(difference)) {
                int remainderIndex = remainderMap.get(difference);
                int minIndex = Math.min(i,remainderIndex);
                int maxIndex = Math.max(i,remainderIndex);
                return new int[]{minIndex,maxIndex};
            } else {
                remainderMap.put(nums[i], i);
            }
        }
        return null;
    }
}
