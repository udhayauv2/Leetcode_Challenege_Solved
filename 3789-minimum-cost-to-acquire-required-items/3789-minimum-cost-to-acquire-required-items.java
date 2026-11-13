class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long first = (long)cost1*need1 + (long)cost2*need2;
        long second = (long)Math.max(need1 , need2)*costBoth;
        long min =  Math.min(first , second);
        if(need1 > need2){
            long x = (long)need2 * costBoth;
            x += (long)(need1-need2) * cost1;
            min = Math.min(min  ,x);
        }else{
            long x = (long)need1*costBoth;
            x += (long)(need2-need1) * cost2;
            min = Math.min(min  ,x);
        }
        return min;
    }
}