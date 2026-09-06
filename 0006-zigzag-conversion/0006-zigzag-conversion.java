class Solution {
    public String convert(String str, int R) {
        List<List<Character>> list = new ArrayList<>();
        for(int i=0;i<R;i++){
            list.add(new ArrayList<>());
        }
        int N = str.length();
        int ind = 0;
        int row = 0;
        boolean top = true;
        boolean bottom = false;
        while(ind < N){
            if(top){
                for(int i=0;i<R;i++){
                    if(ind >= N) break;
                    list.get(i).add(str.charAt(ind++));    
                }
                bottom = true;
                top = false;
            }else if(bottom){
                for(int i=R-2;i>0;i--){
                    if(ind >= N) break;
                    list.get(i).add(str.charAt(ind++));
                    
                }
                top = true;
                bottom = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(List<Character> l : list){
            for(char ch : l){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}