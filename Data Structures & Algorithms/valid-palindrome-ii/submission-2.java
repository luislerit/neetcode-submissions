class Solution {
    public boolean validPalindrome(String s) {
        int L = 0;
        int R = s.length()-1;

        while(L < R) {
            if(s.charAt(L) != s.charAt(R)) {
                return isPalindrome(s, L, R-1) || isPalindrome(s,L+1,R);
            }
            else if(s.charAt(L) == s.charAt(R)) {
                L++;
                R--;
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}