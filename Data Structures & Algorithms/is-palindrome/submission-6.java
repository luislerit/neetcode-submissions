class Solution {
    public boolean isPalindrome(String s) {
        int L = 0;
        int R = s.length()-1;

        while(L < R) {
            while(L < R && !isAplaNumeric(s.charAt(L))) {
                L++;
            }
            while(L < R && !isAplaNumeric(s.charAt(R))) {
                R--;
            }

            if(s.toLowerCase().charAt(L) != s.toLowerCase().charAt(R)) {
                return false;
            }

            L++;
            R--;
        }
        return true;
    }

    public boolean isAplaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
        (c >= 'A' && c <= 'Z') ||
        (c >= '0' && c <= '9');
    }
}
