class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') open++;
            else if(ch == ')' && open != 0 ) open--;
            else count++;
        }
        return open + count;
    }
}