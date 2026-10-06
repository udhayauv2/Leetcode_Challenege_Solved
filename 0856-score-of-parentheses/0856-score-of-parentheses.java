class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.peek() != '('){
                    int num = stack.pop()-'0';
                    while(stack.peek()!='('){
                        int num2 = stack.pop()-'0';
                        num = num + num2;
                    }
                    stack.pop();
                    num = num * 2;
                    stack.push((char)(num + '0'));
                    
                    
                }else{
                    stack.pop();
                    stack.push('1');
                }
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += (stack.pop()-'0');
        }
        return ans;
    }
}