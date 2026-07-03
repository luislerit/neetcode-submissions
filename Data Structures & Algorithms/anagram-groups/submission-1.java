class Solution {
    public List<List<String>> groupAnagrams(String[] input) {

        Map<String, List<String>> dictionary = new HashMap<>();
        String sortedVal = "";

        List<List<String>> result = new ArrayList<>();
         
        for (String val : input) {
            char[] sortedChar = val.toCharArray();
            Arrays.sort(sortedChar);
            sortedVal = Arrays.toString(sortedChar);
            if (!dictionary.containsKey(sortedVal)) {
                dictionary.put(sortedVal, new ArrayList<>());
            }
            dictionary.get(sortedVal).add(val);
        }

        Set<Map.Entry<String, List<String>>> entries = dictionary.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            result.add(entry.getValue());
        }
        return result;
    }
}
