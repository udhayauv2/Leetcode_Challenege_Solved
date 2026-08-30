class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int min = 0;
        int max = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] < nums[min]) {
                min = i;
            }

            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        int left = Math.min(min, max);
        int right = Math.max(min, max);

        int a = right + 1;
        int b = n - left;
        int c = left + 1 + n - right;

        return Math.min(a, Math.min(b, c));
    }
}