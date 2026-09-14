class Solution {
    private int bs(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] > target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int[] arr : grid){
            int ind = bs(arr , -1);
            if(ind < arr.length && ind >= 0) ans += (arr.length-ind);
            
        }
        return ans;
    }
}