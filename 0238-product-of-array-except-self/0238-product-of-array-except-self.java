class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];
        prefix[0] = nums[0];
        suffix[N-1] = nums[N-1];
        for(int i=1;i<N;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        for(int i=N-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        for(int i=0;i<N;i++){
            nums[i] = (i-1 < 0 ? 1 : prefix[i-1]);
            nums[i] *= (i+1 >= N ? 1 : suffix[i+1]);
        }
        return nums;
    }
}