class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        int ind=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                sum=sum*nums[i];
            }else{
                ind=i;
                count++;
            }
        }
        if(count==nums.length){
            return nums;
        }if(count>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        if(ind!=-1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=sum;
                }else{
                    nums[i]=0;
                }
            }
            return nums; 
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[i]=sum/nums[i];
        }
        return nums;
    }
}