class Solution {
    public boolean isPalindrome(String s) {

        String input = s.toLowerCase();
        int L = 0, R = s.length()-1;
        while(L<R) {
            while(!Character.isLetterOrDigit(input.charAt(L)) && L<R) {
                L++;
            }
            while(!Character.isLetterOrDigit(input.charAt(R)) && L<R) {
                R--;
            }
            if(input.charAt(R)!= input.charAt(L)) {
                return false;
            }
            L++;
            R--;
        }

        return true;
    }
}
