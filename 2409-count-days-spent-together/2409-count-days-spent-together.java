
class Solution {
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        String start = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;
        String end = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;

        int a = convert(start);
        int b = convert(end);

        return Math.max(0, b - a + 1);
    }

    int convert(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}
