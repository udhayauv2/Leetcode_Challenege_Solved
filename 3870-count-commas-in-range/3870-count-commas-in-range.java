class Solution {
    public int countCommas(int num) {
        int count = 0;
        if(num < 1000){
            return count;
        }
        if(num <= 100000){
            count += num - 999;
            return count;
        }
        return count;
    }
}