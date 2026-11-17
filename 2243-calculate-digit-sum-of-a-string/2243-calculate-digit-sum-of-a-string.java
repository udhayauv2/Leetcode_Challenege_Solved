class Solution {
    public String digitSum(String s, int k) {
        int len = s.length();
        while(len > k){
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            int val = 0;
            for(char ch : s.toCharArray()){
                val += (ch-'0');
                cnt++;
                if(cnt == k){
                    sb.append(String.valueOf(val));
                    val = 0;
                    cnt=0;
                }
            }
            if(cnt > 0){
                sb.append(String.valueOf(val));
            }
            s = sb.toString();
            len = s.length();
        }
        return s;
    }
}