class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        if (Arrays.equals(charS, charT)) {
            return true;
        }
        else {
            return false;
        }
    }
}
