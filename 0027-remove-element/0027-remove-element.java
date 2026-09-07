class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        
        while(right < nums.length){
            if(nums[right] != val){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
        return left;
    }
}