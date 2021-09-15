import java.util.Stack;

public class kuohao {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (!stack.isEmpty()) {
                if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == '}' && stack.peek() == '{')) {
                    stack.pop();
                    continue;
                }else{
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }

        }

        if(stack.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
