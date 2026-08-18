class Solution {
     public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            store.put(nums[i], store.getOrDefault(nums[i],0) +1);
        }
        List<int[]> seen = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : store.entrySet()) {
            seen.add(new int[]{entry.getValue(), entry.getKey()});
        }
        seen.sort((a,b) -> b[0]- a[0]);
        int[] answer = new int[k];
        for(int i = 0; i < k; i ++) {
            answer[i] = seen.get(i)[1];
        }
        return answer;
    }
}
