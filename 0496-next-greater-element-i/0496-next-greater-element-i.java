class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] stack = new int[nums2.length];
        int top = -1;
        int[] nge = new int[10001];
        for(int i=nums2.length-1;i >= 0; i--){
            while(top >= 0 && stack[top] <= nums2[i]) top--;
            if(top == -1) nge[nums2[i]] = -1;
            else nge[nums2[i]] = stack[top];
            stack[++top] = nums2[i];
        }
        
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = nge[nums1[i]];
        }
        return ans;
    }
}