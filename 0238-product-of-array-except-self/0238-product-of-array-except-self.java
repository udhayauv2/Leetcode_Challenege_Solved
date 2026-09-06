class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] ans = new int[N];
        int pro = 1;
        for(int i=0;i<N;i++){
            ans[i] = pro;
            pro *= nums[i];
        }
        pro = 1;
        for(int i=N-1;i>=0;i--){
            ans[i] *= pro;
            pro *= nums[i];
        }
        return ans;
    }
}