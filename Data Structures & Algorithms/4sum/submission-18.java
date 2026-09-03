class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int L1 = 0;
        int R1 = nums.length -1;
        long totalSum = 0;
        Arrays.sort(nums);
        List<List<Integer>> unique = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(i > 0 && nums[i]== nums[i-1]){
                continue;
            }
            for(int j = i+1; j < nums.length; j++){
                if(j > i+1 && nums[j]== nums[j-1] ){
                continue;
                }
                L1 = j+1;
                R1 = nums.length -1;
                while(L1 < R1) {
                    totalSum =(long) nums[i] + nums[j] + nums[L1] + nums[R1];
                    if(totalSum == target) {
                        unique.add(new ArrayList<>(List.of(nums[i], nums[j], nums[L1], nums[R1])));
                        L1++;
                        while(nums[L1] == nums[L1-1] && L1<R1) {
                            L1++;
                        }
                    } else if (totalSum > target) {
                        R1--;
                    } else {
                        L1++;
                    }
                }
            }
        }    
        return unique;   
    }
}