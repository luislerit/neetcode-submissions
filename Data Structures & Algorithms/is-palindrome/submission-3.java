class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder val = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                val.append(c);
            }
        }
        return val.toString().equalsIgnoreCase(val.reverse().toString());
    }
}
