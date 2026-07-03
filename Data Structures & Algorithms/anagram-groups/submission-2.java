class Solution {
    public List<List<String>> groupAnagrams(String[] input) {

        Map<String, List<String>> dictionary = new HashMap<>();
        String sortedVal = "";
         
        for (String val : input) {
            char[] sortedChar = val.toCharArray();
            Arrays.sort(sortedChar);
            sortedVal = Arrays.toString(sortedChar);
            if (!dictionary.containsKey(sortedVal)) {
                dictionary.put(sortedVal, new ArrayList<>());
            }
            dictionary.get(sortedVal).add(val);
        }

        return new ArrayList<>(dictionary.values());
    }
}
