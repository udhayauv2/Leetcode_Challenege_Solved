class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i == calc(nums[i])) return i;
        }
        return -1;
    }
    private int calc(int num){
        int ans = 0;
        while(num > 0){
            ans += (num%10);
            num /= 10;
        }
        return ans;
    }
}