class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String ,String> map = new HashMap<>();
        for(List<String> ls : knowledge){
            map.put(ls.get(0) , ls.get(1));
        }
        int ind = 0;
        int N = s.length();
        StringBuilder sb = new StringBuilder();
        while(ind < N){
            while(ind < N && s.charAt(ind) != '(' ){
                sb.append(s.charAt(ind));
                ind++;
            }
            StringBuilder key = new StringBuilder();
            ind++;
            while(ind < N && s.charAt(ind) != ')'){
                key.append(s.charAt(ind));
                ind++;
            }
            if(map.containsKey(key.toString())) sb.append(map.get(key.toString()));
            else if(key.length() != 0)sb.append("?");
            ind++;
        }
        return sb.toString();
    }
}