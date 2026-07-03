class Solution {
     public boolean hasDuplicate(int[] nums) {
        Set<Integer> dictionary = new HashSet<>();
        for (int num : nums) {
            if (dictionary.contains(num)) {
                return true;
            }
            dictionary.add(num);
        }
        return false;
    }
}