class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans , nums[nums.length-1] - nums[2]);
        ans = Math.min(ans , nums[nums.length-2] - nums[1]);
        ans = Math.min(ans , nums[nums.length-3] - nums[0]);
        return ans;
    }
}