class Solution {
    public int[] resultArray(int[] nums) {
        int N = nums.length;       
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int right = 0;
        int left = 0;
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<N;i++){
            if(l1.get(left) > l2.get(right)){
                l1.add(nums[i]);
                left++;
            }else{
                l2.add(nums[i]);
                right++;
            }
        }
        int ind = 0;
        for(int num : l1){
            nums[ind++] = num;
        }
        for(int num : l2){
            nums[ind++] = num;
        }
        return nums;
        

    }
}