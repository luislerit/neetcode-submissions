class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setOfNums = new HashSet<>();
        
        for(int num : nums) {
            if (setOfNums.contains(num)) {
                return true;
            } else {
                setOfNums.add(num);
            }
        }
        return false;
    }
}
