class Solution {
    public int maxScore(String s) {
        int N = s.length();
        int[] left = new int[N];
        int[] right = new int[N];
        left[0] = s.charAt(0) == '0' ? 1 :0;
        right[N-1] = s.charAt(N-1) == '1' ? 1 : 0;
        for(int i=1;i<N;i++){
            if(s.charAt(i) == '0') left[i] = left[i-1]+1;
            else left[i] = left[i-1];
        }
        for(int i=N-2;i>=0;i--){
            if(s.charAt(i) == '1') right[i] = right[i+1]+1;
            else right[i] = right[i+1];
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<N-1;i++){
            ans = Math.max(ans , left[i]+right[i+1]);
        }
        return ans;
    }
}