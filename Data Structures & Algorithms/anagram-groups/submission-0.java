class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> dictionary = new HashMap<>();

        for (String name : strs) {
            char[] chars = name.toCharArray();  // Convert to char array
            Arrays.sort(chars);  // Sort characters in place

            // Convert the sorted char array back to string
            String sortedName = new String(chars);

            if (dictionary.containsKey(sortedName)) {
                dictionary.get(sortedName).add(name);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(name);
                dictionary.put(sortedName, newList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> val :  dictionary.values()) {
            result.add(val);
        }

        return result;
    }
}
