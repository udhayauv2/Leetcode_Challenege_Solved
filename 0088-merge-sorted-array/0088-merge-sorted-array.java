class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind=0;
        for(int i=m;i<(m+n) && ind<n;i++){
            nums1[i]=nums2[ind++];
        }
        Arrays.sort(nums1);
        
    }
}