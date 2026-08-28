class Solution {
    public boolean checkDivisibility(int num) {
        int x = num;
       int sum = 0;
       int pro = 1;
       while(num > 0){
        int dig = num % 10;
        sum += dig;
        pro *= dig;
        num/=10;
       }
       if(x % (sum + pro) == 0) return true;
       return false;
    }
}