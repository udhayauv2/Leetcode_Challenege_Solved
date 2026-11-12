
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int max = 1;
        boolean greater = true;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                if (greater) {
                    count++;
                } else {
                    count = 2;
                    greater = true;
                }
            }
            else if (nums[i] < nums[i - 1]) {
                if (!greater) {
                    count++;
                } else {
                    count = 2;
                    greater = false;
                }
            }
            else {
                count = 1;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
