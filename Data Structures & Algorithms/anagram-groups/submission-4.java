class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[] sortedString;
        Map<String, List<String>> grouping = new HashMap<>();

        for(String i : strs) {
            sortedString = i.toCharArray();
            Arrays.sort(sortedString);
            String key = String.valueOf(sortedString);
            if(!grouping.containsKey(key)) {
                grouping.put(key, new ArrayList<>());
            }
            grouping.get(key).add(i);
        }
        return new ArrayList<>(grouping.values());
    }
}
