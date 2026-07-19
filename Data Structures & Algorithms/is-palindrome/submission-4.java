class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder val = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(isAlphaNum(c)) {
                val.append(c);
            }
        }
        return val.toString().equalsIgnoreCase(val.reverse().toString());
    }

    public boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                c >= '0' && c <= '9';
    }
}
