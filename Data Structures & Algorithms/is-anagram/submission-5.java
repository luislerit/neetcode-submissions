class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] input1 = s.toCharArray();
        Arrays.sort(input1);
        char[] input2 = t.toCharArray();
        Arrays.sort(input2);

        return Arrays.toString(input1).equals(Arrays.toString(input2));
    }
}
