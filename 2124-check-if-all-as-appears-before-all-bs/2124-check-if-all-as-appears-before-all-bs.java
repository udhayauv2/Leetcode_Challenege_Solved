class Solution {
    public boolean checkString(String s) {
        boolean is = false;
        for(char ch : s.toCharArray()){
            if(!is && ch == 'a') continue;
            else if(!is && ch == 'b') is = true; 
            else if(is && ch == 'a') return false;
        }
        return true;
    }
}