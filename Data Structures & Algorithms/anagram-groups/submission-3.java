class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> store = new HashMap<>();

        for (String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String sortedString = Arrays.toString(sorted);
            store.putIfAbsent(sortedString, new ArrayList<>());
            store.get(sortedString).add(s);
        }
        return new ArrayList<>(store.values());
    }
}
