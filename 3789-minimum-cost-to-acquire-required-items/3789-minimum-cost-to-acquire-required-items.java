class Solution {
    public long minimumCost(long cost1, long cost2, long costBoth, long need1, long need2) {
        long first = (cost1*need1) + (cost2*need2);
        long second = Math.max(need1 , need2)*costBoth;
        long min =  Math.min(first , second);
        if(need1 > need2){
            long x = need2 * costBoth;
            x += (need1-need2) * cost1;
            min = Math.min(min  ,x);
        }else{
            long x = need1*costBoth;
            x += (need2-need1) * cost2;
            min = Math.min(min  ,x);
        }
        return min;
    }
}