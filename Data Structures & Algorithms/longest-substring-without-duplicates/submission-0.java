class Solution {
   
   public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int L = 0, max = 0;
        for(int R = 0 ; R < s.length() ; R++) {
            while(seen.contains(s.charAt(R))) {
                seen.remove(s.charAt(L));
                L++;
            }
            seen.add(s.charAt(R));
            max = Math.max(max, R-L+1);
        }
        return max;
    }     
        
}
