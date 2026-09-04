class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0;
        int R = 0;
        Set<Character> seen = new HashSet<>();
        int maxDistance = 0;

        while(R < s.length()){
            while(seen.contains(s.charAt(R))) {
                seen.remove(s.charAt(L));
                L++;
            }
            seen.add(s.charAt(R));
            maxDistance = Math.max(maxDistance, R-L+1);
            R++;
        }
        
        return maxDistance;
    }
}
