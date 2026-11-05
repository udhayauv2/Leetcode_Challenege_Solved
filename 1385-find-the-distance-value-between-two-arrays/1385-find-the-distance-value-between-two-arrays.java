class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int num1 : arr1){
            boolean is = true;
            for(int num2 : arr2){
                if(Math.abs(num1-num2) <= d) {
                    is = false;
                    break;
                }
            }
            if(is)ans++;
        }
        return ans;
    }
}