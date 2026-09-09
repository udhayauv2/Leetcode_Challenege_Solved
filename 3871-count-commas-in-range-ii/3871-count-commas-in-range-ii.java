class Solution {
    public long countCommas(long num) {

        long count = 0;

        if (num >= 1000) {
            count += num - 999;
        }

        if (num >= 1000000) {
            count += (num - 999999);
        }

        if (num >= 1000000000) {
            count += (num - 999999999);
        }

        if (num >= 1000000000000L) {
            count += (num - 999999999999L);
        }

        if (num >= 1000000000000000L) {
            count += (num - 999999999999999L);
        }

        return count;
    }
}