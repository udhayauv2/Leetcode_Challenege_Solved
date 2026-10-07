class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> seen = new HashSet<>();

        q.offer(s);
        seen.add(s);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int j = 0; j < size; j++) {
                String cur = q.poll();

                if (isValid(cur)) {
                    ans.add(cur);
                }

                if (!ans.isEmpty()) {
                    continue;
                }

                for (int i = 0; i < cur.length(); i++) {
                    if (cur.charAt(i) != '(' && cur.charAt(i) != ')')
                        continue;

                    String next = cur.substring(0, i) + cur.substring(i + 1);

                    if (seen.add(next)) {
                        q.offer(next);
                    }
                }
            }

            if (!ans.isEmpty())
                break;
        }

        return ans;
    }

    private boolean isValid(String s) {
        int balance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }

            if (balance < 0)
                return false;
        }

        return balance == 0;
    }
}