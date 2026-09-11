class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ind = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                ind = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(ind == -1) return nums.length;
        return ind;
    }
}