class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> store = new HashMap<>();
        for(int i : nums) {
            store.merge(i, 1, Integer::sum);
        }
        Map<Integer, Integer> collect = store.entrySet().stream().sorted(
                Map.Entry.<Integer, Integer>comparingByValue().reversed()
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));
        int[] result = new int[k];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry: collect.entrySet()) {
            if(i < k) {
                result[i] = entry.getKey();
            }
            i++;
        }
        return result;
    }
}
