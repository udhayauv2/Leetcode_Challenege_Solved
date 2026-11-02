class Solution {
    public int minMoves(int[] nums) {
        int N = nums.length;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
        }
        int ans = 0;
        for(int num : nums){
            ans += (num - min);
        }
        return ans;
    }
}