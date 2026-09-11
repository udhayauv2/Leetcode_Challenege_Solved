class Solution {
    static Set<Integer> set;
    public void rec(int[] arr , int size , int sum , boolean[] visited){
        if(size == 3){
            if(sum%2 == 0) set.add(sum);
            return;
        }
    
        for(int i=0;i<arr.length;i++){
            if(size == 0 && arr[i] == 0) continue;
            if(!visited[i]){
                visited[i] = true;
                sum = sum*10 + arr[i];
                rec(arr , size+1 , sum , visited);
                sum = sum/10;
                visited[i] = false;
            }
        }
        return;
        
    }
    public int totalNumbers(int[] digits) {
        boolean[] visited = new boolean[digits.length];
        set = new HashSet<>();
        rec(digits , 0 , 0 , visited);
        return set.size();
    }
}