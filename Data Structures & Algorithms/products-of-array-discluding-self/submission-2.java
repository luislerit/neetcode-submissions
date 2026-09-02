class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] result = new int[nums.length];
        int L = 1;
        int R = 1;
        pre[0] = 1;
        post[nums.length-1] = 1;
        for(int i = 0; i < nums.length-1; i++) {
            pre[i+1] = nums[i] * pre[i];
        }
        for(int i = nums.length-1; i > 0; i --) {
            post[i-1] = nums[i] * post[i];

        }

        for(int i = 0 ; i < nums.length; i++){
            result[i] = pre[i] * post[i];
        }

        return result;
    }
}  
