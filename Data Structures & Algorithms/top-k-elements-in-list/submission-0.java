class Solution {
   public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> storage = new HashMap<>();
        int[] ans = new int[k];
        for (int i : nums) {
            if (storage.containsKey(i)) {
                storage.put(i, storage.get(i)+1);
            }
            storage.putIfAbsent(i, 1);
        }

        List<Map.Entry<Integer, Integer>> unsortedList = new ArrayList<>(storage.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comparator = (a, b) -> Integer.compare(b.getValue(),a.getValue());
        unsortedList.sort(comparator);

        for (int i = 0 ; i < k; i ++) {
            ans[i] = unsortedList.get(i).getKey();
        }
        return ans;
    }
}
