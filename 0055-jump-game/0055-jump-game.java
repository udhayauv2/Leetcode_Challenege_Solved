class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(max == 0) return false;
            max = max - 1;
            max = Math.max(max , nums[i]);
        }
        return true;
    }
}