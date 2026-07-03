class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        Arrays.sort(char1);
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        return Arrays.toString(char1).equals(Arrays.toString(char2));
    }
}
