class Solution {

    public static int maxlen; 
    public List<String> removeInvalidParentheses(String s) {
        
        maxlen = 0;
        int ind = 0;
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        set.add("");
        rec(ind , s ,set , 0 , sb);
        return new ArrayList<>(set);
    }


    public static void rec(int ind , String s , Set<String> set , int count , StringBuilder sb){
        if(ind == s.length()) {
            if(count == 0){
                if(sb.length() > maxlen){
                    maxlen = sb.length();
                    set.clear();
                    set.add(sb.toString());

                }else if(sb.length() == maxlen){
                    set.add(sb.toString());
                }
            }
            return;
        }


        if(s.charAt(ind) == '('){
            sb.append('(');
            rec(ind+1 , s , set, count + 1 , sb); 
            sb.deleteCharAt(sb.length()-1);   
            rec(ind+1 , s , set , count  , sb); 

        }else if(s.charAt(ind) == ')'){
            
            if(count > 0){
                sb.append(')');
                rec(ind+1 , s , set , count - 1 , sb);
                sb.deleteCharAt(sb.length()-1);
                
            }
            rec(ind+1 , s , set  , count  , sb); 
              
        }else{
            sb.append(s.charAt(ind));
            rec(ind+1 , s , set , count , sb);
            sb.deleteCharAt(sb.length()-1); 
        }        
    }
}