class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");
        char[] carr = pattern.toCharArray();
        if(arr.length != carr.length) return false;

        Map<Character , String> map = new HashMap<>();
        Map<String , Character> rmap = new HashMap<>();

        for(int i=0;i<carr.length;i++){
            if(map.containsKey(carr[i])){
                if(!map.get(carr[i]).equals(arr[i])) return false;    
            }else{
                if(rmap.containsKey(arr[i])) return false;
                map.put(carr[i] , arr[i]);
                rmap.put(arr[i] , carr[i]);
            }
        }
        return true;
    }
}