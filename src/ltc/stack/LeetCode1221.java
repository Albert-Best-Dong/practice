package ltc.stack;

import java.util.Stack;

public class LeetCode1221 {
    public int balancedStringSplit(String s) {
        int ans =0;
        int count = 1;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        if(s.length()==1) return ans;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != stack.peek()) {
                ans = ans + 1;
                i = i + count;
                if(i<s.length())
                    stack.push(s.charAt(i));
                count = 1;
            } else {
                count = count + 1;
            }
        }
        stack.removeAllElements();

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1221().balancedStringSplit("RLRRRLLRLL"));
    }
}
