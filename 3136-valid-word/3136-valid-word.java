class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int v=  0;
        int c = 0;
        int con = 0;
        int chcount = 0;
        for(char ch : word.toCharArray()){
            if(Character.isLetter(ch)){
                
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                }else{
                    c++;
                }
            }else if(Character.isDigit(ch)){
                con++;
            }else{
                return false;
            }
        }  
        if(v > 0 && c > 0) return true;
        return false;
    }
}