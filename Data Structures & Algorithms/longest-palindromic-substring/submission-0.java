class Solution {
    public String longestPalindrome(String s) {
        int L = 0;
        int R = 0;
        int resIdx = 0;
        int resLen = 0;

        for(int i = 0; i < s.length(); i++) {
            L=i;
            R=i;
            while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if(R - L + 1 > resLen) {
                    resLen = R - L + 1;
                    resIdx = L;
                }
                L--;
                R++;
            }
            L=i;
            R=i+1;
            while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if(R - L + 1 > resLen) {
                    resLen = R - L + 1;
                    resIdx = L;
                }
                L--;
                R++;
            }
        }
        return s.substring(resIdx, resIdx + resLen);
    }
}
