package ltc.stack;

import java.util.Stack;

public class LeetCode678 {
    public boolean checkValidString(String s) {
        if(s==null) return true;
        int len = s.length();
        if(len==1&&s.charAt(0)!='*') return false;

        Stack<Character> stack = new Stack<>();
        Stack<Character> star = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(' ||s.charAt(i) == '*') {
                stack.push(s.charAt(i));

            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek()!='*') {
                    stack.pop();
                }else{
                    while(stack.peek()=='*'){
                        star.push(stack.pop());
                    }
                    stack.pop();
                }
            }
        }

        while(!star.isEmpty()){
            if(!stack.isEmpty()){
                if (stack.peek() != '(') {
                    star.push(stack.pop());
                    continue;
                } else {
                    if(!star.isEmpty())
                        stack.pop();

                    star.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode678().checkValidString("(((((()*)(*)*))())())(()())())))((**)))))(()())()"));
        System.out.println(new LeetCode678().checkValidString("(((((*)))**"));
        System.out.println(new LeetCode678().checkValidString("(()(())()())*((()(())))*()(*)()()(*((()((*(*))))()*()(()((()(*((()))*(((())(())))*))(()*))(()*)"));
        System.out.println(new LeetCode678().checkValidString("((*)"));
    }
}
