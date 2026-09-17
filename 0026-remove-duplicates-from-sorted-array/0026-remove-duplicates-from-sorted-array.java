class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int ind = 0;
        while(right < nums.length){
            if(nums[left] != nums[right]){
                nums[ind++] = nums[left];
                left = right;
            }
            right++;

        }
        nums[ind++] = nums[left];
        return ind;
    }
}