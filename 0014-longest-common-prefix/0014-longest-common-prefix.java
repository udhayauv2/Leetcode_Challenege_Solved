class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int len = Integer.MAX_VALUE;
        for(String str : strs){
            if(str.length() < len) len = str.length();
        }
        for(int i=0;i<len;i++){
            char ch = strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i)!=ch){
                    return ans;
                }
            }
            ans = strs[0].substring(0 , i+1);
        }
        return ans;
    }
}