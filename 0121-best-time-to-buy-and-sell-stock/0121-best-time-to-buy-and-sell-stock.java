class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num : prices){
            min = Math.min(min , num);
            ans = Math.max(ans , num-min);
        }
        return ans;
    }
}