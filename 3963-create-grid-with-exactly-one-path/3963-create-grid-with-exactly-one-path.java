class Solution {
    public String[] createGrid(int R, int C) {
        String[] ans = new String[R];
        String x = "";
        String y = "";
        for(int i=0;i<C;i++){
            x = x + ".";
            y = y + "#";
        }
        y = y.substring(0 , y.length()-1) + ".";
        ans[0] = x;
        for(int i=1;i<R;i++){
            ans[i] = y;
        }
        return ans;
    }
}